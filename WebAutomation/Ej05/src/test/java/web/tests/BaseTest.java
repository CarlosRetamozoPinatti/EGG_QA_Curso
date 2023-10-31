package web.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import web.pages.BillPage;
import web.pages.CartPage;
import web.pages.LoginPage;
import web.pages.ShopPage;

public class BaseTest {
    private static WebDriver driver;
    protected LoginPage loginPage;
    protected ShopPage shopPage;
    protected CartPage cartPage;
    protected BillPage billPage;

    @BeforeMethod
    public void setUpDriver() {
        // Configura el WebDriver de Chrome
        System.setProperty("webdriver.chrome.driver", "D:/Installers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @AfterMethod
    public static void tearDownDriver(){
        // Cierra el navegador al finalizar
        driver.quit();
    }

    public LoginPage getLoginPage(){
        loginPage = new LoginPage(driver, "https://www.saucedemo.com");
        return loginPage;
    }

    public ShopPage getShopPage(){
        shopPage = new ShopPage(driver);
        return shopPage;
    }

    public CartPage getCartPage(){
        cartPage = new CartPage(driver);
        return cartPage;
    }

    public BillPage getBillPage(){
        billPage = new BillPage(driver);
        return billPage;
    }
}
