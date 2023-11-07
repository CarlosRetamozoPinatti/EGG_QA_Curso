package swapitest.test;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import swapitest.pojos.People;
import swapitest.pojos.Planet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.*;

public class SWAPITest {
    private static Response peopleClassResponse;

    @BeforeTest
    public void SetUp(){
        RestAssured.baseURI = "https://swapi.dev/api/";
        peopleClassResponse = given().when().get("people/2");
    }

    @Test
    public void PeopleEndpointTest(){
        assertEquals(200, peopleClassResponse.getStatusCode());
        People people = peopleClassResponse.then().extract().as(People.class);
        assertEquals("gold", people.getSkinColor());
        assertEquals(6, people.getFilms().size());
        System.out.println(people);
    }

    @Test
    public void PeopleElementsTest(){
        //De la pagina people/2/ guardada en classResponse, traemos el item de indice 1 del atributo lista Films
        //Dicho elemento se guarda en el Response filmResponse.
        Response filmResponse = given().when().get(peopleClassResponse.jsonPath().getString("films[1]"));
        assertEquals(200, filmResponse.getStatusCode());

        String releaseDate = filmResponse.jsonPath().getString("release_date");
        assertTrue(validateDateFormat(releaseDate));

        //Verifico que todas los atributos lista correspondientes a filmResponse tengan mas de 1 elemento.
        assertTrue(filmResponse.jsonPath().getList("characters").size() > 1);
        assertTrue(filmResponse.jsonPath().getList("planets").size() > 1);
        assertTrue(filmResponse.jsonPath().getList("starships").size() > 1);
        assertTrue(filmResponse.jsonPath().getList("vehicles").size() > 1);
        assertTrue(filmResponse.jsonPath().getList("species").size() > 1);
    }

    @Test
    public void PlanetThroughPeopleEndpoint() throws FileNotFoundException {
        //Primero, desde la clase people, accedo al endpoint del film - aqui deberia buscar el 6.
        String lastFilmUrl = peopleClassResponse.jsonPath().getString("films[-1]");

        //Asigno la url obtenida a un nuevo objeto Response y verifico que el acceso sea correcto.
        Response filmClassResponse = given().when().get(lastFilmUrl);
        assertEquals(200, filmClassResponse.getStatusCode());

        //Realizo lo mismo, utilizando la pelicula, para obtener el planeta, y luego creo un objeto en base al mismo.
        String firstPlanetUrl = filmClassResponse.jsonPath().getString("planets[0]");
        Response planetClassResponse = given().when().get(firstPlanetUrl);
        assertEquals(200, planetClassResponse.getStatusCode());
        Planet planet = planetClassResponse.then().extract().as(Planet.class);

        //Obtengo los atributos a comparar. Gravity y Climate.
        String responseClimate = planet.getClimate();
        String responseGravity = planet.getGravity();

        //Creo otro objeto Planet a partir del fixture y obtengo los atributos.
        //Paso 1 - Defino donde esta ubicado mi JSON
        String fixturePath = "D:/Programacion/Cursados/EGG/APITesting/Ej03/src/test/java/fixtures/Planet.json";
        //Con la dependencia Gson, creo un nuevo objeto Planet
        Gson gson = new Gson();
        FileReader fileReader = new FileReader(fixturePath);
        Planet fixturePlanet = gson.fromJson(fileReader, Planet.class);
        String fixtureClimate = fixturePlanet.getClimate();
        String fixtureGravity = fixturePlanet.getGravity();

        //Comparo.
        assertEquals(responseClimate,fixtureClimate);
        assertEquals(responseGravity, fixtureGravity);
    }

    @Test
    public void testFilmNotFound() {
        Response film7Response = given().when().get("films/7/");
        assertEquals(404, film7Response.getStatusCode());
    }

    //METODOS AUXILARES
    private boolean validateDateFormat(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateFormat.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}

