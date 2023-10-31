package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopPage extends BasePage{
    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    private WebElement item1;

    @FindBy(css = "#add-to-cart-sauce-labs-bike-light")
    private WebElement item2;

    @FindBy(css = "#add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement item3;

    @FindBy(css = "#add-to-cart-sauce-labs-fleece-jacket")
    private WebElement item4;

    @FindBy(css = "#add-to-cart-sauce-labs-onesie")
    private WebElement item5;

    @FindBy(className = "shopping_cart_link")
    private WebElement cartBtn;

    public ShopPage(WebDriver driver) {
        super(driver);
    }

    public void AddToCart(){
        this.isVisible(this.cartBtn);
        this.item1.click();
        this.item2.click();
        this.item3.click();
        this.item4.click();
        this.item5.click();
        this.cartBtn.click();
    }
}
