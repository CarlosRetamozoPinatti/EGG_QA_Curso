describe('Hooks 1 - SauceDemo', () =>{
    //Hook Before - Antes que nada, vamos a la pagina principal.
    before(() => {
        cy.visit('https://www.saucedemo.com/');
    });
    
    //Logueo en la pagina
    it('Sauce Ecommerce Full Test', () => {
        //Logueo a la página
        cy.get('input[name="user-name"]').type('standard_user');
        cy.get('input[name="password"]').type('secret_sauce');
        cy.get('#login-button').click();
        //Verifico el header luego de loguear
        cy.get('.header_secondary_container').should('be.visible');

        //Agrego items al carrito
        //Estas Ids son especificas de productos a testear, ya que los selectores tienen el mismo cuerpo
        const productIds = ['sauce-labs-backpack', 'sauce-labs-bike-light', 'sauce-labs-bolt-t-shirt'];
        //Esta porcion de codigo recorre el array de productIds y los agrega al carrito.        
        productIds.forEach((productId) => {
            cy.get(`#add-to-cart-${productId}`).click().then(() => {
                cy.log(`Added product "${productId}" to cart`);
            });
        });       
        //Aca verifico que se hayan agregado los 3 elementos.
        cy.get('#shopping_cart_container .shopping_cart_badge').should('have.text', '3');

        //Quito items del carrito y verifico que solo haya 2 elementos.
        cy.get('[data-test="remove-sauce-labs-backpack"]').click();
        cy.get('#shopping_cart_container .shopping_cart_badge').should('have.text', '2');
      });
    });
    
    //Finalmente, en el Hook After, salgo de la Pagina y verifico encontrarme de nuevo en el Log In.
    after(() => {        
        cy.get('#react-burger-menu-btn').click();        
        cy.get('#logout_sidebar_link').wait(4000).should('be.visible').then(() => {
            cy.get('#logout_sidebar_link').click();
          });      
        cy.get('#login-button').should('be.visible');
      });
