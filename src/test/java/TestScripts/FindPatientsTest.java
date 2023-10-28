package TestScripts;

import ObjectRepository.AdminAccountPage;
import ObjectRepository.FindPatientsPage;
import ObjectRepository.LoginPage;
import Resouces.Base;
import org.testng.annotations.Test;

public class FindPatientsTest extends Base {

    @Test()
    public void log(){

        LoginPage login = new LoginPage(driver);

        login.userNameField().sendKeys("Admin");
        login.passwordField().sendKeys("Admin123");
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


}
