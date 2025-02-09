package API.ReturnPOJO;

import API.ReusableMethods.ExcelUtils;
import API.ReusableMethods.FakerUtil;
import API.constants.frameworkConstant;
import API.pojo.ApplicationRequest;
import API.pojo.Student;

import java.io.IOException;
import java.util.List;

public class ReturnApplicationRequest {

    public static ApplicationRequest getApplicationRequest() {
        return ApplicationRequest.builder().name(FakerUtil.getRandomName()).description(FakerUtil.getRandomBusiness()).notificationID("00000000-0000-0000-0000-000000000000").build();
    }

    public static ApplicationRequest getApplicationRequest_excel() throws IOException {
        List<String> rowData = ExcelUtils.readRowData(frameworkConstant.ExcelPath, "apprequest", 1);
        return ApplicationRequest.builder().name(rowData.get(0)).description(rowData.get(1)).notificationID("00000000-0000-0000-0000-000000000000").build();
    }
    public static ApplicationRequest getApplicationRequest_excel_faker() throws IOException {
        List<String> rowData = ExcelUtils.readRowData(frameworkConstant.ExcelPath, "apprequest", 1);
        return ApplicationRequest.builder().name(FakerUtil.getRandomName()).description(rowData.get(1)).notificationID("00000000-0000-0000-0000-000000000000").build();
    }
    public static Student getStudentDetails() throws IOException {
        return Student.builder().name(FakerUtil.getRandomName()).description(FakerUtil.getRandomBusiness()).notificationID("00000000-0000-0000-0000-000000000000").age(FakerUtil.getRandomAge()).build();
    }

}
