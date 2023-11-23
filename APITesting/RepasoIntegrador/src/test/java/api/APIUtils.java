package api;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.openqa.selenium.WebDriver;
import pages.WebDriverManager;
import pages.WikiPage;

public class APIUtils {
    public String getPeopleTest(String urlElement){
        APIResponse response = APIClient.sendGETRequest(urlElement);
        String responseBody = response.getResponseBody();

        // Utilizar Gson para parsear la respuesta JSON y extraer el valor del campo "name"
        JsonObject jsonObject = JsonParser.parseString(responseBody).getAsJsonObject();
        String charName = jsonObject.get("name").getAsString();
        return charName;
    }

    public String getFilmTest(String urlElement) {
        APIResponse response = APIClient.sendGETRequest(urlElement);
        String responseBody = response.getResponseBody();

        // Utilizar Gson para parsear la respuesta JSON y extraer el valor del campo "name"
        JsonObject jsonObject = JsonParser.parseString(responseBody).getAsJsonObject();
        return jsonObject.get("title").getAsString();
    }

    public String searchInWikipedia(String searchTerm) throws InterruptedException {
        WebDriver driver = WebDriverManager.getDriver();
        WikiPage wikiPage = new WikiPage(driver);
        wikiPage.searchInWikipedia(searchTerm);
        // Retornar el título de la página actual después de la búsqueda
        return driver.getTitle();
    }

    public String searchEdit(String searchTerm) throws InterruptedException {
        WebDriver driver = WebDriverManager.getDriver();
        WikiPage wikiPage = new WikiPage(driver);
        wikiPage.checkEditBtn(searchTerm);
        return driver.getTitle();
    }
}
