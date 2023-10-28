package TestScripts;

import Resouces.Base;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class systemAdministration extends Base {

    @Test
    public void SystemAdminTest(String username, String password){

        LoginTest test = new LoginTest();
        test.login(username, password);


    }

    @DataProvider
    public Object[][] userCredentialsData(){

        Object[][] data = new Object[1][2];

        data[0][0] = "Admin";
        data[0][1] = "Admin123";

        return data;

    }

}
