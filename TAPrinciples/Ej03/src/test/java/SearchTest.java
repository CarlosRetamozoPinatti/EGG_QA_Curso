import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class SearchTest {

    @BeforeMethod
    public void beforeSearch() {
        System.out.println("Ejecutando: Antes de la búsqueda.");
        System.out.println("Aca deberia poderse ver la barra de busqueda y escribir en ella.");
    }

    @Test
    public void testSearch() {
        System.out.println("Ejecutando: Prueba de búsqueda.");
        System.out.println("Aca deberían verse los resultados de la busqueda.");
    }

    @AfterMethod
    public void afterSearch() {
        System.out.println("Ejecutando: Después de la búsqueda.");
        System.out.println("Aca debería poderse seleccionar un resultado positivo.");
    }
}

