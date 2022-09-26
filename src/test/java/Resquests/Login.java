package Resquests;

import Commons.Specification;
import Utils.PropertiesManager;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class Login {

    public void postDoLogin(){
        given().
                //adding common base request specification
                spec(Specification.getBaseRequestSpecification()).
                body("{\n" +
                        "    \"username\":\"salman\",\n" +
                        "    \"password\":\"salman1234\"\n" +
                        "}").
        when().
                post(PropertiesManager.getProperty("loginEndPoint")).
        then().
                log()
                .all()
                .statusCode(200)
                .extract()
                .response();

    }

}
