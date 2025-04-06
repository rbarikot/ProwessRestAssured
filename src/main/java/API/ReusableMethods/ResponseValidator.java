package API.ReusableMethods;


import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.testng.Assert;
import java.io.File;
import io.restassured.response.Response;
import org.hamcrest.Matcher;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ResponseValidator {
    //@Step("Validating response status code: Expected = {expectedStatus}, Actual = {response.statusCode}")
    public static void validateStatusCode(Response response, int expectedStatus) {
        Assert.assertEquals(response.statusCode(), expectedStatus);
    }

   // @Step("Validating response contains field {jsonPath} with expected value: {expectedValue}")
    public static void validateField(Response response, String jsonPath, Object expectedValue) {
        Assert.assertEquals(response.jsonPath().get(jsonPath), expectedValue);
    }

    public static void validateFieldContains(Response response, String jsonPath, String substring) {
        String actualValue = response.jsonPath().getString(jsonPath);
        Assert.assertEquals(actualValue, substring);

    }
    public static void validateListContainsAll(Response response, String jsonPath, Object... items) {
        List<Object> actualList = response.jsonPath().getList(jsonPath);
        assertThat(actualList, hasItems(items));
    }
    public static void validateListSize(Response response, String jsonPath, int expectedSize) {
        List<Object> actualList = response.jsonPath().getList(jsonPath);
        assertThat(actualList, hasSize(expectedSize));
    }
    public static void validateFieldNotNull(Response response, String jsonPath) {
        assertThat(response.jsonPath().get(jsonPath), notNullValue());
    }
    public static void validateFieldNull(Response response, String jsonPath) {
        assertThat(response.jsonPath().get(jsonPath), nullValue());
    }

    public static <T extends Comparable<T>> void validateGreaterThan(Response response, String jsonPath, T expected) {
        assertThat(response.jsonPath().get(jsonPath), greaterThan(expected));
    }

    public static <T extends Comparable<T>> void validateLessThan(Response response, String jsonPath, T expected) {
        assertThat(response.jsonPath().get(jsonPath), lessThan(expected));
    }

    public static void validateFieldMatches(Response response, String jsonPath, Matcher<?> matcher) {
        assertThat(response.jsonPath().get(jsonPath), matcher);
    }
}
