import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class LogoutTest {

    @BeforeMethod
    public void beforeLogout() {
        System.out.println("Ejecutando: Antes del cierre de sesión.");
        System.out.println("Aca no se me ocurre que se debería ver.");
    }

    @Test
    public void testPositiveLogout() {
        System.out.println("Ejecutando: Prueba de cierre de sesión positiva.");
        System.out.println("Aca aparece un mensaje de Log Out exitoso.");
    }

    @Test
    public void testNegativeLogout() {
        System.out.println("Ejecutando: Prueba de cierre de sesión negativa.");
        System.out.println("Aca va un mensaje de ERROR.");
    }

    @AfterMethod
    public void afterLogout() {
        System.out.println("Ejecutando: Después del cierre de sesión.");
        System.out.println("Aca se deberia ver la pantalla de Log In.");
    }
}

