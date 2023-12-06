
describe('Tiempos de Espera', () => {
    beforeEach(() => {
        // Voy a la pagina a testear
        cy.visit('http://uitestingplayground.com/ajax');
    });

    function onVisibilityChange(event) {
        // El elemento es visible
        cy.get('@successMessage').should('be.visible');
      }

    it('Tiempo de Espera fijo', () => {
        cy.get('#ajaxButton').click();
        cy.wait(20000); // Espera 20 segundos
        cy.get('#content .bg-success').should('be.visible');
    });

    it('Timeouts y Alias', () => {
        cy.get('#ajaxButton').click();
        // Esperar a que aparezca el mensaje de éxito y asignar un alias al elemento
        cy.get('#content p.bg-success', { timeout: 18000 }).as('successMessage');
        // Verificar la visibilidad del elemento usando su alias después de la espera
        cy.get('@successMessage').should('be.visible').and('contain', 'Data loaded with AJAX get request.');
    });   
});
