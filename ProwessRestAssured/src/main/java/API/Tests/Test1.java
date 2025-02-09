package API.Tests;

import API.ReusableMethods.ConfigReader;
import API.ReusableMethods.ResponseValidator;
import API.ReusableMethods.RestUtil;
import API.ReusableMethods.RetryAnalyzer;
import API.constants.frameworkConstant;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends BaseTest {
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void getImplementation() {

            RestUtil rs=new RestUtil();
            String uri=ConfigReader.getProperty("baseURI");
            Response res=rs.getMethod(frameworkConstant.username,frameworkConstant.password,"/da/rest/deploy/application");
            System.out.println(res.getBody().asString());
            //Assert.assertEquals(res.getStatusCode(),200);
            ResponseValidator.validateStatusCode(res,200);
        }
}
