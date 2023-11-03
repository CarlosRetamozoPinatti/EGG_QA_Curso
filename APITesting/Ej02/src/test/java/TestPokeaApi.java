import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestPokeaApi {
    Response response;
    public void TestEjemplo(){

        response = given().get();
        Assert.assertEquals();
    }
}
