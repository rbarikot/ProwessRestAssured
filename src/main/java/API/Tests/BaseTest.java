package API.Tests;

import API.ReusableMethods.ConfigReader;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;


public class BaseTest {
    @BeforeClass
    public void setup() {
        RestAssured.baseURI = ConfigReader.getProperty("baseURI");
    }
}
