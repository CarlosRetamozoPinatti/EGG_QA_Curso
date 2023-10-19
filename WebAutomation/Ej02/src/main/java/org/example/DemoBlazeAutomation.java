package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DemoBlazeAutomation {
    public static void main(String[] args) {
        // Configura el WebDriver de Chrome
        System.setProperty("webdriver.chrome.driver", "D:/Installers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        // Configura una espera implícita para todas las operaciones de búsqueda
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Navega a la página https://demoblaze.com/
        driver.get("https://demoblaze.com/");

        // Escenario 1: Registro Exitoso
        //signUp(driver);

        // Escenario 2: Navegación a "About Us" y reproducción de video
        //navigateToAboutUsAndPlayVideo(driver);

        // Escenario 3: Compra de un portátil
        purchaseLaptop(driver);

        // Cierra el navegador al finalizar
        driver.quit();
    }

    public static void signUp(WebDriver driver) {
        // Haz clic en el botón "Sign up" en la página principal
        WebElement signUpButton = driver.findElement(By.cssSelector("#signin2"));
        signUpButton.click();

        // Completa el formulario de registro
        WebElement usernameField = driver.findElement(By.cssSelector("#sign-username"));
        usernameField.sendKeys("usuarioTest");

        WebElement passwordField = driver.findElement(By.cssSelector("#sign-password"));
        passwordField.sendKeys("passTest");

        WebElement signUpModalButton = driver.findElement(By.cssSelector("body.modal-open:nth-child(2) div.modal.fade.show:nth-child(2) div.modal-dialog div.modal-content div.modal-footer > button.btn.btn-primary:nth-child(2)"));
        signUpModalButton.click();

        System.out.println("Se creó el usuario usuarioTest, con clave passTest");
    }

    public static void navigateToAboutUsAndPlayVideo(WebDriver driver) {
        // Haz clic en el enlace "About Us" en la barra de navegación
        WebElement aboutUsLink = driver.findElement(By.cssSelector("nav.navbar.navbar-toggleable-md.bg-inverse:nth-child(5) div.navbar-collapse ul.navbar-nav.ml-auto li.nav-item:nth-child(3) > a.nav-link"));
        aboutUsLink.click();

        // Reproduce el video (el selector del reproductor de video dependerá de la estructura real)
        WebElement videoPlayer = driver.findElement(By.cssSelector("body.modal-open:nth-child(2) div.modal.fade.show:nth-child(4) div.modal-dialog div.modal-content div.modal-body form:nth-child(1) div.form-group div.video-js.vjs-paused.example-video-dimensions.vjs-controls-enabled.vjs-workinghover.vjs-v7.vjs-user-active > button.vjs-big-play-button"));
        videoPlayer.click();

        System.out.println("El video se reprodujo correctamente");
    }

    public static void purchaseLaptop(WebDriver driver) {
        //Desplegar el menu de laptops.
        WebElement laptopMenu = driver.findElement(By.linkText("Laptops"));
        laptopMenu.click();

        // Selecciona un portátil (el selector del enlace del portátil dependerá de la estructura real)
        WebElement laptopLink = driver.findElement(By.cssSelector("div.container:nth-child(6) div.row div.col-lg-9 div.row:nth-child(1) div.col-lg-4.col-md-6.mb-4:nth-child(1) div.card.h-100 div.card-block:nth-child(2) h4.card-title:nth-child(1) > a.hrefch"));
        laptopLink.click();

        // Agrega el portátil al carrito (el selector del botón "Agregar al carrito" dependerá de la estructura real)
        WebElement addToCartButton = driver.findElement(By.linkText("Add to cart"));
        addToCartButton.click();

        // Ve al carrito de compras
        WebElement cartLink = driver.findElement(By.cssSelector("#cartur"));
        cartLink.click();

        //Dar de alta la orden de compra
        WebElement cartBuy = driver.findElement(By.cssSelector("body:nth-child(2) div:nth-child(7) div.row div.col-lg-1 > button.btn.btn-success:nth-child(3)"));
        cartBuy.click();

        //Relleno el formulario de compra
        WebElement name = driver.findElement(By.cssSelector("#name"));
        name.sendKeys("Charlie");

        WebElement country = driver.findElement(By.cssSelector("#country"));
        country.sendKeys("Uganda");

        WebElement city = driver.findElement(By.cssSelector("#city"));
        city.sendKeys("Capital de Uganda");

        WebElement creditCard = driver.findElement(By.cssSelector("#card"));
        creditCard.sendKeys("123123123");

        WebElement month = driver.findElement(By.cssSelector("#month"));
        month.sendKeys("OSVALDO");

        WebElement year = driver.findElement(By.cssSelector("#year"));
        year.sendKeys("1984");

        WebElement buy = driver.findElement(By.cssSelector("body.modal-open:nth-child(2) div.modal.fade.show:nth-child(3) div.modal-dialog div.modal-content div.modal-footer > button.btn.btn-primary:nth-child(2)"));
        buy.click();

        WebElement finish = driver.findElement(By.cssSelector("body.modal-open.stop-scrolling:nth-child(2) div.sweet-alert.showSweetAlert.visible:nth-child(19) div.sa-button-container:nth-child(9) div.sa-confirm-button-container > button.confirm.btn.btn-lg.btn-primary"));
        finish.click();

        System.out.println("Se compró todo");

    }
}
