package Commons;

import Resquests.Login;
import Utils.PropertiesManager;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;

public class Specification {

    //base request spec method without authorization
    public static RequestSpecification getBaseRequestSpecification(){
        return
                given().
                        contentType("application/json").
                        baseUri(PropertiesManager.getProperty("baseUrl"));
    }
}
