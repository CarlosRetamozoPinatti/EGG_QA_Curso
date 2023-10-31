package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillPage extends BasePage{
    @FindBy(css = "#first-name")
    private WebElement NameBar;

    @FindBy(css = "#last-name")
    private WebElement LNameBar;

    @FindBy(css = "#postal-code")
    private WebElement ZipBar;

    @FindBy(css = "#continue")
    private WebElement nextBtn;

    @FindBy(css = "#finish")
    private WebElement endBtn;

    public BillPage(WebDriver driver) {
        super(driver);
    }

    public void BillingInfo(String name, String lastname, String zcode){
        this.isVisible(this.nextBtn);
        this.NameBar.sendKeys(name);
        this.LNameBar.sendKeys(lastname);
        this.ZipBar.sendKeys(zcode);
        this.nextBtn.click();
        this.isVisible(endBtn);
        this.endBtn.click();
    }
}
