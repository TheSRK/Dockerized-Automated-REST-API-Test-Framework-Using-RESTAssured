package Runners;

import Resquests.Login;
import org.testng.annotations.Test;

public class LoginTests {
    Login login = new Login();

    @Test(priority = 0)
    public void testPostDoLogin(){
        login.postDoLogin();
    }
}
