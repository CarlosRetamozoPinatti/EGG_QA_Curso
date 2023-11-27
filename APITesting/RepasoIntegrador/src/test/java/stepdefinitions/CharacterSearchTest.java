package stepdefinitions;

import api.APIConfig;
import api.APIUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.AssertJUnit.assertTrue;

public class CharacterSearchTest {
    private APIUtils apiUtils = new APIUtils();
    private String searchTerm;
    private String wikipediaPageTitle;


    @Given("Soy un usuario en la pagina principal de Wikipedia intentando buscar un articulo")
    public void GivenStep_CharacterSearch() {
        String urlPeople = APIConfig.BASE_URL + APIConfig.PEOPLE_ENDPOINT + "/1/";
        searchTerm = apiUtils.getCharacterNameFromAPI(urlPeople).trim();
        //  throw new io.cucumber.java.PendingException();
    }
    @When("Busco el personaje de Star Wars en Wikipedia")
    public void WhenStep_CharacterSearch() throws InterruptedException {
        wikipediaPageTitle = apiUtils.searchInWikipedia(searchTerm).trim();
        // throw new io.cucumber.java.PendingException();
    }
    @Then("Deberia visualizar correctamente el articulo relacionado")
    public void ThenStep_CharacterSearch() {
        assertTrue(wikipediaPageTitle.contains(searchTerm));
        // throw new io.cucumber.java.PendingException();
    }
}
