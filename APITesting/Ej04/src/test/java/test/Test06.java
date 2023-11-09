package test;
import api.APIClient;
import models.Transaction;
import api.APIResponse;
import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test06 extends BaseTest{

    @Test
    public void verifyCorrectWithdrawal() {
        // Crear un objeto Transaction para representar el retiro
        Transaction withdrawalTransaction = new Transaction();
        withdrawalTransaction.setType("withdraw");
        withdrawalTransaction.setAmount(500);

        // Convertir el objeto Transaction a JSON
        String requestBody = new Gson().toJson(withdrawalTransaction);

        // Enviar una solicitud POST para realizar el retiro
        APIResponse response = APIClient.sendPOSTRequest(apiUrl2, requestBody);

        // Verificar que la respuesta sea exitosa (código de estado 201 - POST)
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 201, "El retiro de dinero no fue exitoso.");
    }
}
