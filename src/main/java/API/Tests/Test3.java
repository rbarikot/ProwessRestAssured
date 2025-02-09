package API.Tests;

import API.ReusableMethods.ConfigReader;
import API.builderClass.ApplicationRequestBuilder;
import org.testng.annotations.Test;

import java.io.IOException;

public class Test3 extends BaseTest{
    @Test
    public void getPath() throws IOException {
        String url=ConfigReader.getProperty("baseURI");
        System.out.println(url);
        ApplicationRequestBuilder apt=new ApplicationRequestBuilder();
        System.out.println(apt.buildApplicationRequest2());
        System.out.println(apt.buildApplicationRequest3());
        System.out.println(apt.buildStudentDetails());

    }
}
