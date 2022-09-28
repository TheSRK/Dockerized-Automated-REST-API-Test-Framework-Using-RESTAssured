package Resquests;

import Commons.Specification;
import Utils.PropertiesManager;

import static io.restassured.RestAssured.*;

public class CustomerList {

    //configuring customer list API
    public void getCustomerList(){
        given().
                spec(Specification.setCommonRequestSpecification()).
        when().
                get(PropertiesManager.getProperty("customerListEndPoint"))
        .then()
                .log()
                .all()
                .statusCode(200);

    }
}
