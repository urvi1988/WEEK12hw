package testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import testbase.TestBase;

public class RegisterPageTest extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();


@Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
    homePage.clickonRegisterLink();
    String actualMsg = registerPage.RegisterText();
    String expectedMsg = "Register";
    Assert.assertEquals(actualMsg,expectedMsg,"RegisterText verified");
}
@Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
    homePage.clickonRegisterLink();
    registerPage.clickonRegisterButton();
    String actualMsg = registerPage.verifyFirstnameisrequiredText();
    String expectedMsg = "First name is required.";
    Assert.assertEquals(actualMsg,expectedMsg,"Firstname is required verified");

    String actualMsg1 = registerPage.verifyLastnameisrequiredText();
    String expectedMsg1 = "Last name is required.";
    Assert.assertEquals(actualMsg1,expectedMsg1,"Lastname is required verified");

    String actualMsg2 = registerPage.verifyEmailisrequiredText();
    String expectedMsg2 = "Email is required.";
    Assert.assertEquals(actualMsg2,expectedMsg2,"Email is required verified");

    String actualMsg3 = registerPage.verifyPasswordisrequiredText();
    String expectedMsg3 = "Password is required.";
    Assert.assertEquals(actualMsg3,expectedMsg3,"Password is required verified");

    String actualMsg4= registerPage.verifyPasswordisrequiredText();
    String expectedMsg4= "Password is required.";
    Assert.assertEquals(actualMsg4,expectedMsg4,"confirm password verified");

}
@Test
    public void verifyThatUserShouldCreateAccountSuccessfully() {
    homePage.clickonRegisterLink();
    registerPage.selectMaleFemaleradioButton();
    registerPage.enterFirstname("Apple");
    registerPage.enterLastname("Banana");
    registerPage.selectDateofBirthDay("13");
    registerPage.selectDateofBirthMonth("December");
    registerPage.selectDateofBirthYear("1913");
    registerPage.enterEmailId("apple.banana@gmail.com");
    registerPage.enterPassword("apple123@");
    registerPage.enterPassword("apple123@");
    registerPage.clickonRegisterButton();

    String actualMsg = registerPage.verifyYourRegistrationCompleted();
    String expectedMsg = "Your registration completed";
    Assert.assertEquals(actualMsg,expectedMsg,"Your registration completed verified");
}

}


