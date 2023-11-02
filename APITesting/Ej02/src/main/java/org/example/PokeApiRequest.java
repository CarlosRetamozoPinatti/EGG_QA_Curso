package org.example;

/*
AQUI VA UN CODIGO EJEMPLO EN JAVA DE COMO REALIZAR EL PEDIDO A LA API.
SE USA COMO EJEMPLO SOLO LA PARTE DE PIKACHU.
EL PASO A PASO PARA USARLO EN POSTMAN ESTA EN EL DOC PostManTEST.txt
 */

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PokeApiRequest {

    public static void main(String[] args) {
        HttpClient httpClient = HttpClient.newHttpClient();

        // URL de la PokeAPI para obtener datos de Pikachu
        String apiUrl = "https://pokeapi.co/api/v2/pokemon/pikachu";

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(apiUrl))
                    .GET()
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                System.out.println("Respuesta exitosa:");
                System.out.println(response.body());
            } else {
                System.out.println("Error en la solicitud. Código de respuesta: " + response.statusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
