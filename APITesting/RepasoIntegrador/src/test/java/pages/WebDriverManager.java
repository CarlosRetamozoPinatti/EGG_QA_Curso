package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverManager {
    private static WebDriver driver;
    private final static String chromeDriverPath = "D:/Tools/GoogleTest/chromedriver-win64/chromedriver.exe";
    private final static String chromeBinaryPath = "D:/Tools/GoogleTest/chrome-win64";

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        ChromeOptions options = new ChromeOptions();
       // options.setBinary(chromeBinaryPath);
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        return driver;
    }

    protected Boolean isVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.isDisplayed();
    }

    public static void quitDriver() {
        driver.quit();
    }
}
