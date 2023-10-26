import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SauceDemoTest {
    private static WebDriver driver;

    @BeforeMethod
    public static void setUpDriver() {
        // Configura el WebDriver de Chrome
        System.setProperty("webdriver.chrome.driver", "D:/Installers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    @Test
    public void FluentSDT(){
        // Navega a la página https://www.saucedemo.com/v1/
        driver.get("https://www.saucedemo.com/v1/");
        // Escenario 3: Espera Fluida
        FluidWaitTest(driver);
    }

    @Test
    public void ExplicitSDT() {
        // Navega a la página https://www.saucedemo.com/v1/
        driver.get("https://www.saucedemo.com/v1/");
        // Escenario 1: Espera Explicita
        ExplicitWaitTest(driver);
    }

    @Test
    public void ImplicitSDT(){
        // Navega a la página https://www.saucedemo.com/v1/
        driver.get("https://www.saucedemo.com/v1/");
        // Escenario 2: Espera Implicita - NO FUNCIONA POR ALGUN MOTIVO.
        ImplicitWaitTest(driver);
    }

    @AfterMethod
    public static void tearDownDriver(){
        // Cierra el navegador al finalizar
        driver.quit();
    }

    //Metodos a usar
    public static void ExplicitWaitTest(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Logear
        WebElement usernameField = driver.findElement(By.cssSelector("#user-name"));
        usernameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.cssSelector("#password"));
        passwordField.sendKeys("secret_sauce");
        WebElement LoginButton = driver.findElement(By.cssSelector("#login-button"));
        LoginButton.click();

        // Añadir al carrito
        WebElement InvButton = driver.findElement(By.cssSelector("body.main-body:nth-child(2) div.page_wrapper:nth-child(1) div.inventory_container div.inventory_list div.inventory_item:nth-child(1) div.pricebar > button.btn_primary.btn_inventory"));
        InvButton.click();
        WebElement CartButton = driver.findElement(By.cssSelector("#shopping_cart_container"));
        CartButton.click();

        // Espera explícita de 10 segundos para que el elemento AuxButton esté visible y clicable
        WebElement AuxButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Continue Shopping')]")));
        AuxButton.click();

        // Espera explícita de 10 segundos para que el elemento InvButton2 esté visible y clicable
        WebElement InvButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[2]/div[1]/div[2]/div[3]/button[1]")));
        InvButton2.click();

        // Espera explícita de 10 segundos para que el elemento CartButton esté visible y clicable
        CartButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#shopping_cart_container")));
        CartButton.click();

        // Continuar la compra
        WebElement CheckButton = driver.findElement(By.linkText("CHECKOUT"));
        CheckButton.click();
        WebElement NameField = driver.findElement(By.cssSelector("#first-name"));
        NameField.sendKeys("Charlie");
        WebElement LNameField = driver.findElement(By.cssSelector("#last-name"));
        LNameField.sendKeys("Bald");
        WebElement ZipField = driver.findElement(By.cssSelector("#postal-code"));
        ZipField.sendKeys("1234");
        WebElement NextButton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/form[1]/div[2]/input[1]"));
        NextButton.click();
        WebElement FinishButton = driver.findElement(By.linkText("FINISH"));
        FinishButton.click();
    }

    public static void ImplicitWaitTest(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        // Logear
        WebElement usernameField = driver.findElement(By.cssSelector("#user-name"));
        usernameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.cssSelector("#password"));
        passwordField.sendKeys("secret_sauce");
        WebElement LoginButton = driver.findElement(By.cssSelector("#login-button"));
        LoginButton.click();

        // Añadir al carrito
        WebElement InvButton = driver.findElement(By.cssSelector("body.main-body:nth-child(2) div.page_wrapper:nth-child(1) div.inventory_container div.inventory_list div.inventory_item:nth-child(1) div.pricebar > button.btn_primary.btn_inventory"));
        InvButton.click();
        WebElement CartButton = driver.findElement(By.cssSelector("#shopping_cart_container"));
        CartButton.click();

        WebElement AuxButton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[2]/a[1]"));
        AuxButton.click();
        WebElement InvButton2 = driver.findElement(By.xpath("//body/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[2]/div[1]/div[2]/div[3]/button[1]"));
        InvButton2.click();
        CartButton.click();

        // Continuar la compra
        WebElement CheckButton = driver.findElement(By.linkText("CHECKOUT"));
        CheckButton.click();
        WebElement NameField = driver.findElement(By.cssSelector("#first-name"));
        NameField.sendKeys("Charlie");
        WebElement LNameField = driver.findElement(By.cssSelector("#last-name"));
        LNameField.sendKeys("Bald");
        WebElement ZipField = driver.findElement(By.cssSelector("#postal-code"));
        ZipField.sendKeys("1234");
        WebElement NextButton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/form[1]/div[2]/input[1]"));
        NextButton.click();
        WebElement FinishButton = driver.findElement(By.linkText("FINISH"));
        FinishButton.click();
    }

    public static void FluidWaitTest(WebDriver driver){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        // Logear
        WebElement usernameField = driver.findElement(By.cssSelector("#user-name"));
        usernameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.cssSelector("#password"));
        passwordField.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.cssSelector("#login-button"));
        loginButton.click();

        // Añadir al carrito
        WebElement InvButton = driver.findElement(By.cssSelector("body.main-body:nth-child(2) div.page_wrapper:nth-child(1) div.inventory_container div.inventory_list div.inventory_item:nth-child(1) div.pricebar > button.btn_primary.btn_inventory"));
        InvButton.click();
        WebElement CartButton = driver.findElement(By.cssSelector("#shopping_cart_container"));
        CartButton.click();

        // Utiliza FluentWait para esperar a que el botón AuxButton/Continuar Comprando sea visible y clickeable
        WebElement auxButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Continue Shopping')]")));
        auxButton.click();

        // Utiliza FluentWait para esperar a que el botón InvButton2/Otro item sea visible y clickeable
        WebElement invButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[2]/div[1]/div[2]/div[3]/button[1]")));
        invButton2.click();

        // Utiliza FluentWait para esperar a que el botón CartButton esté visible y clicable
        CartButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#shopping_cart_container")));
        CartButton.click();

        // Continuar la compra
        WebElement checkButton = driver.findElement(By.linkText("CHECKOUT"));
        checkButton.click();
        WebElement nameField = driver.findElement(By.cssSelector("#first-name"));
        nameField.sendKeys("Charlie");
        WebElement lNameField = driver.findElement(By.cssSelector("#last-name"));
        lNameField.sendKeys("Bald");
        WebElement zipField = driver.findElement(By.cssSelector("#postal-code"));
        zipField.sendKeys("1234");
        WebElement nextButton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/form[1]/div[2]/input[1]"));
        nextButton.click();
        WebElement finishButton = driver.findElement(By.linkText("FINISH"));
        finishButton.click();
    }
}
