package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="username")
    private WebElement userNameField;

    @FindBy(id="password")
    private WebElement passwordField;

    @FindBy(id="Registration Desk")
    private WebElement location;

    @FindBy(id="loginButton")
    private WebElement loginButton;

    public WebElement userNameField(){
        return userNameField;
    }

    public WebElement passwordField(){
        return passwordField;
    }

    public WebElement location(){
        return location;
    }

    public WebElement loginButton(){
        return loginButton;
    }

}

