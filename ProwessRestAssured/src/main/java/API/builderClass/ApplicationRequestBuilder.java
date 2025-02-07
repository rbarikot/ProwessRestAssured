package API.builderClass;

import API.pojo.ApplicationRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;

public class ApplicationRequestBuilder {

    public String buildApplicationRequest() throws JsonProcessingException {
        Faker faker = new Faker();
        ObjectMapper mapper = new ObjectMapper();
        ApplicationRequest apr=ApplicationRequest.builder().name(String.valueOf(faker.name())).description(String.valueOf(faker.business())).notificationID("00000000-0000-0000-0000-000000000000").build();
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(apr);
    }
}
