package TestScripts;

import ObjectRepository.AdminAccountPage;
import ObjectRepository.FindPatientsPage;
import ObjectRepository.LoginPage;
import Resources.Base;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FindPatientsTest extends Base {

    @Test(dataProvider = "loginData", priority = 1)
    public void log(String username, String password){

        LoginPage login = new LoginPage(driver);

        login.userNameField().sendKeys(username);
        login.passwordField().sendKeys(password);
        login.location().click();
        login.loginButton().click();

    }

    @Test(priority = 2)
    public void findPatients() throws InterruptedException {

        AdminAccountPage admin = new AdminAccountPage(driver);

        admin.FindPatient().click();

        FindPatientsPage searchPatient = new FindPatientsPage(driver);

        searchPatient.patientSearch().sendKeys("100j27");
        Thread.sleep(1000);
        searchPatient.selectedPatient().click();

    }

    @DataProvider
    public Object[][] loginData() {

        Object[][] data = {{"Admin", "Admin123"}};

        return data;

    }


}
