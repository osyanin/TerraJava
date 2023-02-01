import io.qameta.allure.Description;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiTest extends TestBase{
    @Test
    @DisplayName("Какой-то апи тест")
    void someApiTest() {
        Response response = given()
                .param("q=get+request+params+example")
                .when().log().all()
                .get("https://www.google.com/search")
                .then().log().all()
                .statusCode(200).extract().response();

        assertEquals("someID", response.path("id").toString(), "Response body is not valid");
    }
}
