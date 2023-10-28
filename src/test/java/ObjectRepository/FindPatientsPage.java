package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindPatientsPage {

    WebDriver driver;

    public FindPatientsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="patient-search")
    private WebElement patientSearch;

    @FindBy(xpath="//tr[@class='odd']")
    private WebElement selectedPatient;

    public WebElement patientSearch(){
        return patientSearch;
    }

    public WebElement selectedPatient(){
        return selectedPatient;
    }

}
