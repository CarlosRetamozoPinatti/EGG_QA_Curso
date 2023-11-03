package swapitest.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import swapitest.pojos.People;

import org.hamcrest.Matchers;

import java.util.Objects;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.*;

public class SWAPITest {
    private static Response classResponse;

    @BeforeTest
    public void SetUp(){
        RestAssured.baseURI = "https://swapi.dev/api/";
        classResponse = given()
                .when()
                .get("people/2");
    }

    @Test
    public void PeopleEndpointTest(){
        assertEquals(200, classResponse.getStatusCode());

        People people = classResponse.then().extract().as(People.class);

        assertEquals("gold", people.getSkinColor());
        assertEquals(6, people.getFilms().size());

        System.out.println(people);
    }

    @Test
    public void PeopleElementsTest(){
        //De la pagina people/2/ guardada en classResponse, traemos el item de indice 1 del atributo lista Films
        //Dicho elemento se guarda en el Response filmResponse.
        Response filmResponse = given()
                .when()
                .get(classResponse.jsonPath().getString("films[1]"));
        assertEquals(200, filmResponse.getStatusCode());

        //Verifico que todas los atributos lista correspondientes a filmResponse tengan mas de 1 elemento.
        assertTrue(filmResponse.jsonPath().getList("characters").size() > 1);
        assertTrue(filmResponse.jsonPath().getList("planets").size() > 1);
        assertTrue(filmResponse.jsonPath().getList("starships").size() > 1);
        assertTrue(filmResponse.jsonPath().getList("vehicles").size() > 1);
        assertTrue(filmResponse.jsonPath().getList("species").size() > 1);
    }

}

