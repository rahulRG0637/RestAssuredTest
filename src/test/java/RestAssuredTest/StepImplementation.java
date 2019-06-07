package RestAssuredTest;

import com.thoughtworks.gauge.Step;
import io.restassured.RestAssured;

public class StepImplementation {

    @Step("Sample Rest Assured request")
    public void setLanguageVowels() {
        //given().when().get("www.google.com").then().statusCode(200);
        //System.out.println("Hello JAvaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int code = RestAssured.given()
                .auth()
                .basic("ToolsQA","TestPassword")
                .when()
                .get("http://restapi.demoqa.com/authentication/CheckForAuthentication")
                .statusCode();

        System.out.println("Responce code : "+code);
    }
}
