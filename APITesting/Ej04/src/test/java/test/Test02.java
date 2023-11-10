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
import java.util.stream.Collectors;

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

        // Verificar que no haya correos electrónicos duplicados
        Set<String> uniqueEmails = users.stream().map(User::getEmail).collect(Collectors.toSet());
        Assert.assertEquals(uniqueEmails.size(), users.size(), "Los correos electrónicos de los nuevos usuarios no deben ser iguales.");

        // Enviar una solicitud POST para cada uno de los nuevos usuarios
        users.forEach(user -> {
            // Convertir el objeto User a JSON
            Gson gson = new Gson();
            String requestBody = gson.toJson(user);

            // Enviar una solicitud POST para crear el nuevo usuario
            APIResponse response = APIClient.sendPOSTRequest(apiUrl, requestBody);

            // Verificar que la respuesta sea exitosa (código de estado 201 u otro código adecuado)
            int statusCode = response.getStatusCode();
            Assert.assertEquals(statusCode, 201, "La creación del usuario no fue exitosa.");
        });
    }
}

