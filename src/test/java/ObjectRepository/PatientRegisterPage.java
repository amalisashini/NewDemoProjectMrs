package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientRegisterPage {

    WebDriver driver;

    public PatientRegisterPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="#fr1601-field")
    private WebElement givenName;

    @FindBy(css="#/fr76-field")
    private WebElement middleName;

    @FindBy(id="fr4755-field")
    private WebElement familyName;

    @FindBy(id="next-button")
    private WebElement nextButton1;

    @FindBy(id="gender-field")
    private WebElement gender;

    @FindBy(id="birthdateDay-field")
    private WebElement birthDay;

    @FindBy(id="birthdateMonth-field")
    private WebElement birthMonth;

    @FindBy(id="birthdateYear-field")
    private WebElement birthYear;

    @FindBy(id="birthdateYears-field")
    private WebElement estimatedYears;

    @FindBy(id="birthdateMonths-field")
    private WebElement estimatedMonths;

    @FindBy(id="address1")
    private WebElement addressField1;

    @FindBy(id="address2")
    private WebElement addressField2;

    @FindBy(id="cityVillage")
    private WebElement cityVillageField;

    @FindBy(id="stateProvince")
    private WebElement stateProvinceField;

    @FindBy(id="country")
    private WebElement countryField;

    @FindBy(id="postalCode")
    private WebElement postalCodeField;

    @FindBy(id="fr7702-field")
    private WebElement phoneNumber;

    @FindBy(id="relationship_type")
    private WebElement relationshipType;

    @FindBy(xpath="//input[@class='person-typeahead ng-pristine ng-valid ng-empty ng-touched']")
    private WebElement relationName;

    @FindBy(id="submit")
    private WebElement submitButton;

    public WebElement givenName(){
        return givenName;
    }

    public WebElement middleName(){
        return middleName;
    }

    public WebElement familyName(){
        return familyName;
    }

    public WebElement nextButton1(){
        return nextButton1;
    }

    public WebElement gender(){
        return gender;
    }

    public WebElement birthDay(){
        return birthDay;
    }

    public WebElement birthMonth(){
        return birthMonth;
    }

    public WebElement birthYear(){
        return birthYear;
    }

    public WebElement estimatedYears(){
        return estimatedYears;
    }

    public WebElement estimatedMonths(){
        return estimatedMonths;
    }

    public WebElement addressField1(){
        return addressField1;
    }

    public WebElement addressField2(){
        return addressField2;
    }

    public WebElement cityVillageField(){
        return cityVillageField;
    }

    public WebElement stateProvinceField(){
        return stateProvinceField;
    }

    public WebElement countryField(){
        return countryField;
    }

    public WebElement postalCodeField(){
        return postalCodeField;
    }

    public WebElement phoneNumber(){
        return phoneNumber;
    }

    public WebElement relationshipType(){
        return relationshipType;
    }

    public WebElement relationName(){
        return relationName;
    }

    public WebElement submitButton(){
        return submitButton;
    }

}
