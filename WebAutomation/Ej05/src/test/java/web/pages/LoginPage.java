package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(css = "#user-name")
    private WebElement usernameInput;

    @FindBy(css = "#password")
    private WebElement passwordInput;

    @FindBy(css = "#login-button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver, String url) {
        super(driver);
        driver.get(url);
    }

    public void login(String username, String password) {
        // Utilizar los elementos de la página para realizar la operación de inicio de sesión.
        this.usernameInput.sendKeys(username);
        this.passwordInput.sendKeys(password);
        this.isVisible(this.loginButton);
        this.loginButton.click();
    }
}
