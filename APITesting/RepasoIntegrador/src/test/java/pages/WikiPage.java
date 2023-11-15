package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikiPage extends BasePage {
    private static final String URL = "https://www.wikipedia.org/";

    public WikiPage(WebDriver driver) {
        super(driver);
        driver.get(URL);
    }

    public void searchInWikipedia(String searchTerm) {
        WebElement searchBox = driver.findElement(By.id("searchInput"));
        searchBox.sendKeys(searchTerm);
        searchBox.sendKeys(Keys.RETURN);
    }
}
