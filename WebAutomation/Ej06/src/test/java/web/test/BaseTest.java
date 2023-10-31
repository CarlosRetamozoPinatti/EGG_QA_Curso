package web.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import web.pages.FaWPage;

public class BaseTest {
    private static WebDriver driver;
    protected FaWPage fawPage;


    @BeforeMethod
    public void setUpDriver() {
        // Configura el WebDriver de Chrome
        System.setProperty("webdriver.chrome.driver", "D:/Installers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @AfterMethod
    public static void tearDownDriver() {
        // Cierra el navegador al finalizar
        driver.quit();
    }

    public FaWPage getFawPage(){
        fawPage = new FaWPage(driver, "https://www.globalsqa.com/demo-site/frames-and-windows/");
        return fawPage;
    }
}
