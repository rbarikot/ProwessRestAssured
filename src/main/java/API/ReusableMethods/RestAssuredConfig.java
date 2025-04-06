package API.ReusableMethods;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RestAssuredConfig {
    private static final ThreadLocal<RequestSpecification> requestSpec = new ThreadLocal<>();
    public static RequestSpecification getRequestSpec() {
        if(requestSpec.get() == null) {
            RequestSpecification spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("baseURI")).build();
            requestSpec.set(spec);
        }
        return requestSpec.get();
    }
}
