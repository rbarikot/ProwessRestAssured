package API.Tests;

import API.ReusableMethods.ConfigReader;
import API.ReusableMethods.ResponseValidator;
import API.ReusableMethods.RestUtil;
import API.ReusableMethods.RetryAnalyzer;
import API.constants.frameworkConstant;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Test12 extends BaseTest {
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void getImplementation() {

            RestUtil rs=new RestUtil();
            //String uri=ConfigReader.getProperty("baseURI");
            Response res=rs.getMethodParallel(frameworkConstant.username,frameworkConstant.password,"/da/rest/deploy/application");
            //Response res=rs.getMethod(frameworkConstant.username,frameworkConstant.password,"/da/rest/deploy/application");
            System.out.println(res.getBody().asString());
            //Assert.assertEquals(res.getStatusCode(),200);
            ResponseValidator.validateStatusCode(res,200);
            //ResponseValidator.validateField(res,"id","[492c7339-ca99-4021-aca9-09b14372ac6a, 114d4a85-eb4c-4715-a157-3b2998473d01, 109e9c4b-6d15-4e77-80d4-51610bbc26eb, 581bbf82-af5d-4b6d-aea7-0896a92202ed, 3ac1cfd5-711c-4c99-9c0a-4d803fa56c0c, d4f039e7-f91c-465c-ac61-c0528aad9610, d4f039e7-f91c-465c-ac61-c0528aad9611, cc4503e3-d0c2-4636-866a-8d14aa8c9c7b, b00e3cbd-ec97-41de-b72e-88a1a00fb1b4, 7818cb05-22a5-4569-ae22-59b38fe03678, 9891f3d7-a323-484f-8457-c6a2f8d6c00e, 9167e315-89ab-40d8-b3a1-d66b117c1c4c, 6f9d0b4d-015a-4dd5-b711-1d3c734bc97e, 4fd3a953-6c26-4875-a6d2-e0e27567fa58, 44294f96-d8d9-4a1c-a954-dc4787f584b6, 065cdc31-b634-4fe1-ac5a-b2bdc02dabd1, 1dac49df-5f05-465a-b418-993765378ddc, d923cada-214c-4301-949b-722fd5ef035b, 07a1b581-ea35-4ac9-96b5-577bced79e6d, e81cc09e-3552-4172-b0f7-5081cdaa5cf6, abf7e99e-9455-421f-b977-b37955964ac4, 74f25643-e4ac-4162-9373-0c7b6fe4a71b, 818f5f2b-fd24-4f84-adbf-31408861a0d1, c9d4766a-b209-4e96-a3d6-bc74a6392972, a0b9d5d1-a675-467a-8d5d-5de18c0dc449, b008c72d-4a27-49ac-8365-1b2dc0a97a47, 51d7ccfc-c082-4e0b-95ba-b15e67d667f4, 55736b76-7d2d-4abe-8a8a-69c91b4a3527, 96a022f0-c6cf-4509-8cf9-ed9550206262, a51579a5-4479-4edd-988e-04b0dcb619d4, 2f3363cd-9b95-4f71-a31a-4eacd1b78291, 05158518-26d5-46ef-a6a7-2f1b34f65617, 119106b6-d0bb-42ca-b3ec-b8b82285939b, 4fae98f0-1b1e-4b52-8cda-b4a744294461, b668feda-4f19-46a7-8966-0c49d0f07c23, 51fce52e-790e-481a-9771-2468c0cade4a, 35b2f397-9caa-4454-9d46-003d64529c59, 2c908348-82ff-4b43-9aa6-71dc0e5a201d, 26442fdb-f905-4acb-b873-45e7296b21e6, 59772f5a-abd3-4e62-ad54-f12ff3b576ce, b62ac559-1aa0-4889-bd1c-c3b83994466b, b2bc3170-010a-4613-95f1-b8725a59bf45, af4cf3f7-ed9d-419c-b1b0-b38b6b47b9a7, a9d2bf5a-5c74-444a-8e24-70fc95e3a843, 785f4e4e-7202-4fc5-94b1-d59f811bb860, 60774195-959b-46e9-9a39-a6e19d1c62e2, 93e449cb-bcfa-4d1e-aab6-6c06da28dbc0, c9e551f7-c1c6-417b-8cb1-d202d1916ef0, def3098a-ae3b-4b9f-a149-cc82246e3706, eb27386b-0739-4c4c-8fed-2915deee766f, 92a671ca-52b7-4a98-a99a-16d2496c7a8f, b28029c3-021c-42cb-889e-468b879f8abc, 2497909c-60e7-48af-9cbc-bac461083951, 76ca7221-f8db-42a1-908c-c1c4ba5c3b5c, 231c1758-1d5f-4a51-9ff0-a96bc7dcf28b, 30f50cf8-c0ac-4deb-b5fc-d319ef237061, 0f42b0cc-4a80-4df6-bbfe-14f1d3ae33fb, 90418c3d-2138-460c-a0d8-457d20c153fe, e0b69618-bac7-4666-b966-47e1f19f8214, 6ee74c95-8da8-4dd9-806b-b950412dafe0, 616353f9-37fd-4cd5-93da-a2e0a4400476, 2024f8eb-1068-49d2-9b9a-2ae2d6f2a35c, c1d90e5e-aeb9-421c-9cc3-5b6b7cfec9e4, 9c3ab3ac-961a-4063-945a-136c4c32a982, cb037f1a-bfb5-41e5-83a7-3c6781df9194, 8ff01b80-55f5-4a04-853a-aa30d68dff69, a2636cbe-e51d-4a7a-a652-c42a1bbc168c, e1655646-983e-476b-b3ea-7fca90f1d4b7, 09483afa-efb9-412f-a437-f21fa5e0beaf, 6c01cf5e-7827-4314-8e7c-c444d288ed4a]");
            ResponseValidator.validateFieldNotNull(res,"id");
            ResponseValidator.validateListSize(res,"id",70);
    }
}
