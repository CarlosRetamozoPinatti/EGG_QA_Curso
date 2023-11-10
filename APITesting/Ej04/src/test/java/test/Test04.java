package test;

import api.APIClient;
import api.APIResponse;
import com.google.gson.Gson;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test04 extends BaseTest{
    private static final int USER_ID = 1;

    @Test
    public void updateExistingAccountNumber() {
        // Obtener la lista de usuarios existentes
        APIResponse getUsersResponse = APIClient.sendGETRequest(apiUrl);
        List<User> existingUsers = Arrays.stream(new Gson().fromJson(getUsersResponse.getResponseBody(), User[].class)).collect(Collectors.toList());

        // Verificar que haya al menos un usuario para actualizar
        Optional<User> userToUpdate = existingUsers.stream().findFirst();
        Assert.assertTrue(userToUpdate.isPresent(), "No hay usuarios para actualizar.");

        // Generar un nuevo número de cuenta único para la actualización
        Integer newAccountNumber = generateUniqueAccountNumber(existingUsers);

        // Actualizar el número de cuenta del usuario
        userToUpdate.get().setAccountNum(newAccountNumber);

        // Convertir el objeto User actualizado a JSON
        String requestBody = new Gson().toJson(userToUpdate.get());

        // Enviar una solicitud PUT para actualizar el número de cuenta del usuario
        APIResponse response = APIClient.sendPUTRequest(apiUrl + "/" + USER_ID, requestBody);

        // Verificar que la respuesta sea exitosa (código de estado 200 u otro código adecuado)
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200, "La actualización del número de cuenta no fue exitosa.");
    }

    // Método para generar un número de cuenta único
    private Integer generateUniqueAccountNumber(final List<User> existingUsers) {
        Integer newAccountNumber;
        boolean isDuplicate;
        do {
            // Generar un número de cuenta aleatorio
            newAccountNumber = (int) (Math.random() * 100000);

            // Verificar que el número de cuenta no exista en la lista de usuarios
            isDuplicate = false;
            for (User user : existingUsers) {
                if (user.getAccountNum() == newAccountNumber) {
                    isDuplicate = true;
                    break;
                }
            }
        } while (isDuplicate);
        return newAccountNumber;
    }
}
