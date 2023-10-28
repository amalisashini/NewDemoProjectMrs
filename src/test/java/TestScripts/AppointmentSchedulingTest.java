package TestScripts;

import ObjectRepository.AdminAccountPage;
import ObjectRepository.AppointmentSchedulingPage;
import ObjectRepository.LoginPage;
import ObjectRepository.ManageServiceTypesPage;
import Resources.Base;
import org.testng.annotations.Test;

public class AppointmentSchedulingTest extends Base {

    @Test(groups={"smoke"},priority = 1)
    public void log(){

        LoginPage login = new LoginPage(driver);

        login.userNameField().sendKeys("Admin");
        login.passwordField().sendKeys("Admin123");
        login.location().click();
        login.loginButton().click();

    }

    @Test(groups={"smoke"},priority = 2)
    public void scheduleAppointment(){

        AdminAccountPage admin = new AdminAccountPage(driver);

        admin.appointmentScheduling().click();

        AppointmentSchedulingPage AppointmentS = new AppointmentSchedulingPage(driver);

        AppointmentS.manageServiceType().click();

        ManageServiceTypesPage manageService = new ManageServiceTypesPage(driver);

        manageService.newServiceTypeButton().click();
        manageService.nameField().sendKeys("Prarthana");
        manageService.duration().sendKeys("30");
        manageService.description().sendKeys("Patient is scheduled");
        manageService.saveButton().click();
        manageService.backHome().click();

    }

    @Test(priority = 3)
    public void manageProviderSchedule(){

        AdminAccountPage admin = new AdminAccountPage(driver);

        admin.appointmentScheduling().click();

        AppointmentSchedulingPage AppointmentS = new AppointmentSchedulingPage(driver);

        AppointmentS.manageProviderSchedules().click();

    }


}
