package test;

import api.APIResponse;
import org.testng.annotations.Test;
import api.APIClient;
import api.APIConfig;
import org.testng.Assert;

public class Test01 extends BaseTest {

    // Enviar una solicitud GET al endpoint.
    APIResponse response = APIClient.sendGETRequest(apiUrl);

    @Test
    public void endpointExists() {
        // Verificar que el código de estado sea 200.
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200, "El endpoint no existe.");
    }

    @Test
    public void endpointIsEmpty(){
        //Verificar que el cuerpo del Response este vacío.
        String bodyCode = response.getResponseBody();
        Assert.assertEquals(bodyCode, "[]", "El endpoint no esta vacio");
    }
}
