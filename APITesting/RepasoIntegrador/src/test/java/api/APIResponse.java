package api;

import io.restassured.response.Response;
/*
Esta clase se utiliza para manejar las respuestas de la API.
Recibe una respuesta de RestAssured y proporciona métodos para acceder
a la información de la respuesta, como el código de estado,
el cuerpo de la respuesta y otros detalles relevantes.
Los tests utilizan APIResponse para analizar y verificar las respuestas recibidas de la API.
 */
public class APIResponse {

    private final Response response;

    public APIResponse(Response response) {
        this.response = response;
    }
    public int getStatusCode() {
        // Obtiene el código de estado de la respuesta
        return response.getStatusCode();
    }
    public String getResponseBody() {
        // Obtiene el cuerpo de la respuesta como una cadena JSON
        return response.asString();
    }
}

