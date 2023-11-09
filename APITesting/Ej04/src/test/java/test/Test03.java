package test;

import api.APIClient;
import api.APIResponse;
import com.google.gson.Gson;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test03 extends BaseTest {
    @Test
    public void getNoDuplicates() {
        // Obtener la lista de usuarios existentes
        APIResponse getUsersResponse = APIClient.sendGETRequest(apiUrl);
        String usersResponseBody = getUsersResponse.getResponseBody();

        // Convertir la respuesta JSON a una lista de usuarios
        List<User> existingUsers = Arrays.asList(new Gson().fromJson(usersResponseBody, User[].class));
        System.out.println(existingUsers);

        // Verificar que no haya correos electrónicos duplicados entre los usuarios existentes
        Set<String> uniqueEmails = new HashSet<>();
        for (User existingUser : existingUsers) {
            // Verificar si el correo ya existe en la lista
            Assert.assertTrue(uniqueEmails.add(existingUser.getEmail()), "Los correos electrónicos de los usuarios existentes no deben ser iguales.");
        }
    }
}
