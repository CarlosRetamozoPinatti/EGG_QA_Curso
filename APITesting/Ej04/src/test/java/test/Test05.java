package test;

import api.APIClient;
import api.APIResponse;
import com.google.gson.Gson;
import models.Transaction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test05 extends BaseTest {

    @Test
    public void verifyCorrectDeposit() {
        // Crear un objeto Transaction para representar el depósito
        Transaction depositTransaction = new Transaction();
        depositTransaction.setType("deposit");
        depositTransaction.setAmount(1000);

        // Convertir el objeto Transaction a JSON
        String requestBody = new Gson().toJson(depositTransaction);

        // Enviar una solicitud POST para realizar el depósito
        APIResponse response = APIClient.sendPOSTRequest(apiUrl2, requestBody);

        // Verificar que la respuesta sea exitosa (código de estado 201 - CREADO)
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 201, "El depósito de dinero no fue exitoso.");
    }
}
