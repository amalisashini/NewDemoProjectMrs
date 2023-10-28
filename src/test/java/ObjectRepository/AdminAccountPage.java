package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminAccountPage {

    WebDriver driver;

    public AdminAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//h4[contains(text(),'Logged')]")
    private WebElement adminTitle;

    @FindBy(xpath="//a[@href='/openmrs/appui/header/logout.action?successUrl=openmrs']")
    private WebElement logout;

    @FindBy(id="referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")
    private WebElement patientRegister;

    @FindBy(id="coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")
    private WebElement FindPatient;

    @FindBy(id="appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension")
    private WebElement appointmentScheduling;

    public WebElement adminTitle(){
        return adminTitle;
    }

    public WebElement logout(){
        return logout;
    }

    public WebElement patientRegister(){
        return patientRegister;
    }

    public WebElement FindPatient(){
        return FindPatient;
    }

    public WebElement appointmentScheduling(){
        return appointmentScheduling;
    }

}
