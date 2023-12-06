describe('Validaciones', () => {
    beforeEach(() => {
      // Voy a la pagina a testear
      cy.visit('https://qavalidation.com/demo-form/');
  });

    it('Verificar la URL', () => {
      // Realizar una solicitud directa a la URL del formulario
      cy.request('https://qavalidation.com/demo-form/')
        .its('status')
        .should('eq', 200); // Verificar que se cargue correctamente la página (código 200)
    });

  //-----------------------------------------------------------------------------

    it('Usuario Valido', () => {
    
      // Busco el campo nombre y lo completo
      cy.get('input[name="g4072-fullname"]').type('Usuario Test');
    
      // Aserción: Verificar que se haya ingresado el nombre correctamente
      cy.get('input[name="g4072-fullname"]').should('have.value', 'Usuario Test');
    
      // Busco el campo email y lo completo
      cy.get('input[name="g4072-email"]').type('UsuarioTest@Test.com');
    
      // Aserción: Verificar que se haya ingresado el email correctamente
      cy.get('input[name="g4072-email"]').should('have.value', 'UsuarioTest@Test.com');
    
      // Busco el campo telefono y lo completo
      cy.get('input[name="g4072-phonenumber"]').type('0303456');
    
      // Aserción: Verificar que se haya ingresado el número de teléfono correctamente
      cy.get('input[name="g4072-phonenumber"]').should('have.value', '0303456');
    
      // Busco el campo genero y elijo una opcion
      cy.get('#g4072-gender').select('Female', { force: true });
    
      // Aserción: Verificar que se haya seleccionado el género correctamente
      cy.get('#g4072-gender').should('have.value', 'Female');
    
      // Busco el campo Años de Experiencia y elijo una opcion
      cy.get('.grunion-radio-options input[value="3"]').check();
    
      // Aserción: Verificar que se haya seleccionado la opción de experiencia correctamente
      cy.get('.grunion-radio-options input[value="3"]').should('be.checked');
    
      // Busco el campo Skills y selecciono las opciones que quiera
      cy.get('.grunion-checkbox-multiple-options input[value="Functional testing"]').check();
      cy.get('.grunion-checkbox-multiple-options input[value="API testing"]').check();
    
      // Aserción: Verificar que se hayan seleccionado las habilidades correctamente
      cy.get('.grunion-checkbox-multiple-options input[value="Functional testing"]').should('be.checked');
      cy.get('.grunion-checkbox-multiple-options input[value="API testing"]').should('be.checked');
    
      // Busco el campo herramientas de testeo y selecciono una opcion
      cy.get('#g4072-qatools').select('Cypress', { force: true });
    
      // Aserción: Verificar que se haya seleccionado la herramienta correctamente
      cy.get('#g4072-qatools').should('have.value', 'Cypress');

      //Aca relleno el campo de texto previo a mandar el form
      cy.get('textarea[name="g4072-otherdetails"]').type('Hasta aca salió todo bien');

      // Hacer clic en el botón "Submit!"
      cy.get('button.wp-block-button__link').contains('Submit!').click();
    });

    //----------------------------------------------------------------------------

    it('Usuario Vacio', () => { 
    
      // Aserción: Verificar que NO se haya ingresado el nombre
      cy.get('input[name="g4072-fullname"]').should('have.value', '');
    
      // Busco el campo email y lo completo
      cy.get('input[name="g4072-email"]').type('UsuarioTest@Test.com');
    
      // Aserción: Verificar que se haya ingresado el email correctamente
      cy.get('input[name="g4072-email"]').should('have.value', 'UsuarioTest@Test.com');
    
      // Busco el campo telefono y lo completo
      cy.get('input[name="g4072-phonenumber"]').type('0303456');
    
      // Aserción: Verificar que se haya ingresado el número de teléfono correctamente
      cy.get('input[name="g4072-phonenumber"]').should('have.value', '0303456');
    
      // Busco el campo genero y elijo una opcion
      cy.get('#g4072-gender').select('Female', { force: true });
    
      // Aserción: Verificar que se haya seleccionado el género correctamente
      cy.get('#g4072-gender').should('have.value', 'Female');
    
      // Busco el campo Años de Experiencia y elijo una opcion
      cy.get('.grunion-radio-options input[value="3"]').check();
    
      // Aserción: Verificar que se haya seleccionado la opción de experiencia correctamente
      cy.get('.grunion-radio-options input[value="3"]').should('be.checked');
    
      // Busco el campo Skills y selecciono las opciones que quiera
      cy.get('.grunion-checkbox-multiple-options input[value="Functional testing"]').check();
      cy.get('.grunion-checkbox-multiple-options input[value="API testing"]').check();
    
      // Aserción: Verificar que se hayan seleccionado las habilidades correctamente
      cy.get('.grunion-checkbox-multiple-options input[value="Functional testing"]').should('be.checked');
      cy.get('.grunion-checkbox-multiple-options input[value="API testing"]').should('be.checked');
    
      // Busco el campo herramientas de testeo y selecciono una opcion
      cy.get('#g4072-qatools').select('Cypress', { force: true });
    
      // Aserción: Verificar que se haya seleccionado la herramienta correctamente
      cy.get('#g4072-qatools').should('have.value', 'Cypress');

      //Aca relleno el campo de texto previo a mandar el form
      cy.get('textarea[name="g4072-otherdetails"]').type('Hasta aca salió todo bien');

      // Hacer clic en el botón "Submit!"
      cy.get('button.wp-block-button__link').contains('Submit!').click();
    });

    //------------------------------------------------------------------------

    it('Email sin Dominio', () => {
    
      // Busco el campo nombre y lo completo
      cy.get('input[name="g4072-fullname"]').type('Usuario Test');
    
      // Aserción: Verificar que se haya ingresado el nombre correctamente
      cy.get('input[name="g4072-fullname"]').should('have.value', 'Usuario Test');
    
      // Busco el campo email y lo completo SIN dominio
      cy.get('input[name="g4072-email"]').type('UsuarioTest@');
    
      // Aserción: Verificar que se haya ingresado el email SIN dominio
      cy.get('input[name="g4072-email"]').should('have.value', 'UsuarioTest@');
    
      // Busco el campo telefono y lo completo
      cy.get('input[name="g4072-phonenumber"]').type('0303456');
    
      // Aserción: Verificar que se haya ingresado el número de teléfono correctamente
      cy.get('input[name="g4072-phonenumber"]').should('have.value', '0303456');
    
      // Busco el campo genero y elijo una opcion
      cy.get('#g4072-gender').select('Female', { force: true });
    
      // Aserción: Verificar que se haya seleccionado el género correctamente
      cy.get('#g4072-gender').should('have.value', 'Female');
    
      // Busco el campo Años de Experiencia y elijo una opcion
      cy.get('.grunion-radio-options input[value="3"]').check();
    
      // Aserción: Verificar que se haya seleccionado la opción de experiencia correctamente
      cy.get('.grunion-radio-options input[value="3"]').should('be.checked');
    
      // Busco el campo Skills y selecciono las opciones que quiera
      cy.get('.grunion-checkbox-multiple-options input[value="Functional testing"]').check();
      cy.get('.grunion-checkbox-multiple-options input[value="API testing"]').check();
    
      // Aserción: Verificar que se hayan seleccionado las habilidades correctamente
      cy.get('.grunion-checkbox-multiple-options input[value="Functional testing"]').should('be.checked');
      cy.get('.grunion-checkbox-multiple-options input[value="API testing"]').should('be.checked');
    
      // Busco el campo herramientas de testeo y selecciono una opcion
      cy.get('#g4072-qatools').select('Cypress', { force: true });
    
      // Aserción: Verificar que se haya seleccionado la herramienta correctamente
      cy.get('#g4072-qatools').should('have.value', 'Cypress');

      //Aca relleno el campo de texto previo a mandar el form
      cy.get('textarea[name="g4072-otherdetails"]').type('Hasta aca salió todo bien');

      // Hacer clic en el botón "Submit!"
      cy.get('button.wp-block-button__link').contains('Submit!').click();
    });

    //----------------------------------------------------------------------------

    it('Telefono con Letras', () => {
    
      // Busco el campo nombre y lo completo
      cy.get('input[name="g4072-fullname"]').type('Usuario Test');
    
      // Aserción: Verificar que se haya ingresado el nombre correctamente
      cy.get('input[name="g4072-fullname"]').should('have.value', 'Usuario Test');
    
      // Busco el campo email y lo completo
      cy.get('input[name="g4072-email"]').type('UsuarioTest@Test.com');
    
      // Aserción: Verificar que se haya ingresado el email correctamente
      cy.get('input[name="g4072-email"]').should('have.value', 'UsuarioTest@Test.com');
    
      // Busco el campo telefono y lo completo
      cy.get('input[name="g4072-phonenumber"]').type('0303asdasd456');
    
      // Aserción: Verificar que se haya ingresado el número de teléfono correctamente
      cy.get('input[name="g4072-phonenumber"]').should('have.value', '0303asdasd456');
    
      // Busco el campo genero y elijo una opcion
      cy.get('#g4072-gender').select('Female', { force: true });
    
      // Aserción: Verificar que se haya seleccionado el género correctamente
      cy.get('#g4072-gender').should('have.value', 'Female');
    
      // Busco el campo Años de Experiencia y elijo una opcion
      cy.get('.grunion-radio-options input[value="3"]').check();
    
      // Aserción: Verificar que se haya seleccionado la opción de experiencia correctamente
      cy.get('.grunion-radio-options input[value="3"]').should('be.checked');
    
      // Busco el campo Skills y selecciono las opciones que quiera
      cy.get('.grunion-checkbox-multiple-options input[value="Functional testing"]').check();
      cy.get('.grunion-checkbox-multiple-options input[value="API testing"]').check();
    
      // Aserción: Verificar que se hayan seleccionado las habilidades correctamente
      cy.get('.grunion-checkbox-multiple-options input[value="Functional testing"]').should('be.checked');
      cy.get('.grunion-checkbox-multiple-options input[value="API testing"]').should('be.checked');
    
      // Busco el campo herramientas de testeo y selecciono una opcion
      cy.get('#g4072-qatools').select('Cypress', { force: true });
    
      // Aserción: Verificar que se haya seleccionado la herramienta correctamente
      cy.get('#g4072-qatools').should('have.value', 'Cypress');

      //Aca relleno el campo de texto previo a mandar el form
      cy.get('textarea[name="g4072-otherdetails"]').type('Hasta aca salió todo bien');

      // Hacer clic en el botón "Submit!"
      cy.get('button.wp-block-button__link').contains('Submit!').click();
    });

     //------------------------------------------------------------------------------

    it('Verificar opciones de manera positiva', () => {

      cy.get('#g4072-gender').children().should('have.length', 3); // Verifica que tenga 3 opciones (Male, Female, NA)

      // Elemento de radio de años de experiencia
      cy.get('.grunion-radio-options').children().should('have.length', 6); // Verifica que tenga 6 opciones (1 a 5 y "Above 5")

      // Elemento de checkbox de skills
      cy.get('.grunion-checkbox-multiple-options').children().should('have.length', 4); // Verifica que tenga 4 opciones

      // Elemento de selección de herramientas de testeo
      cy.get('#g4072-qatools').children().should('have.length', 4);  // Verifica que tenga 4 opciones (Selenium, Appium, Cypress y Protractor)
    });

    //------------------------------------------------------------------------------

    it('Verificar opciones de manera negativa', () => {

      // Elemento de selección de género
      cy.get('#g4072-gender').children().should('not.have.length', 4); // Verifica que NO tenga 4 opciones (Solo debe tener 3)

      // Elemento de radio de años de experiencia
      cy.get('.grunion-radio-options').children().should('not.have.length', 5); // Verifica que NO tenga 5 opciones (Solo debe tener 6)

      // Elemento de checkbox de skills
      cy.get('.grunion-checkbox-multiple-options').children().should('not.have.length', 5); // Verifica que NO tenga 5 opciones (Solo debe tener 4)

      // Elemento de selección de herramientas de testeo
      cy.get('#g4072-qatools').children().should('not.have.length', 5);  // Verifica que NO tenga 5 opciones (Solo debe tener 4)
    });
});
  
 

