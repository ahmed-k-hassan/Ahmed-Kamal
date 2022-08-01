package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

        private WebDriver driver;
        private WebDriverWait wait;
        private By usernameField =By.id("email");
        private By passwordField =By.id("pass");
        private By loginButton = By.xpath("//button[@name='login']");
        private By fbWelcomeMsg=By.xpath("//span[contains(text(),'Welcome to Facebook')]");


        public LoginPage( WebDriver driver)
        {
            this.driver=driver;
        }

        public void setEmail(String email){

            driver.findElement(usernameField).sendKeys(email);
        }
        public void setPassword(String password){

            driver.findElement(passwordField).sendKeys(password);
        }
        public void clickLoginButton(){

            driver.findElement(loginButton).click();
        }
        public boolean fbMsgIsDisplayed(){
        wait=new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(fbWelcomeMsg));

        boolean fbMsgValue=driver.findElement(fbWelcomeMsg).isDisplayed();
        return fbMsgValue;
    }



    }
