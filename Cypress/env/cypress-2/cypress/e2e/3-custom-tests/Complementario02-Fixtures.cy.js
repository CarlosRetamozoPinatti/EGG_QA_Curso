describe('Testeo de Fixtures', () => {
    beforeEach(() => {
        // Voy a la pagina a testear
        cy.visit('http://uitestingplayground.com/sampleapp');        
    });

    //Datos para la forma 2 - Funciones Reusables
    const loginUser = (userData) => {
        cy.get('input[name="UserName"]').type(userData.username);
        cy.get('input[name="Password"]').type(userData.password);
        cy.get('#login').click();
      };

    //Datos para la forma 3 - POM
    const LoginPage = {
        usernameInput: () => cy.get('input[name="UserName"]'),
        passwordInput: () => cy.get('input[name="Password"]'),
        loginButton: () => cy.get('#login'),
        errorMessage: () => cy.get('#loginstatus'),
      };

      //--------------- FORMA 1 --------------- 

    it('Logueo Correcto - Forma 1', () => {
        //Leo el fixture
        cy.fixture('fixtureComp02.json').then((fixtureData) => {
            const datosBien = fixtureData.DatosValidos[0];
            //Ingreso la data
            cy.get('input[name="UserName"]').type(datosBien.username);
            cy.get('input[name="Password"]').type(datosBien.password);
            //Presiono Log In
            cy.get('#login').click();
            //Verifico el resultado
            cy.get('#loginstatus').should('contain.text', datosBien.success);

        })       
    });

    it('Logueo Incorrecto - Forma 1', () => {
        //Leo el fixture
        cy.fixture('fixtureComp02.json').then((fixtureData) => {
            const datosMal = fixtureData.DatosInvalidos[0];
            //Ingreso la data
            cy.get('input[name="UserName"]').type(datosMal.username);
            cy.get('input[name="Password"]').type(datosMal.password);
            //Presiono Log In
            cy.get('#login').click();
            //Verifico el resultado
            cy.get('#loginstatus').should('contain.text', datosMal.failure);

        })       
    });
    
    //--------------- FORMA 2 --------------- 

    it('Logueo Correcto - Forma 2', () => {
        cy.fixture('fixtureComp02.json').then((fixtureData) => {
          const validData = fixtureData.DatosValidos[0];
          loginUser(validData);
          cy.get('#loginstatus').should('contain.text', validData.success);
        });
      });
    
      it('Logueo Incorrecto - Forma 2', () => {
        cy.fixture('fixtureComp02.json').then((fixtureData) => {
          const invalidData = fixtureData.DatosInvalidos[0];
          loginUser(invalidData);
          cy.get('#loginstatus').should('contain.text', invalidData.failure);
        });
      });

    //--------------- FORMA 3 ---------------

    it('Logueo Correcto - Forma 3', () => {
        cy.fixture('fixtureComp02.json').then((fixtureData) => {
          const validData = fixtureData.DatosValidos[0];
          LoginPage.usernameInput().type(validData.username);
          LoginPage.passwordInput().type(validData.password);
          LoginPage.loginButton().click();
          LoginPage.errorMessage().should('contain.text', validData.success);
        });
      });
    
      it('Logueo Incorrecto - Forma 3', () => {
        cy.fixture('fixtureComp02.json').then((fixtureData) => {
          const invalidData = fixtureData.DatosInvalidos[0];
          LoginPage.usernameInput().type(invalidData.username);
          LoginPage.passwordInput().type(invalidData.password);
          LoginPage.loginButton().click();
          LoginPage.errorMessage().should('contain.text', invalidData.failure);
        });
      });

    //--------------- FORMA 4 ---------------  FALTA PULIR ESTO
      /*
      it.only('Logueo - Forma 3', () => {
        cy.fixture('fixtureComp02.json').then((fixtureData) => {
          const testData = [fixtureData.DatosValidos, fixtureData.DatosInvalidos];
          testData.forEach((dataCategory) => {
            dataCategory.forEach((data) => {
              cy.get('input[name="UserName"]').type(data.username);
              cy.get('input[name="Password"]').type(data.password);
              cy.get('#login').click();
    
              const expectedMessage = data.success ? data.success : data.failure;
              cy.get('#loginstatus').should('contain.text', expectedMessage);
            });
          });
        });
      });
      */
});
