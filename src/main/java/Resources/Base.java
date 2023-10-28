package Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class Base {

    public WebDriver driver;

    @Parameters({"URL"})
    @BeforeSuite(groups={"smoke"})
    public void openApplication(String url){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get(url);

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @AfterSuite
    public void closeBrowser(){
        driver.quit();
    }

}
