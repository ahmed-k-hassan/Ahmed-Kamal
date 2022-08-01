package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private By newAccountBtn=By.xpath("//a[text()='Create New Account']");
    private By firstName=By.xpath("//input[@name='firstname']");
    private By lastName=By.xpath("//input[@name='lastname']");
    private By emailAddress=By.xpath("//input[@name='reg_email__']");
    private By confirmEmailAddress=By.xpath("//input[@name='reg_email_confirmation__']");
    private By password=By.id("password_step_input");
    private By day=By.id("day");
    private By month=By.id("month");
    private By year=By.id("year");
    private By maleGender=By.xpath("//label[text()='Male']");
    private By femaleGender=By.xpath("//label[text()='Female']");
    private By signUpBtn=By.xpath("//button[@name='websubmit']");
    private By confirmationCode=By.xpath("//span[text()='Enter confirmation code']");

    public RegistrationPage( WebDriver driver)
    {
        this.driver=driver;
    }

    public void clickCreateNewAccButton(){

        driver.findElement(newAccountBtn).click();
    }
    public void setFirstName(String fName){

        wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
        driver.findElement(firstName).sendKeys(fName);
    }
    public void setLastName(String lName){

        driver.findElement(lastName).sendKeys(lName);
    }
    public void setEmail(String email){

        driver.findElement(emailAddress).sendKeys(email);
    }
    public void setConfirmEmailAddress(String confirmEmail){

        driver.findElement(confirmEmailAddress).sendKeys(confirmEmail);
    }
    public void setPassword(String pass){

        driver.findElement(password).sendKeys(pass);
    }
    public void setDay(String Day){

        driver.findElement(day).sendKeys(Day);
    }
    public void setMonth(String Month){

        driver.findElement(month).sendKeys(Month);
    }
    public void setYear(String Year){

        driver.findElement(year).sendKeys(Year);
    }
    public void setMaleGender(){

        driver.findElement(maleGender).click();

    }
    public void setFemaleGender(){

        driver.findElement(femaleGender).click();

    }
    public void clickSignUpBtn(){

        driver.findElement(signUpBtn).click();
    }
    public boolean msgIsDisplayed(){
        wait=new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmationCode));
        boolean msg=  driver.findElement(confirmationCode).isDisplayed();
        return msg;
    }



}
