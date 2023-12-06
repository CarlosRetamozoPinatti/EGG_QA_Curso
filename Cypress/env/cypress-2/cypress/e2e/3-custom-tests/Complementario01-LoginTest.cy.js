describe('Sample App Login', () => {
    it('Loads login Page', () => {
        cy.visit('http://uitestingplayground.com/sampleapp');
        cy.get('input[name="UserName"]').type('TestUser');
        cy.get('input[name="Password"]').type('pwd');
        cy.get('#login').click();
    });
});
