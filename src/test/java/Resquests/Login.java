package Resquests;

import Utils.PropertiesManager;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class Login {
    public PropertiesManager prop = new PropertiesManager("./src/test/resources/config.properties");

    public void postDoLogin(){
        RestAssured.baseURI = prop.getProperty("baseUrl");
        given().
                contentType("application/json").
                body("{\n" +
                        "    \"username\":\"salman\",\n" +
                        "    \"password\":\"salman1234\"\n" +
                        "}").
        when().
                post("/customer/api/v1/login").
        then().
                log()
                .all()
                .statusCode(200)
                .extract()
                .response();

    }

}
