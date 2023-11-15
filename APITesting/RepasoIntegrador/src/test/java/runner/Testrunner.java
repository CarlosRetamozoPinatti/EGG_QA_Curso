package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features", //DONDE SE ENCUENTRAN LOS ESCENARIOS DE PRUEBA.
        glue = ("stepdefinitions") //DONDE SE IMPLEMENTAN ESOS ESCENARIOS DE PRUEBA.
        )
public class Testrunner extends AbstractTestNGCucumberTests {
}
