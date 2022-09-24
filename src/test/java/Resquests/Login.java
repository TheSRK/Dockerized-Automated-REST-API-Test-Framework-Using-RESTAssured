package Resquests;

import Utils.PropertiesManager;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class Login {
    public PropertiesManager prop = new PropertiesManager("./src/test/resources/config.properties");

    public void postDoLogin(){
        RestAssured.baseURI = prop.getProperty("baseUrl");


    }

}
