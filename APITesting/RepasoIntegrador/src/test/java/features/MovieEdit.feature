Feature: Verificar la página de edicion de una pelicula de Star Wars en Wikipedia
  Como usuario quiero buscar una película de Star Wars en Wikipedia y verificar su página de edición.

  Scenario: Verificar la página de edicion de una pelicula de Star Wars en Wikipedia
    Given Soy un usuario en la pagina principal de Wikipedia intentando buscar una pelicula de Star Wars
    When Busco la pelicula de Star Wars en Wikipedia
    Then Deberia visualizar correctamente la pagina de Edicion
