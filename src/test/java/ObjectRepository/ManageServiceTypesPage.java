package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageServiceTypesPage {

    WebDriver driver;

    public ManageServiceTypesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button/i[@class='icon-plus']")
    private WebElement newServiceTypeButton;

    @FindBy(id="name-field")
    private WebElement nameField;

    @FindBy(id="duration-field")
    private WebElement duration;

    @FindBy(id="description-field")
    private WebElement description;

    @FindBy(id="save-button")
    private WebElement saveButton;

    @FindBy(xpath="//a[@href='/openmrs/appointmentschedulingui/home.page']")
    private WebElement backLink;

    @FindBy(xpath = "//a[@href='/openmrs/index.htm']")
    private WebElement backHome;

    public WebElement newServiceTypeButton(){
        return newServiceTypeButton;
    }

    public WebElement nameField(){
        return nameField;
    }

    public WebElement duration(){
        return duration;
    }

    public WebElement description(){
        return description;
    }

    public WebElement saveButton(){
        return saveButton;
    }

    public WebElement backLink(){
        return backLink;
    }

    public WebElement backHome(){
        return backHome;
    }

}
