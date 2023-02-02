package pages;

//- Desktops text, Sortby, Display, selectProductList Locators and it's actions

import org.openqa.selenium.By;
import utility.Utility;

public class DesktopsPage extends Utility {
    By DesktopsText = By.xpath("//div[@class='page-title']");
    By SortByText = By.xpath("//div[@class='product-sorting']");
    By DisplayText = By.xpath("//div[@class='product-page-size']");
    By SelectProductListLocater = By.xpath("//a[@class='viewmode-icon list']");

    public String getDeskstopText() {
        return getTextFromElement(DesktopsText);
    }

    public String getSortByText(){
        return getTextFromElement(SortByText);
    }
    public String getDisplayText(){
        return getTextFromElement(DisplayText);
    }
    public String getSelectProductListLocater(){
        return getTextFromElement(SelectProductListLocater);
    }
}