import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class ChangeLanguageTest {

    @BeforeMethod
    public void beforeLanguageChange() {
        System.out.println("Ejecutando: Antes del cambio de idioma.");
        System.out.println("Supongo que se deberia ver el idioma por defecto.");
    }

    @Test
    public void testChangeLanguage() {
        System.out.println("Ejecutando: Prueba de cambio de idioma.");
        System.out.println("Aca se deberia ver un menu con todos los idiomas, y poder elegir otro.");
    }

    @AfterMethod
    public void afterLanguageChange() {
        System.out.println("Ejecutando: Después del cambio de idioma.");
        System.out.println("Here you should see the changed language.");
        System.out.println("Hier sollten Sie die geänderte Sprache sehen.");
        System.out.println("Aqui você deve ver o idioma alterado.");
        System.out.println("在這裡你應該看到更改的語言.");
    }
}

