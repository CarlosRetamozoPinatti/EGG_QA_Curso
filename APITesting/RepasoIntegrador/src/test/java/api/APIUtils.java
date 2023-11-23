package api;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.openqa.selenium.WebDriver;
import pages.WebDriverManager;
import pages.WikiPage;

public class APIUtils {
    public String getCharacterNameFromAPI(String apiUrl){
        APIResponse response = APIClient.sendGETRequest(apiUrl);
        String responseBody = response.getResponseBody();
        JsonObject jsonObject = JsonParser.parseString(responseBody).getAsJsonObject();
        return jsonObject.get("name").getAsString();
    }

    public String getFilmTitleFromAPI(String apiUrl) {
        APIResponse response = APIClient.sendGETRequest(apiUrl);
        String responseBody = response.getResponseBody();
        JsonObject jsonObject = JsonParser.parseString(responseBody).getAsJsonObject();
        return jsonObject.get("title").getAsString();
    }

    public String searchInWikipedia(String searchTerm) throws InterruptedException {
        WebDriver driver = WebDriverManager.getDriver();
        WikiPage wikiPage = new WikiPage(driver);
        wikiPage.searchInWikipedia(searchTerm);
        return driver.getTitle();
    }

    public String searchEdit(String searchTerm) throws InterruptedException {
        WebDriver driver = WebDriverManager.getDriver();
        WikiPage wikiPage = new WikiPage(driver);
        wikiPage.checkEditButton(searchTerm);
        return driver.getTitle();
    }
}
