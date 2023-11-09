package test;

import api.APIClient;
import api.APIResponse;
import com.google.gson.Gson;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Test04 extends BaseTest{
    private static final int USER_ID = 1;

    @Test
    public void updateExistingAccountNumber() {
        // Obtener la lista de usuarios existentes
        APIResponse getUsersResponse = APIClient.sendGETRequest(apiUrl);
        String usersResponseBody = getUsersResponse.getResponseBody();

        // Convertir la respuesta JSON a una lista de usuarios
        List<User> existingUsers = Arrays.asList(new Gson().fromJson(usersResponseBody, User[].class));
        System.out.println(existingUsers);

        // Verificar que haya al menos un usuario para actualizar
        Assert.assertFalse(existingUsers.isEmpty(), "No hay usuarios para actualizar.");

        // Tomar el primer usuario de la lista para actualizar su número de cuenta
        User userToUpdate = existingUsers.get(0);
        System.out.println(userToUpdate);

        // Generar un nuevo número de cuenta único para la actualización
        Integer newAccountNumber = generateUniqueAccountNumber(existingUsers);

        // Actualizar el número de cuenta del usuario
        userToUpdate.setAccountNum(newAccountNumber);
        System.out.println(userToUpdate);

        // Convertir el objeto User actualizado a JSON
        String requestBody = new Gson().toJson(userToUpdate);
        System.out.println(requestBody);

        // Enviar una solicitud PUT para actualizar el número de cuenta del usuario
        APIResponse response = APIClient.sendPUTRequest(apiUrl + "/" + USER_ID, requestBody);
        System.out.println(apiUrl + "/" + USER_ID);

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
        System.out.println(newAccountNumber);
        return newAccountNumber;
    }
}
