
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDateTime;

public class WikipediaSearchTest {
    private static WebDriver driver;
    private static WebDriverWait wait;

    @BeforeAll
    // Configuración de ChromeDriver
    public static void setUpDriver() {
        System.setProperty("webdriver.chrome.driver", "D:/Installers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        //Seteamos una espera implicita
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    //Seteamos una espera explicita
    @BeforeAll
    public static void setUpWait() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //Al usar esperas explicitas, creamos un metodo para apagar las implicitas, en caso de errores
    private static void switchOffImplicitWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
    }

    //Iniciamos el testeo automatizado
    @Test
    public void WikipediaSearch() {
        // Paso 1: Navegar a la página de Wikipedia
        driver.get("https://www.wikipedia.org");

        // Paso 2: Escribir "Microsoft" en la caja de búsqueda
        WebElement searchBox = driver.findElement(By.cssSelector("input#searchInput"));
        searchBox.sendKeys("Microsoft");

        // Paso 3: Hacer clic en el botón de búsqueda
        WebElement searchButton = driver.findElement(By.cssSelector("button.pure-button"));
        searchButton.click();

        // Paso 4: Obtener el título de la nueva página
        String pageTitle = driver.getTitle();

        // Paso 5: Comprobar si el título coincide con "Microsoft" y mostrar un mensaje en la consola
        if (pageTitle.contains("Microsoft")) {
            System.out.println("El título coincide con 'Microsoft'");
        } else {
            System.out.println("El título no coincide con 'Microsoft'");
        }

        // Paso 6: Obtener todos los enlaces de anclaje (etiqueta "a") y mostrar su texto
        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link : links) {
            String linkText = link.getText();
            System.out.println("Texto del enlace: " + linkText);
        }
    }

    @AfterAll
    //Al final, cerramos el navegador
    public static void tearDownDriver() {
        System.out.println(LocalDateTime.now());
        driver.quit();
    }
}