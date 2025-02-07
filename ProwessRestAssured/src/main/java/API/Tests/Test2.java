package API.Tests;

import API.ReusableMethods.RestUtil;
import API.builderClass.ApplicationRequestBuilder;
import API.constants.frameworkConstant;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
    @Test
    public void putImplementation() throws JsonProcessingException {

            RestUtil rs=new RestUtil();
            ApplicationRequestBuilder apt=new ApplicationRequestBuilder();
            Response res=rs.putMethod(frameworkConstant.baseURI,frameworkConstant.username,frameworkConstant.password, apt.buildApplicationRequest(), "/da/rest/deploy/application/allPagedNew");
            System.out.println(res.getStatusCode());
            System.out.println(res.getBody().prettyPrint());
        }
}
