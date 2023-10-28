package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentSchedulingPage {

    WebDriver driver;

    public AppointmentSchedulingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="appointmentschedulingui-manageAppointmentTypes-app")
    private WebElement manageServiceType;

    @FindBy(id="appointmentschedulingui-scheduleProviders-app")
    private WebElement manageProviderSchedules;

    @FindBy(id="appointmentschedulingui-manageAppointments-app")
    private WebElement manageAppointments;

    @FindBy(id="appointmentschedulingui-scheduledAppointments-app")
    private WebElement dailyAppointments;

    @FindBy(id="appointmentschedulingui-appointmentRequests-app")
    private WebElement appointmentRequest;

    public WebElement manageServiceType(){
        return manageServiceType;
    }

    public WebElement manageProviderSchedules(){
        return manageProviderSchedules;
    }

    public WebElement manageAppointments(){
        return manageAppointments;
    }

    public WebElement dailyAppointments(){
        return dailyAppointments;
    }

    public WebElement appointmentRequest(){
        return appointmentRequest;
    }

}
