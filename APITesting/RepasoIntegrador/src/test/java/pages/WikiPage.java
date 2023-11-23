package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.AssertJUnit.assertTrue;

public class WikiPage extends BasePage {
    private static final String URL = "https://www.wikipedia.org/";

    @FindBy(id = "searchInput")
    private static WebElement searchInput;

    @FindBy(id = "ca-edit")
    private static WebElement editButton;

    @FindBy(id = "ca-history")
    private static WebElement historyButton;

    public WikiPage(WebDriver driver) {
        super(driver);
        driver.get(URL);
    }

    public void searchInWikipedia(String searchTerm) {
        this.isVisible(searchInput);
        searchInput.sendKeys(searchTerm);
        searchInput.sendKeys(Keys.RETURN);
    }

    public void checkEditButton(String searchTerm) throws InterruptedException {
        this.isVisible(searchInput);
        searchInput.sendKeys(searchTerm);
        searchInput.sendKeys(Keys.RETURN);
        this.isVisible(editButton);
        editButton.click();
        this.sleep();
    }

    public void checkHistoryButton(String searchTerm) throws InterruptedException {
        searchInput.sendKeys(searchTerm);
        searchInput.sendKeys(Keys.RETURN);
        this.isVisible(historyButton);
        historyButton.click();
        this.sleep();
    }

    public void assertResults(String expectedTitle) throws InterruptedException {
        String pageTitle = driver.getTitle();
        assertTrue(pageTitle.contains(expectedTitle));
        this.sleep();
        this.exit();
    }
}
