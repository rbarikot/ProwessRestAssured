package API.builderClass;

import API.ReturnPOJO.ReturnApplicationRequest;
import API.pojo.ApplicationRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ApplicationRequestBuilder {
    private static final ObjectMapper mapper = new ObjectMapper();
    public String buildApplicationRequest() throws IOException {
       return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(ReturnApplicationRequest.getApplicationRequest());
    }
    public String buildApplicationRequest2() throws IOException {
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(ReturnApplicationRequest.getApplicationRequest_excel());
    }
    public String buildApplicationRequest3() throws IOException {
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(ReturnApplicationRequest.getApplicationRequest_excel_faker());
    }
    public String buildStudentDetails() throws IOException {
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(ReturnApplicationRequest.getStudentDetails());
    }
}
