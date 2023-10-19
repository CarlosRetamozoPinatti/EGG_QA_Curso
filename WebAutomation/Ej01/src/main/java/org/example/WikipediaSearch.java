package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class WikipediaSearch {
    public static void main(String[] args) {
        // Configuración de ChromeDriver
        System.setProperty("webdriver.chrome.driver", "D:/Installers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        // Paso 1: Navegar a la página de Wikipedia
        driver.get("https://www.wikipedia.org");

        // Extra: Esperamos a que cargue la pagina
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Paso 2: Escribir "Microsoft" en la caja de búsqueda
        WebElement searchBox = driver.findElement(By.cssSelector("input#searchInput"));
        searchBox.sendKeys("Microsoft");

        // Paso 3: Hacer clic en el botón de búsqueda
        WebElement searchButton = driver.findElement(By.cssSelector("button.pure-button"));
        searchButton.click();

        // Extra: Esperar a que se cargue la nueva página
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

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

        // Cerrar el navegador al finalizar
        driver.quit();
    }
}
