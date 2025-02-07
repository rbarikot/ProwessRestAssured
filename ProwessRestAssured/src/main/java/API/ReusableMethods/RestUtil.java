package API.ReusableMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestUtil {
    public Response putMethod(String baseURIs,String username,String password,String put_body,String uri)
    {
        RestAssured.baseURI=baseURIs;
        return RestAssured.given().auth().basic(username,password).body(put_body).when().post(uri);
    }
    public Response getMethod(String baseURIs,String username,String password,String uri)
    {
        RestAssured.baseURI=baseURIs;
        return RestAssured.given().auth().basic(username,password).when().get(uri);
    }
    public Response postMethod(String baseURIs,String username,String password,String post_body,String uri)
    {
        RestAssured.baseURI=baseURIs;
        return RestAssured.given().auth().basic(username,password).body(post_body).when().post(uri);
    }
    public Response  deleteMethod(String baseURIs,String username,String password,String uri)
    {
        RestAssured.baseURI=baseURIs;
        return RestAssured.given().auth().basic(username,password).when().delete(uri);
    }
}
