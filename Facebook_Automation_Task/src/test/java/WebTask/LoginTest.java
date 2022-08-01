package WebTask;

import Utilities.ReadXLdata;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test(dataProviderClass = ReadXLdata.class,dataProvider="testData")
    public void TestLogin(String username,String password){

        loginPage.setEmail(username);
        loginPage.setPassword(password);
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.fbMsgIsDisplayed());

    }
}
