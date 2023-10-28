package TestScripts;

import ObjectRepository.LoginPage;
import Resources.Base;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class systemAdministration extends Base {

    @Test
    public void SystemAdminTest() {


        LoginPage login = new LoginPage(driver);

        login.userNameField().sendKeys("Admin");
        login.passwordField().sendKeys("Admin123");
        login.location().click();
        login.loginButton().click();

    }


}
