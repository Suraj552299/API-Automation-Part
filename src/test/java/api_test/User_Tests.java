package api_test;

import api_endpoints.User_End_Points;
import api_payload.User;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class User_Tests {
    Faker faker;
    User payload;

    @BeforeEach
    public void   setData(){
        faker=new Faker();
        payload=new User();
        payload.setId(faker.idNumber().hashCode());
        payload.setUsername(faker.name().username());
        payload.setFirstName(faker.name().firstName());
        payload.setLastName(faker.name().lastName());
        payload.setEmail(faker.internet().emailAddress());
        payload.setPassword(faker.internet().password(5,10));
        payload.setPhone(faker.phoneNumber().cellPhone());



    }
    @Test
    @Order(1)
    public void test_Post_User(){
        Response response=User_End_Points.createUser(payload);
        response.then().log().all();
        assertEquals(200,response.statusCode());

    }

    @Test
    public void test_Get_User(){
        Response response=User_End_Points.readUser(payload.getUsername());
        assertEquals(200,response.statusCode());
    }

    @Test
    public void test_Update_User(){
        Response response=User_End_Points.updateUser(faker.name().username(),payload);
        assertEquals(response.getStatusCode(),200);
    }

    @Test
    public void test_Delete_User(){
        Response response=User_End_Points.deleteUser(payload.getUsername());
        assertEquals(response.getStatusCode(),200);
    }
}
