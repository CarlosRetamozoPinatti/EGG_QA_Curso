package test;
import api.APIClient;
import models.Transaction;
import api.APIResponse;
import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test07 extends BaseTest {

    @Test
    public void verifyCorrectWithdrawal() {
        // Obtener la lista actual de transacciones
        APIResponse getTransactionsResponse = APIClient.sendGETRequest(apiUrl);
        String transactionsResponseBody = getTransactionsResponse.getResponseBody();

        // Convertir la respuesta JSON a una lista de objetos Transaction
        Transaction[] transactionsArray = new Gson().fromJson(transactionsResponseBody, Transaction[].class);

        // Verificar que haya al menos una transacción para actualizar
        Assert.assertTrue(transactionsArray.length > 0, "No hay transacciones para actualizar.");

        // Tomar la primera transacción de la lista para actualizarla
        Transaction transactionToUpdate = transactionsArray[0];
        transactionToUpdate.setType("withdraw");  // Tipo actualizado a "withdraw"
        transactionToUpdate.setAmount(300);  // Valor actualizado a uno menor

        // Convertir el objeto Transaction actualizado a JSON
        String requestBody = new Gson().toJson(transactionToUpdate);

        // Enviar una solicitud PUT para realizar la actualización de la transacción
        APIResponse response = APIClient.sendPUTRequest(apiUrl2 + "/" + transactionToUpdate.getId(), requestBody);

        // Verificar que la respuesta sea exitosa (código de estado 200 u otro código adecuado)
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200, "La actualización de la transacción no fue exitosa.");
    }
}

