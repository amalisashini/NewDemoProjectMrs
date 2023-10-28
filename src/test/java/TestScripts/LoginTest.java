package TestScripts;

import ObjectRepository.AdminAccountPage;
import ObjectRepository.LoginPage;
import Resources.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginTest extends Base {

    public Properties prop;

    @Test(priority = 1)
    public void login() throws IOException {

        LoginPage login = new LoginPage(driver);

        prop = new Properties();
        String propertiesPath = System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\data.properties";
        FileInputStream fis = new FileInputStream(propertiesPath);
        prop.load(fis);

        login.userNameField().sendKeys(prop.getProperty("userName"));
        login.passwordField().sendKeys(prop.getProperty("password"));
        login.location().click();
        login.loginButton().click();

    }

        @Test(priority = 2)
        public void titleTest(){

            AdminAccountPage admin = new AdminAccountPage(driver);

            String actualTitle = admin.adminTitle().getText();
            String expectedTitle = "Logged in as Super User (admin) at Registration Desk.";
            Assert.assertEquals(actualTitle,expectedTitle,"Actual page text is not the same as expected");
            Assert.assertTrue(admin.adminTitle().isDisplayed());

            admin.logout().click();

        }





}
