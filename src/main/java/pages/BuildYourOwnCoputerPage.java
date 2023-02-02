package pages;
//Build your own computer Text, Processor Drop Down, Ram drop down,
// HDD radios, os radio, software check boxes, Add To Card button, "The product has
//been added to your shopping cart"

import org.openqa.selenium.By;
import utility.Utility;

public class BuildYourOwnCoputerPage extends Utility {

    By BuildYourOwnCoputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By BuildYourOwnComputer = By.linkText("Build your own computer");
    By ProcessorDropdown = By.xpath("//select[@id='product_attribute_1']");
    By RamDropdown = By.xpath("//select[@id='product_attribute_2']");
    By clickonRadioButtonHDD= By.xpath("//input[@id='product_attribute_3_6']");
    By clickonRadioButtonOS= By.xpath("//input[@id='product_attribute_4_8']");
    By clickonSoftwareCheckBoxes= By.xpath("//input[@id='product_attribute_5_10']");
    By clickonAddToCartButton= By.xpath("//button[@id='add-to-cart-button-1']");
    By TheProducthasbeenaddedtoyourShoppingCartText= By.xpath("//div[@class='bar-notification success']/p");

    public String BuildYourownComputerText(){
        return getTextFromElement(BuildYourOwnCoputerText);
    }

    public void clickonBuildyourowncomputer() {
        clickOnElement(BuildYourOwnComputer);
    }
    public void selectProcessorDropdown (String value){
        selectByVisibleTextFromDropDown(ProcessorDropdown,value);
    }
    public void selectRamDropdown(String value){
        selectByVisibleTextFromDropDown(RamDropdown,value);
    }
    public void clickonRadioButtonHDD(){
        clickOnElement(clickonRadioButtonHDD);
    }
    public void clickonRadioButtonOS(){
        clickOnElement(clickonRadioButtonOS);
    }
    public void clickonSoftwareCheckBoxes(){
        clickOnElement(clickonSoftwareCheckBoxes);
    }
    public void clickonAddToCartButton(){
        clickOnElement(clickonAddToCartButton);
    }

    public String TheProducthasbeenaddedtoyourShoppingCartText(){
        return getTextFromElement(TheProducthasbeenaddedtoyourShoppingCartText);
    }
}
