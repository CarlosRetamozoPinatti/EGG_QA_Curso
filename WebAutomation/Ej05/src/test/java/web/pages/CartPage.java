package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(css = "#remove-sauce-labs-backpack")
    private WebElement remove1;

    @FindBy(css = "#remove-sauce-labs-bolt-t-shirt")
    private WebElement remove2;

    @FindBy(css = "#remove-sauce-labs-fleece-jacket")
    private WebElement remove3;

    @FindBy(id = "checkout")
    private WebElement buyBtn;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void ContinueShopping(){
        this.isVisible(this.buyBtn);
        remove1.click();
        remove2.click();
        remove3.click();
        buyBtn.click();
    }
}
