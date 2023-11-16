package api;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.openqa.selenium.WebDriver;
import pages.WebDriverManager;
import pages.WikiPage;

import java.util.Random;

public class APIUtils {
    public String getPeopleTest(String urlElement){
        APIResponse response = APIClient.sendGETRequest(urlElement);
        String responseBody = response.getResponseBody();

        // Utilizar Gson para parsear la respuesta JSON y extraer el valor del campo "name"
        JsonObject jsonObject = JsonParser.parseString(responseBody).getAsJsonObject();
        String charName = jsonObject.get("name").getAsString();
        return charName;
    }

    public String getFilmTest(String urlElement){
        APIResponse response = APIClient.sendGETRequest(urlElement);
        String responseBody = response.getResponseBody();

        // Utilizar Gson para parsear la respuesta JSON y extraer el valor del campo "films", para despues armar un array y seleccionar un item aleatorio del mismo.
        JsonObject jsonObject = JsonParser.parseString(responseBody).getAsJsonObject();
        JsonArray filmsArray = jsonObject.getAsJsonArray("films");

        int randomIndex = new Random().nextInt(filmsArray.size());
        String randomFilm = filmsArray.get(randomIndex).getAsString();
        return randomFilm;
    }

    public String searchInWikipedia(String searchTerm) throws InterruptedException {
        WebDriver driver = WebDriverManager.getDriver();
        WikiPage wikiPage = new WikiPage(driver);
        wikiPage.searchInWikipedia(searchTerm);
        // Retornar el título de la página actual después de la búsqueda
        return driver.getTitle();
    }
}
