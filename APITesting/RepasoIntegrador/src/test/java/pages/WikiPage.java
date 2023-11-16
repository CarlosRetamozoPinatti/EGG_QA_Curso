package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikiPage extends BasePage {
    private static final String URL = "https://www.wikipedia.org/";
    @FindBy(id = "searchInput")
    private static WebElement buscador;

    @FindBy(id = "ca-edit")
    private static WebElement btnEditar;

    @FindBy(id = "ca-history")
    private static WebElement btnHistorial;

    public WikiPage(WebDriver driver) {
        super(driver);
        driver.get(URL);
    }

    public void searchInWikipedia(String searchTerm) throws InterruptedException {
        buscador.sendKeys(searchTerm);
        buscador.sendKeys(Keys.RETURN);
        this.Sleep();
    }

    public void checkEditBtn(String searchTerm) throws InterruptedException {
        buscador.sendKeys(searchTerm);
        buscador.sendKeys(Keys.RETURN);
        this.Sleep();
        btnEditar.click();
        this.Sleep();
    }

    public void checkHistorialBtn(String searchTerm) throws InterruptedException {
        buscador.sendKeys(searchTerm);
        buscador.sendKeys(Keys.RETURN);
        this.isVisible(btnHistorial);
        btnHistorial.click();
        this.Sleep();
    }
}
