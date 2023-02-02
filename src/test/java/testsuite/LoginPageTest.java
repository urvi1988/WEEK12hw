package testsuite;

import com.google.common.base.Verify;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import testbase.TestBase;

public class LoginPageTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
    public void userShouldNavigateToLoginPageSuccessFully(){
        homePage.clickonLoginLink();
        String actualMsg = loginPage.getWelcomeText();
        String expectedMsg = "Welcome, Please Sign In!";
        Assert.assertEquals(actualMsg,expectedMsg,"Login page verified");
    }
    @Test
    public void verifyTheErrorMessageWithInValidCredentials(){
        homePage.clickonLoginLink();
        loginPage.enterEmailId("apple.banana@gmail.com");
        loginPage.enterPassword("Apple123@");
        loginPage.clickOnLoginButton();
        String actualMsg= loginPage.errorMessage();
        String expectedMsg="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actualMsg,expectedMsg,"Error message verified");
    }
    @Test
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.clickonLoginLink();
        loginPage.enterEmailId("apple.banana@gmail.com");
        loginPage.enterPassword("Apple123@");
        loginPage.clickOnLoginButton();
        String actualMsg= homePage.verifylogoutlink();
        String expectedMsg = "Log out";
       Assert.assertEquals(actualMsg,expectedMsg,"Logout link is verified");
    }
    @Test
    public void VerifyThatUserShouldLogOutSuccessFully(){
        homePage.clickonLoginLink();
        loginPage.enterEmailId("apple.banana@gmail.com");
        loginPage.enterPassword("Apple123@");
        loginPage.clickOnLoginButton();
        homePage.clickonLogoutLink();
        String actualMsg=homePage.verifyloginlink();
        String expectedMsg = "Log in";
        Assert.assertEquals(actualMsg,expectedMsg,"Login link verified");

    }

}
