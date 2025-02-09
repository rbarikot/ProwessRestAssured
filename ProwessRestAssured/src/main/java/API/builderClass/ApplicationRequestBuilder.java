package API.builderClass;

import API.ReturnPOJO.ReturnApplicationRequest;
import API.pojo.ApplicationRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ApplicationRequestBuilder {
    private static final ObjectMapper mapper = new ObjectMapper();
    public String buildApplicationRequest() throws IOException {
        ApplicationRequest apr= ReturnApplicationRequest.getApplicationRequest();
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(apr);
    }
    public String buildApplicationRequest2() throws IOException {
        ApplicationRequest apr= ReturnApplicationRequest.getApplicationRequest_excel();
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(apr);
    }
    public String buildApplicationRequest3() throws IOException {
        ApplicationRequest apr= ReturnApplicationRequest.getApplicationRequest_excel_faker();
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(apr);
    }
}
