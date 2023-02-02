package pages;
//Register Text, male female radio, Firstname, lastname, Date of Birth drop downs, email,
//Password, Confirm Password, Register Button, "First name is required.","Last name is required.",
//"Email is required.","Password is required.", "Password is required." error message,
//"Your registration completed" message, "CONTINUE" button Locators and it's actions

import javafx.scene.control.PasswordField;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utility.Utility;

public class RegisterPage extends Utility {

    By RegisterText= By.xpath("//div[@class='page-title']");
    By MaleFemaleradioButton= By.xpath("//span[@class='female']");
    By Firstnamefield= By.xpath("//input[@id='FirstName']");
    By Lastnamefield= By.xpath("//input[@id='LastName']");
    By DateofbirthDay= By.xpath("//select[@name='DateOfBirthDay']");
    By DateofbirthMonth= By.xpath("//select[@name='DateOfBirthMonth']");
    By DateofbirthYear= By.xpath("//select[@name='DateOfBirthYear']");
    By EmailField= By.id("Email");
    By PasswordField=By.id("Password");
    By ConfirmPassword= By.id("Confirm password");
    By RegisterButton= By.xpath("//button[@id='register-button']");
    By Firstnameisrequired = By.xpath("//span[@id='FirstName-error']");
    By Lastnameisrequired = By.xpath("//span[@id='LastName-error']");
    By Emailisrequired= By.xpath("//span[@id='Email-error']");
    By Passwordisrequired= By.xpath("//span[@id='Password-error']");
    By ConfirmPasswordisrequired= By.id("ConfirmPassword-error");
    By YourRegistrationCompleted= By.xpath("//div[@class='result']");
    By CountinueTab= By.xpath("//a[@class='button-1 register-continue-button']");

    public String RegisterText(){
        return getTextFromElement(RegisterText);
    }
    public void selectMaleFemaleradioButton(){
        clickOnElement(MaleFemaleradioButton);
    }
    public void enterFirstname(String Firstname){
        sendTextToElement(Firstnamefield,Firstname);
    }
    public void enterLastname(String Lastname){
        sendTextToElement(Lastnamefield,Lastname);
    }
    public void selectDateofBirthDay(String Day){
        new Select(driver.findElement(DateofbirthDay)).selectByValue(Day);
    }
    public void selectDateofBirthMonth(String Month){
        selectByVisibleTextFromDropDown(DateofbirthMonth,Month);
    }
    public void selectDateofBirthYear(String Year) {
        new Select(driver.findElement(DateofbirthYear)).selectByValue(Year);
    }
    public void enterEmailId(String email){
        sendTextToElement(EmailField,email);
    }

    public  void enterPassword(String Password){
        sendTextToElement(PasswordField,Password);
    }
    public void ConfirmPassword(String Password){
        sendTextToElement(ConfirmPassword,Password);
    }
    public void clickonRegisterButton() {
        clickOnElement(RegisterButton);
    }
    public String verifyFirstnameisrequiredText(){
        return getTextFromElement(Firstnameisrequired);
    }
    public String verifyLastnameisrequiredText() {
        return getTextFromElement(Lastnameisrequired);
    }
    public String verifyEmailisrequiredText() {
        return getTextFromElement(Emailisrequired);
    }
    public String  verifyPasswordisrequiredText() {
        return getTextFromElement(Passwordisrequired);
    }
    public String verifyConfirmPasswordrequired() {
        return getTextFromElement(ConfirmPasswordisrequired);
    }
    public String verifyYourRegistrationCompleted() {
        return getTextFromElement(YourRegistrationCompleted);
    }
    public void clickonCountinueTab() {
        clickOnElement(CountinueTab);
    }
}
