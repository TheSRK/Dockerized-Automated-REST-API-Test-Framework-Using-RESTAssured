package Resquests;

import Commons.Specification;
import Data.DataLogin;
import Utils.PropertiesManager;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.LinkedHashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Login {
    Map<String, Object> dataMapLoginPayload = new LinkedHashMap<>();
    DataLogin dataLogin = new DataLogin();

    //getting payload data
    public Map<String, Object> getPayload(){
        dataLogin.setDataMapLoginPayload(dataMapLoginPayload);
        return dataLogin.getDataMapLoginPayload();
    }

    //calling Login API
    public void postDoLogin(){
        Response res =
                given().
                        //adding common base request specification
                        spec(Specification.setBaseRequestSpecification()).
                        body(getPayload()).
                when().
                        post(PropertiesManager.getProperty("loginEndPoint")).
                then().
                        log()
                        .all()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = res.jsonPath();
        String token = jsonPath.get("token");
        PropertiesManager.setProperty("token", token);

    }

}
