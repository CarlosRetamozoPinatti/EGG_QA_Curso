package test;

import api.APIResponse;
import com.google.gson.Gson;
import org.testng.annotations.Test;
import api.APIClient;
import models.User;
import org.testng.Assert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test02 extends BaseTest {

    @Test
    public void createUser() {
        // Crear una lista de 5 nuevos usuarios con datos únicos
        List<User> users = Arrays.asList(
                new User("nombreUsuario1", "correo1@ejemplo.com", 33441),
                new User("nombreUsuario2", "correo2@ejemplo.com", 33442),
                new User("nombreUsuario3", "correo3@ejemplo.com", 33443),
                new User("nombreUsuario4", "correo4@ejemplo.com", 33444),
                new User("nombreUsuario5", "correo5@ejemplo.com", 33445)
        );

        // Verificar que no haya correos electrónicos duplicados entre los usuarios creados
        Set<String> uniqueEmails = new HashSet<>();
        for (User user : users) {
            // Verificar si el correo ya existe en la lista
            Assert.assertTrue(uniqueEmails.add(user.getEmail()), "Los correos electrónicos de los nuevos usuarios no deben ser iguales.");
        }

        // Obtener el cuerpo del Response
        APIResponse getUsersResponse = APIClient.sendGETRequest(apiUrl);
        String usersResponseBody = getUsersResponse.getResponseBody();

        // Verificar que no haya correos electrónicos duplicados entre los usuarios existentes
        for (User user : users) {
            Assert.assertFalse(usersResponseBody.contains(user.getEmail()), "El correo electrónico del nuevo usuario está duplicado.");
        }

        // Enviar una solicitud POST para crear cada uno de los nuevos usuarios
        for (User user : users) {
            // Convertir el objeto User a JSON
            Gson gson = new Gson();
            String requestBody = gson.toJson(user);

            // Enviar una solicitud POST para crear el nuevo usuario
            APIResponse response = APIClient.sendPOSTRequest(apiUrl, requestBody);

            // Verificar que la respuesta sea exitosa (código de estado 201 u otro código adecuado)
            int statusCode = response.getStatusCode();
            Assert.assertEquals(statusCode, 201, "La creación del usuario no fue exitosa.");
            System.out.println(user);
            System.out.println(requestBody);
        }
    }
}
