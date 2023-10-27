import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AssertionsFalseTest {
    private static WebDriver driver;
    private static final String URL = "https://www.google.com/";
    private static final String URL2 = "https://www.amazon.com/";

    @BeforeMethod
    public static void setUpDriver() {
        // Configura el WebDriver de Chrome
        System.setProperty("webdriver.chrome.driver", "D:/Installers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public static void GoogleAssertEquals(){
        //Creo una espera explicita, para evitar errores.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //Voy a la pagina de busqueda
        driver.get(URL);
        //Ingreso palabras y busco
        WebElement searchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='APjFqb']")));
        searchBar.sendKeys("Metallica");
        searchBar.submit();
        //Obtengo los valores a comparar
        WebElement searchResults = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]")));
        String actualResults = searchResults.getText();
        Assert.assertNotEquals(actualResults, "Iron Maiden");
    }

    @Test
    public static void AmazonSearchContains(){
        //Creo una espera explicita, para evitar errores.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //Voy a la pagina de busqueda
        driver.get(URL2);
        //Ingreso palabras y busco
        WebElement searchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#twotabsearchtextbox")));
        searchBar.sendKeys("Metallica");
        searchBar.submit();
        //Obtengo los valores a comparar
        WebElement searchResults = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.
                        xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]")));
        String actualResults = searchResults.getText();
        Assert.assertFalse(actualResults.contains("Maiden"), "No se encontraron resultados");
    }

        @Test
        public void searchForDifferentResults() {
            //Creo una espera explicita, para evitar errores.
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            //Voy a la pagina de busqueda
            driver.get(URL2);
            // Buscar "Metallica" en la página web
            WebElement searchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#twotabsearchtextbox")));
            searchBar.sendKeys("Metallica");
            searchBar.submit();

            // Obtener los resultados de la búsqueda
            WebElement searchResults = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));
            List<WebElement> MetallicaList = searchResults.findElements(By.className("s-result-item"));
            String MetallicaResult = MetallicaList.get(0).getText();

            // Buscar "Iron Maiden" en la página web
            searchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#twotabsearchtextbox")));
            searchBar.clear();
            searchBar.sendKeys("Iron Maiden");
            searchBar.submit();

            // Obtener los resultados de la búsqueda
            searchResults = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));
            List<WebElement> MaidenList = searchResults.findElements(By.className("s-result-item"));
            String MaidenResult = MaidenList.get(0).getText();

            // Validar que los resultados de la búsqueda son diferentes
            Assert.assertNotEquals(MetallicaList.size(), MaidenList.size());
            Assert.assertNotEquals(MetallicaResult, MaidenResult);
        }

    @AfterMethod
    public static void tearDownDriver(){
        // Cierra el navegador al finalizar
        driver.quit();
    }
}
