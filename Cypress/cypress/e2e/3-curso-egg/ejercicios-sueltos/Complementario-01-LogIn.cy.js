describe('Sample App Login', () => {
    beforeEach(() =>{
        //Primero, seteo la pagina a testear.
        cy.visit('http://uitestingplayground.com/sampleapp');
    });

    //Testeo el login valido
    it('Logueo Correcto', () => {        
        cy.get('input[name="UserName"]').type('TestUser');
        cy.get('input[name="Password"]').type('pwd');
        cy.get('#login').click();
    });

    //Testeo el login no valido.
    it('Logueo Incorrecto', () => {        
        cy.get('input[name="UserName"]').type('TestUser');
        cy.get('input[name="Password"]').type('asdasd');
        cy.get('#login').click();
    });
});