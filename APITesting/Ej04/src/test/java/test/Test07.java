package test;

import api.APIClient;
import api.APIResponse;
import com.google.gson.Gson;
import models.Transaction;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test07 extends BaseTest {

    @Test
    public void verifyCorrectWithdrawal() {
        // Obtener la lista actual de transacciones
        APIResponse getTransactionsResponse = APIClient.sendGETRequest(apiUrl);
        String transactionsResponseBody = getTransactionsResponse.getResponseBody();

        // Convertir la respuesta JSON a una lista de objetos Transaction
        List<Transaction> transactions = Arrays.stream(new Gson().fromJson(transactionsResponseBody, Transaction[].class)).collect(Collectors.toList());

        // Verificar que haya al menos una transacción para actualizar
        Assert.assertTrue(transactions.size() > 0, "No hay transacciones para actualizar.");

        // Tomar la primera transacción de la lista para actualizarla
        Transaction transactionToUpdate = transactions.get(0);
        transactionToUpdate.setType("withdraw");  // Tipo actualizado a "withdraw"
        transactionToUpdate.setAmount(300);  // Valor actualizado a uno menor

        // Convertir el objeto Transaction actualizado a JSON
        String requestBody = new Gson().toJson(transactionToUpdate);

        // Enviar una solicitud PUT para realizar la actualización de la transacción
        APIResponse response = APIClient.sendPUTRequest(apiUrl2 + "/" + transactionToUpdate.getId(), requestBody);

        // Verificar que la respuesta sea exitosa (código de estado 200 u otro código adecuado)
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200, "La actualización de la transacción no fue exitosa.");

        // Verificar que el tipo de la transacción actualizada sea "withdraw"
        Assert.assertEquals(transactionToUpdate.getType(), "withdraw", "El tipo de la transacción actualizada no es correcto.");

        // Verificar que el monto de la transacción actualizada sea 300
        Assert.assertEquals(transactionToUpdate.getAmount(), 300, "El monto de la transacción actualizada no es correcto.");
    }
}


