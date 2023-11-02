package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FaWPage extends BasePage{
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")
    private static WebElement clickHerebtn;

    @FindBy(linkText = "iFrame")
    private static WebElement iFrameTab;

    public FaWPage(WebDriver driver, String url) {
        super(driver);
        driver.get(url);
    }

    public void ClickHere() throws InterruptedException {
        //Hasta aca, como siempre (aca en vez del wait, pruebo el Thread Sleep.
        clickHerebtn.click();
        this.Sleep();
        iFrameTab.click();
        //Aca uso el Switch Iframe para usar el Html dentro del Html...
        this.Sleep();

    }
}
