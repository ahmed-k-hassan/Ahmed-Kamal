package WebTask;

import Utilities.ReadXLdata;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest{
    @Test(dataProviderClass = ReadXLdata.class,dataProvider="testData")
    public void TestRegistration(String fName,String lName,String Email,String confirmEmail,String password,String day,String month,String year) {
        registrationPage.clickCreateNewAccButton();
        registrationPage.setFirstName(fName);
        registrationPage.setLastName(lName);
        registrationPage.setEmail(Email);
        registrationPage.setConfirmEmailAddress(confirmEmail);
        registrationPage.setPassword(password);
        registrationPage.setDay(day);
        registrationPage.setMonth(month);
        registrationPage.setYear(year);
        registrationPage.setMaleGender();
        registrationPage.clickSignUpBtn();
        Assert.assertTrue(registrationPage.msgIsDisplayed());

    }
}
