package API.Tests;

import API.ReusableMethods.RestUtil;
import API.builderClass.ApplicationRequestBuilder;
import API.constants.frameworkConstant;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Test2 extends BaseTest {
    @Test
    public void putImplementation() throws IOException {

            RestUtil rs=new RestUtil();
            ApplicationRequestBuilder apt=new ApplicationRequestBuilder();
            Response res=rs.putMethod(frameworkConstant.username,frameworkConstant.password, apt.buildApplicationRequest(), "/da/rest/deploy/application/allPagedNew");
            System.out.println(res.getStatusCode());
            System.out.println(res.getBody().prettyPrint());
        }
}
