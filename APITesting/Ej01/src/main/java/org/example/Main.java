package org.example;

    /*
    EL SIGUIENTE CODIGO NO ES FUNCIONAL - ES A MODO DE EJEMPLO DE COMO SE DEBE VER
    UN CODIGO GENERICO PARA TESTEO DE UNA API DE LIBROS

    DOCUMENTOS EXTRAS PARA EL EJEMPLO:
    - Endpoints.txt
    - AddBook.JSON
    - UpdateBook.JSON
     */

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public class BookApiTester {

        private static final String BASE_URL = "http://api.example.com/books"; // Reemplaza con la URL real de la API.

        public static void main(String[] args) {
            HttpClient httpClient = HttpClient.newHttpClient();

            /* Obtener una lista de todos los libros disponibles.
            Nombre del método: getAllBooks
            Método HTTP: GET
            No se requiere un cuerpo de solicitud.
            Posibles códigos de respuesta:
            200 OK: La solicitud fue exitosa y devuelve la lista de libros.
            404 Not Found: Si no se encontraron libros.
             */
            getAllBooks(httpClient);

            /* Obtener detalles de un libro específico por ID.
            Nombre del método: getBookDetails
            Método HTTP: GET
            Parámetro de ruta: ID del libro
            No se requiere un cuerpo de solicitud.
            Posibles códigos de respuesta:
            200 OK: La solicitud fue exitosa y devuelve los detalles del libro.
            404 Not Found: Si el libro con el ID proporcionado no se encuentra.
             */
            getBookDetails(httpClient, 123);

            /* Agregar un nuevo libro.
            Nombre del método: addBook
            Método HTTP: POST
            Cuerpo de solicitud: Datos del libro a agregar en formato JSON. JSON Ejemplo AddBook.JSON
            Posibles códigos de respuesta:
            201 Created: El libro se ha agregado correctamente.
            400 Bad Request: Si los datos proporcionados no son válidos.
            Actualizar la información de un libro existente proporcionando su ID único:
             */
            addBook(httpClient);

            /* Actualizar información de un libro existente por ID.
            Nombre del método: updateBook
            Método HTTP: PUT
            Parámetro de ruta: ID del libro
            Cuerpo de solicitud: Nuevos datos del libro en formato JSON. JSON Ejemplo UpdateBook.JSON
            Posibles códigos de respuesta:
            200 OK: La actualización se realizó con éxito.
            404 Not Found: Si el libro con el ID proporcionado no se encuentra.
            400 Bad Request: Si los datos proporcionados no son válidos.
             */
            updateBook(httpClient, 456);

            /* Eliminar un libro por ID.
            Nombre del método: deleteBook
            Método HTTP: DELETE
            Parámetro de ruta: ID del libro
            No se requiere un cuerpo de solicitud.
            Posibles códigos de respuesta:
            204 No Content: El libro se eliminó con éxito.
            404 Not Found: Si el libro con el ID proporcionado no se encuentra.
             */
            deleteBook(httpClient, 789);
        }

        private static void getAllBooks(HttpClient httpClient) {
            try {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(new URI(BASE_URL))
                        .GET()
                        .build();

                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println("GET All Books Response Code: " + response.statusCode());
                System.out.println("GET All Books Response Body: " + response.body());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private static void getBookDetails(HttpClient httpClient, int bookId) {
            try {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(new URI(BASE_URL + "/" + bookId))
                        .GET()
                        .build();

                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println("GET Book Details Response Code: " + response.statusCode());
                System.out.println("GET Book Details Response Body: " + response.body());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private static void addBook(HttpClient httpClient) {
            try {
                String newBookData = "{\"title\": \"New Book Title\", \"author\": \"New Book Author\"}";
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(new URI(BASE_URL))
                        .POST(HttpRequest.BodyPublishers.ofString(newBookData))
                        .header("Content-Type", "application/json")
                        .build();

                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println("Add Book Response Code: " + response.statusCode());
                System.out.println("Add Book Response Body: " + response.body());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private static void updateBook(HttpClient httpClient, int bookId) {
            try {
                String updatedBookData = "{\"title\": \"Updated Title\", \"author\": \"Updated Author\"}";
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(new URI(BASE_URL + "/" + bookId))
                        .PUT(HttpRequest.BodyPublishers.ofString(updatedBookData))
                        .header("Content-Type", "application/json")
                        .build();

                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println("Update Book Response Code: " + response.statusCode());
                System.out.println("Update Book Response Body: " + response.body());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private static void deleteBook(HttpClient httpClient, int bookId) {
            try {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(new URI(BASE_URL + "/" + bookId))
                        .DELETE()
                        .build();

                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println("Delete Book Response Code: " + response.statusCode());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
