describe('Google Search', () => {
  it('loads search page', () => {
    cy.visit('https://www.google.com');
    cy.get('#APjFqb').type('remarkablemark{enter}');
    cy.get('#search a')
      .invoke('attr', 'href')
      .then((href) => console.log(href));
  });
});

