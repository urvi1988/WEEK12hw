package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class ComputerPage extends Utility {
By ComputerText = By.xpath("//ul[@class='top-menu notmobile']/li[1]");
By DesktopsLink = By.xpath("//div[@class='item-grid']/div[1]");
By NotebooksLink= By.xpath("//div[@class='item-grid']/div[2]");
By SoftwareLink= By.xpath( "//div[@class='item-grid']/div[3]");

public String textComputer(){
    return getTextFromElement(ComputerText);
}
public void clickonDesktopslink(){
    clickOnElement(DesktopsLink);
}
public void clickonNoteBookslink(){
    clickOnElement(NotebooksLink);
}
public void clickonSoftwarelink(){
    clickOnElement(SoftwareLink);
}

}


