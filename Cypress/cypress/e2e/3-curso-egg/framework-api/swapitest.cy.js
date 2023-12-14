describe('Star Wars API', () => {
    //Se Configura la URL Base para cada ejecucion 
    beforeEach(() => {
        cy.config({ baseUrl: 'https://swapi.dev/api' });        
    });     
    
    //Testeo del Endpoint People/2.
    it('Test people/2 endpoint', () => {
        cy.request('/people/2/')
          .should((response) => {
            expect(response.status).to.eq(200);
            expect(response.body.skin_color).to.eq('gold');
            expect(response.body.films).to.have.length(6);
          });
    });        

    //Testeo del Endpoint Films/algo.
    it('Segundo Film de People/2', () => {
        cy.request('/people/2/').then((personResponse) => {
              // Obtengo la URL del Segundo Film
            const secondFilmUrl = personResponse.body.films[1];
    
             // Hago el Request del Segundo Film de la Fecha (***)
            cy.request(secondFilmUrl).then((filmResponse) => {
            const expectedDateFormat = /^\d{4}-\d{2}-\d{2}$/;
    
            // Verifico la fecha y el formato
            expect(filmResponse.body.release_date).to.match(expectedDateFormat);
    
            // Obtengo y comparo los elementos pertencientes al endpont Films
            expect(filmResponse.body.characters.length).to.be.greaterThan(1);
            expect(filmResponse.body.planets.length).to.be.greaterThan(1);
            expect(filmResponse.body.starships.length).to.be.greaterThan(1);
            expect(filmResponse.body.vehicles.length).to.be.greaterThan(1);
            expect(filmResponse.body.species.length).to.be.greaterThan(1);
          });
        });
    });

    it('Datos de Planeta 1 de Film 6', () => {
        cy.fixture('datosPlanetasSwapi.json').then((datos) => {
          cy.request('/films/6').then((filmResponse) => {
            // Saco la URL del primer planeta del film 6
            const firstPlanetUrl = filmResponse.body.planets[0];
      
            // Hago el request del Body
            cy.request(firstPlanetUrl).then((planetResponse) => {
                // Comparo con los datos del Fixture
                expect(planetResponse.body.gravity).to.eq(datos.gravity);
                expect(planetResponse.body.terrain).to.eql(datos.terrain);
      
                //EXTRA - Comparo los cuerpos enteros dos veces, para evitar un check por coincidencia
                cy.request(planetResponse.body.url).then((secondPlanetResponse) => {
                // Verificar que los cuerpos de las respuestas sean idénticos
                expect(secondPlanetResponse.body).to.deep.eq(planetResponse.body);
                });
                });
            });
        });
    });

    it('Film No Existente - 404', () => {
        cy.request({
          url: '/films/7',
          //Esta Linea es necesaria, porque sino Cypress, por mas que reciba un 404, fallará el test.
          failOnStatusCode: false
        }).then((response) => {
          expect(response.status).to.eq(404);
        });
      });
          
    
    afterEach(() => {
        cy.clearCookies();
        cy.clearLocalStorage();
    });    
});

/*
***:
Ese monton de letras raras es una Expresion Regular que corresponde a un formato de fecha
YYYY-MM-DD.

La expresión regular utiliza los siguientes caracteres especiales:

^: Indica el comienzo de la expresión regular.
$: Indica el final de la expresión regular.
\d: Coincide con cualquier dígito.
{n}: Indica que n debe repetirse.
En este caso, la expresión regular coincide con una cadena de caracteres que contiene cuatro dígitos, seguidos de dos dígitos, seguidos de dos dígitos. Por ejemplo, la siguiente cadena coincide con la expresión regular:

2023-08-23
*/