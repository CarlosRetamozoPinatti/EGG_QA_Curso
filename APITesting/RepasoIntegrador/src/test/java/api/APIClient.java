package api;
/*
Esta clase se encarga de enviar solicitudes HTTP a la API utilizando bibliotecas como RestAssured.
Contiene métodos para realizar solicitudes GET, POST, PUT, etc.,
y devuelve objetos de tipo APIResponse que contienen la respuesta de la API.
APIClient es la interfaz entre las pruebas y la API real.
 */
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIClient {

    public static APIResponse sendGETRequest(String apiUrl) {
        // Envía una solicitud GET a la URL proporcionada y devuelve la respuesta
        Response response = RestAssured.get(apiUrl);
        return new APIResponse(response);
    }

    public static APIResponse sendPOSTRequest(String apiUrl, String requestBody) {
        // Envía una solicitud POST a la URL proporcionada con el cuerpo de la solicitud y devuelve la respuesta
        Response response = RestAssured.given()
                .body(requestBody)
                .post(apiUrl);
        return new APIResponse(response);
    }

    public static APIResponse sendPUTRequest(String apiUrl, String requestBody) {
        // Envía una solicitud PUT a la URL proporcionada con el cuerpo de la solicitud y devuelve la respuesta
        Response response = RestAssured.given()
                .body(requestBody)
                .put(apiUrl);
        return new APIResponse(response);
    }
}
