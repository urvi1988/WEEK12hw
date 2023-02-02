package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class LoginPage extends Utility {
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailfield= By.id("Email");
    By passwordfield= By.name("Password");
    By loginButton= By.xpath( "//button[contains(text(),'Log in')]");
    By ErrorMessage= By.xpath("//div[@class='message-error validation-summary-errors']");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email){
        sendTextToElement(emailfield,email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordfield,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String errorMessage(){
        return getTextFromElement(ErrorMessage);
    }
}
