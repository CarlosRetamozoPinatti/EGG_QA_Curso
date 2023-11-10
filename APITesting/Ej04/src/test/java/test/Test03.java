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
import java.util.stream.Collectors;

public class Test03 extends BaseTest {
    @Test
    public void getNoDuplicates() {
        // Obtener la lista de usuarios existentes
        APIResponse getUsersResponse = APIClient.sendGETRequest(apiUrl);
        String usersResponseBody = getUsersResponse.getResponseBody();

        // Convertir la respuesta JSON a una lista de usuarios
        List<User> existingUsers = Arrays.stream(new Gson().fromJson(usersResponseBody, User[].class)).collect(Collectors.toList());

        // Verificar que no haya correos electrónicos duplicados entre los usuarios existentes
        Set<String> uniqueEmails = existingUsers.stream().map(User::getEmail).collect(Collectors.toSet());
        Assert.assertEquals(uniqueEmails.size(), existingUsers.size(), "Los correos electrónicos de los usuarios existentes no deben ser iguales.");
    }
}
