package API.ReusableMethods;

import API.exceptions.ApiException;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestUtil {
    public Response putMethod(String username,String password,String put_body,String uri)
    {
        return RestAssured.given().auth().basic(username,password).body(put_body).when().post(uri);
    }
    public Response getMethod(String username,String password,String uri)
    {
        try {
           Response response=RestAssured.given().auth().basic(username, password).when().get(uri);
           if(response.getStatusCode()!=200)
           {
               throw new ApiException("API returned error: " + response.statusCode());
           }
           return response;
        }
        catch (Exception e) {
            throw new ApiException("GET request failed for: " + uri, e);
        }
    }
    public Response postMethod(String username,String password,String post_body,String uri)
    {
        try {
            Response response= RestAssured.given().auth().basic(username, password).body(post_body).when().post(uri);
            if(response.getStatusCode()!=201)
            {
                throw new ApiException("API returned error: " + response.statusCode());
            }
            return response;
        }
        catch (Exception e) {
            throw new ApiException("GET request failed for: " + uri, e);
        }
    }
    public Response  deleteMethod(String username,String password,String uri)
    {
        return RestAssured.given().auth().basic(username,password).when().delete(uri);
    }
}
