package WebTask;

import Pages.LoginPage;
import Pages.RegistrationPage;
import Utilities.ReadXLdata;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {

    private WebDriver driver;
    protected RegistrationPage registrationPage;
    protected LoginPage loginPage;
    protected ReadXLdata readXL;

    @BeforeMethod
    public void setUp() throws IOException {

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver=new ChromeDriver(options);

        readXL=new ReadXLdata();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        registrationPage=new RegistrationPage(driver);
        loginPage = new LoginPage(driver);

    }
   @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
