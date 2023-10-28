package TestScripts;

import ObjectRepository.AdminAccountPage;
import ObjectRepository.LoginPage;
import Resouces.Base;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends Base {

    @Test
    public void login(String userName , String password){

        LoginPage login = new LoginPage(driver);

        login.userNameField().sendKeys(userName);
        login.passwordField().sendKeys(password);
        login.location().click();
        login.loginButton().click();

        AdminAccountPage admin = new AdminAccountPage(driver);

        String actualTitle = admin.adminTitle().getText();
        String expectedTitle = "Logged in as Super User (admin) at Registration Desk.";
        Assert.assertEquals(actualTitle,expectedTitle,"Actual page text is not the same as expected");
        Assert.assertTrue(admin.adminTitle().isDisplayed());

        admin.logout().click();

    }

    @DataProvider
    public Object[][] userCredentialsData(){

        Object[][] data = new Object[1][2];

        data[0][0] = "Admin";
        data[0][1] = "Admin123";

        return data;

    }


}
