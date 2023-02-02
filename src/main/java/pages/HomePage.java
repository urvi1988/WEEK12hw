package pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import utility.Utility;

public class HomePage extends Utility {

    By RegisterLink = By.xpath("//a[contains(text(),'Register')]");
    By LoginLink = By.xpath("//a[@class='ico-login']");
    By ComputerLink = By.linkText("Computer");
    By ElectronicsLink = By.linkText("Electronics");
    By Apparellink = By.linkText("Apparel");
    By Digitaldownloadslink = By.linkText("Digital downloads");
    By Bookslink = By.linkText("Books");
    By Jewelrylink = By.linkText("Jewelry");
    By GiftCardslink = By.linkText("Gift Cards ");
    By NopCommercelogo= By.xpath("//img[@alt='nopCommerce demo store']");
    By MyAccountLink= By.xpath( "//div[@class='footer-upper']/div[3]/ul/li[1]");
    By LogOutLink=By.linkText("Log out");


    public void clickonRegisterLink() {
        Reporter.log("Click on register link" + RegisterLink.toString());
        clickOnElement(RegisterLink);
    }
    public void clickonLoginLink() {
        Reporter.log("Clicking on login button" + LoginLink.toString());
        clickOnElement(LoginLink);
    }
    public void clickonComputerTab(){
        Reporter.log("Clicking on computer tab" + ComputerLink.toString());
        clickOnElement(ComputerLink);
    }
    public void clickonElectronicsTab(){
        Reporter.log("Clicking on electronics tab" + ElectronicsLink.toString());
        clickOnElement(ElectronicsLink);
    }
    public void clickonApparelTab(){
        Reporter.log("Clicking on apparel tab" + Apparellink.toString());
        clickOnElement(Apparellink);
    }
    public void clickonDigitalDownloadTab(){
        Reporter.log("Clicking on Digital Download tab"+ Digitaldownloadslink.toString());
        clickOnElement(Digitaldownloadslink);
    }
    public void clickonBooksTab(){
        Reporter.log("Clicking on Books tab"+ Bookslink.toString());
        clickOnElement(Bookslink);
    }
    public void clickonJewelryTab(){
        Reporter.log("Clicking on Jewelry Tab"+ Jewelrylink.toString());
        clickOnElement(Jewelrylink);
    }
    public void clickoGiftCardTab(){
        Reporter.log("Clicking on Gift Cars tab"+ GiftCardslink.toString());
        clickOnElement(GiftCardslink);

    }
    public void clickonNopcommerceLogo(){
        Reporter.log("Clicking on Nopcommerce Logo"+ NopCommercelogo.toString());
        clickOnElement(NopCommercelogo);
    }
    public void clickonMyAccountLink(){
        Reporter.log("Clicking on MyAccount link"+ MyAccountLink.toString());
        clickOnElement(MyAccountLink);
    }
    public void clickonLogoutLink(){
        Reporter.log("Clicking on Logout Link"+ LogOutLink.toString());
        clickOnElement(LogOutLink);
    }
    public String verifylogoutlink(){
        return getTextFromElement(LogOutLink);
    }
    public String verifyloginlink(){
        return getTextFromElement(LoginLink);
    }

}

