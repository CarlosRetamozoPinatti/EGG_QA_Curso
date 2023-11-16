package stepdefinitions;

import api.APIConfig;
import api.APIUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.AssertJUnit.assertTrue;

public class Test {
    private APIUtils apiUtils = new APIUtils();
    private String searchTerm;
    private String wikipediaPageTitle;


    @Given("Soy un usuario en la pagina principal de Wikipedia intentando buscar un articulo")
    public void soy_un_usuario_en_la_pagina_principal_de_wikipedia_intentando_buscar_un_articulo() {
        String urlPeople = APIConfig.BASE_URL + APIConfig.PEOPLE_ENDPOINT + "/1/";
        searchTerm = apiUtils.getPeopleTest(urlPeople);
      //  throw new io.cucumber.java.PendingException();
    }
    @When("Busco el personaje de Star Wars en Wikipedia")
    public void busco_el_personaje_de_star_wars_en_wikipedia() throws InterruptedException {
        wikipediaPageTitle = apiUtils.searchInWikipedia(searchTerm);
       // throw new io.cucumber.java.PendingException();
    }
    @Then("Deberia visualizar correctamente el articulo relacionado")
    public void deberia_visualizar_correctamente_el_articulo_relacionado() {
        assertTrue(wikipediaPageTitle.contains(searchTerm));
       // throw new io.cucumber.java.PendingException();
    }
}
