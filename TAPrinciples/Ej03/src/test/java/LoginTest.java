import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class LoginTest {

    @BeforeMethod
    public void beforeLogin() {
        System.out.println("Ejecutando: Antes del inicio de sesión.");
        System.out.println("Aquí debería visualizarse la pantalla de Log in.");
    }

    @Test
    public void testPositiveLogin() {
        System.out.println("Ejecutando: Prueba de inicio de sesión positiva.");
        System.out.println("Aquí debería visualizarse la página de inicio de usuario.");
    }

    @Test
    public void testNegativeLogin() {
        System.out.println("Ejecutando: Prueba de inicio de sesión negativa.");
        System.out.println("Aquí debería visualizarse una pagina de error en el Log in.");
    }

    @AfterMethod
    public void afterLogin() {
        System.out.println("Ejecutando: Después del inicio de sesión.");
        System.out.println("Aquí debería visualizarse la Home Page.");
    }
}

