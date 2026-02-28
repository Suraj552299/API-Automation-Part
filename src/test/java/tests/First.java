package tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class First {
    @Test public void getStatusCode() {


        Response response = RestAssured.given()

                .get("https://automationexercise.com/api/productsList");

        int actualStatusCode = response.getStatusCode();
        System.out.println("actualStatusCode = " + actualStatusCode);
    }

}
