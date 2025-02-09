package API.Tests;

import API.ReusableMethods.ConfigReader;
import API.builderClass.ApplicationRequestBuilder;
import org.testng.annotations.Test;

import java.io.IOException;

public class Test3 {
    @Test
    public void getPath() throws IOException {
        String url=ConfigReader.getProperty("baseUrl");
        System.out.println(url);
        ApplicationRequestBuilder apt=new ApplicationRequestBuilder();
        System.out.println(apt.buildApplicationRequest2());
        System.out.println(apt.buildApplicationRequest3());

    }
}
