package api_endpoints;

import api_payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class User_End_Points {
    // This class performs CRUD operation for 'user' service


// This is for create method
    public static Response createUser(User payload){
        Response response=given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                .post(Roots.Post_User_Url);
                 return response;


    }
    // This is for read method
    public static Response readUser(String username){
        Response response=given()
                .pathParam("userName",username)
                .when()
                .get(Roots.Get_User_Url);
                return response;
    }
    // This is for update method
    public static Response updateUser(String username,User payload){
        Response response=given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParam("userName",username)
                .body(payload)
                .when()
                .put(Roots.Update_User_Url);
                 return response;

    }
    // This is for delete method
    public static Response deleteUser(String username){
        Response response=given()
                .pathParam("userName",username)
                .when()
                .delete(Roots.Delete_User_Url);
                 return response;
    }
}
