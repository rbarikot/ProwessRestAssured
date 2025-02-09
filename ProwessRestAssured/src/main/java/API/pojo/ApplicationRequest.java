package API.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Getter
@Data
public class ApplicationRequest {
    private String name;
    private String description;
    private String notificationID;

}

