package TestScripts;

import ObjectRepository.AdminAccountPage;
import ObjectRepository.LoginPage;
import ObjectRepository.PatientRegisterPage;
import Resources.Base;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.IOException;

public class PatientRegisterTest extends Base {


    @Test(priority = 1)
    public void log() throws IOException {

        LoginTest test = new LoginTest();
        test.login();

    }

    @Test(priority = 2)
    public void register() throws InterruptedException {

        AdminAccountPage adminAccount = new AdminAccountPage(driver);

        adminAccount.patientRegister().click();

        PatientRegisterPage patientReg = new PatientRegisterPage(driver);

        patientReg.givenName().sendKeys("Chathura");
        patientReg.middleName().sendKeys("bandara");
        patientReg.familyName().sendKeys("Herath");
        patientReg.nextButton1().click();

        Select patientGender = new Select(patientReg.gender());
        patientGender.selectByValue("F");

        patientReg.nextButton1().click();
        patientReg.birthDay().sendKeys("11");

        Select selectBirthMonth = new Select(patientReg.birthMonth());
        selectBirthMonth.selectByValue("1");

        patientReg.birthYear().sendKeys("1998");
        patientReg.estimatedYears().sendKeys("12");
        patientReg.estimatedMonths().sendKeys("2");
        patientReg.nextButton1().click();

        patientReg.addressField1().sendKeys("No. 8/6");
        patientReg.addressField2().sendKeys("peradeniya");
        patientReg.cityVillageField().sendKeys("Kandy");
        patientReg.stateProvinceField().sendKeys("Central");
        patientReg.countryField().sendKeys("Sri Lanka");
        patientReg.postalCodeField().sendKeys("20000");
        patientReg.nextButton1().click();
        patientReg.phoneNumber().sendKeys("0765656123");
        patientReg.nextButton1().click();

        Select patientRelation = new Select(patientReg.relationshipType());
        patientRelation.selectByValue("8d91a01c-c2cc-11de-8d13-0010c6dffd0f-A");
        patientReg.relationName().sendKeys("Amila");
        patientReg.nextButton1().click();
        patientReg.submitButton().click();

    }

}
