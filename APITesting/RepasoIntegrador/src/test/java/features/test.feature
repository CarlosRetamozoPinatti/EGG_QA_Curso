Feature: Personaje Star Wars
  Como usuario quiero ingresar a Wikipedia y buscar a un personaje de Star Wars.

  Scenario: Acceder a un articulo en Wikipedia referente a un personaje de Star Wars
    Given Soy un usuario en la pagina principal de Wikipedia intentando buscar un articulo
    When Busco el personaje de Star Wars en Wikipedia
    Then Deberia visualizar correctamente el articulo relacionado
