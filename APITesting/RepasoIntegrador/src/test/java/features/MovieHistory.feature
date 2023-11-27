Feature: Verificar la página de historial de una pelicula de Star Wars en Wikipedia
  Como usuario quiero buscar una película de Star Wars en Wikipedia y verificar su página de historial.

  Scenario: Verificar la página de historial de una pelicula de Star Wars en Wikipedia
    Given Soy un usuario en la pagina principal de Wikipedia intentando buscar otra pelicula de Star Wars
    When Busco la otra pelicula de Star Wars en Wikipedia
    Then Deberia visualizar correctamente la pagina de Historial
