package API.ReusableMethods;


import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.testng.Assert;
import java.io.File;

public class ResponseValidator {
    @Step("Validating response status code: Expected = {expectedStatus}, Actual = {response.statusCode}")
    public static void validateStatusCode(Response response, int expectedStatus) {
        Assert.assertEquals(response.statusCode(), expectedStatus);
    }

    @Step("Validating response contains field {jsonPath} with expected value: {expectedValue}")
    public static void validateField(Response response, String jsonPath, Object expectedValue) {
        Assert.assertEquals(response.jsonPath().get(jsonPath), expectedValue);
    }

}
