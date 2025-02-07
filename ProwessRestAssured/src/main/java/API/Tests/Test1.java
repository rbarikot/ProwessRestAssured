package API.Tests;

import API.ReusableMethods.RestUtil;
import API.constants.frameworkConstant;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
    @Test
    public void getImplementation() {

            RestUtil rs=new RestUtil();
            Response res=rs.getMethod(frameworkConstant.baseURI,frameworkConstant.username,frameworkConstant.password,"/da/rest/deploy/application");
            System.out.println(res.getBody().asString());
            Assert.assertEquals(res.getStatusCode(),200);
        }
}
