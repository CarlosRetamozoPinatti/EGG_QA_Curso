describe('Testeo de Fixtures', () => {
    beforeEach(() => {
      // Voy a la página a testear
      cy.visit('http://uitestingplayground.com/sampleapp');
    });
  
    //Datos para la forma 2 - Funciones Reusables
    const loginUser = (username, password) => {
      cy.get('input[name="UserName"]').type(username);
      cy.get('input[name="Password"]').type(password);
      cy.get('#login').click();
    };
  
    //Datos para la forma 3 - POM
    const LoginPage = {
      usernameInput: () => cy.get('input[name="UserName"]'),
      passwordInput: () => cy.get('input[name="Password"]'),
      loginButton: () => cy.get('#login'),
      errorMessage: () => cy.get('#loginstatus'),
    };
  
    // Testeo optimizado de los inicios de sesión
    const runLoginTest = (userData, success) => {
      LoginPage.usernameInput().type(userData.username);
      LoginPage.passwordInput().type(userData.password);
      LoginPage.loginButton().click();
      LoginPage.errorMessage().should('contain.text', success);
    };
  
    // froma 1 - Basico
    it('Logueo Correcto - Forma 1', () => {
      cy.fixture('datosComplementario02.json').then((fixtureData) => {
        const datosBien = fixtureData.DatosValidos[0];
        runLoginTest(datosBien, datosBien.success);
      });
    });
  
    it('Logueo Incorrecto - Forma 1', () => {
      cy.fixture('datosComplementario02.json').then((fixtureData) => {
        const datosMal = fixtureData.DatosInvalidos[0];
        runLoginTest(datosMal, datosMal.failure);
      });
    });
  
    // forma 2 - Funciones Reusables
    it('Logueo Correcto - Forma 2', () => {
      cy.fixture('datosComplementario02.json').then((fixtureData) => {
        const validData = fixtureData.DatosValidos[0];
        loginUser(validData.username, validData.password);
        cy.get('#loginstatus').should('contain.text', validData.success);
      });
    });
  
    it('Logueo Incorrecto - Forma 2', () => {
      cy.fixture('datosComplementario02.json').then((fixtureData) => {
        const invalidData = fixtureData.DatosInvalidos[0];
        loginUser(invalidData.username, invalidData.password);
        cy.get('#loginstatus').should('contain.text', invalidData.failure);
      });
    });

    // forma 3 - POM
    it('Logueo Correcto - Forma 3', () => {
      cy.fixture('datosComplementario02.json').then((fixtureData) => {
        const validData = fixtureData.DatosValidos[0];
        runLoginTest(validData, validData.success);
      });
    });
  
    it('Logueo Incorrecto - Forma 3', () => {
      cy.fixture('datosComplementario02.json').then((fixtureData) => {
        const invalidData = fixtureData.DatosInvalidos[0];
        runLoginTest(invalidData, invalidData.failure);
      });
    });

    // Testeo data-driven
    it.only('Data-driven login testing', () => {
        cy.fixture('datosComplementario02.json').then((fixtureData) => {
            const testData = [...fixtureData.DatosValidos, ...fixtureData.DatosInvalidos];
            testData.forEach((userData) => {
            const expectedMessage = userData.success || 'User logged out';
            runLoginTest(userData, expectedMessage);
            });
        });
    });
  });
  