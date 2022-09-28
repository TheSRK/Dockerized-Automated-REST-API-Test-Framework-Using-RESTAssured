package Runners;

import Resquests.CustomerList;
import org.testng.annotations.Test;

public class CustomerListTests {
    CustomerList customerList = new CustomerList();

    @Test(priority = 1)
    public void testGetCustomerList(){
        //call GET customer list api
        customerList.getCustomerList();
    }
}
