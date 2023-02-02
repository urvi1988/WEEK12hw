package testsuite;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.checkerframework.dataflow.qual.TerminatesExecution;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BuildYourOwnCoputerPage;
import pages.ComputerPage;
import pages.DesktopsPage;
import pages.HomePage;
import testbase.TestBase;

public class ComputerPageTest extends TestBase {
    HomePage homePage=new HomePage();
    ComputerPage computerPage= new ComputerPage();
    DesktopsPage desktopsPage= new DesktopsPage();
    BuildYourOwnCoputerPage buildYourOwnCoputerPage=new BuildYourOwnCoputerPage();

  @Test
     public void verifyUserShouldNavigateToComputerPageSuccessfully(){
      homePage.clickonComputerTab();
        String actualMsg = computerPage.textComputer();
        String expectedMsg = "Computer";
        Assert.assertEquals(actualMsg,expectedMsg,"Computer text is verified");
    }
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.clickonComputerTab();
        computerPage.clickonDesktopslink();
        String actualMsg = desktopsPage.getDeskstopText();
        String expectedMsg = "Desktops";
        Assert.assertEquals(actualMsg,expectedMsg,"Desktop text is verified");
    }
    @Test
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(){
      homePage.clickonComputerTab();
      computerPage.clickonDesktopslink();
      buildYourOwnCoputerPage.clickonBuildyourowncomputer();
      buildYourOwnCoputerPage.selectProcessorDropdown("2.2 GHz Intel Pentium Dual-Core E2200");
      buildYourOwnCoputerPage.selectRamDropdown("2 GB");
      buildYourOwnCoputerPage.clickonRadioButtonHDD();
      buildYourOwnCoputerPage.clickonRadioButtonOS();
      buildYourOwnCoputerPage.clickonSoftwareCheckBoxes();
      buildYourOwnCoputerPage.clickonAddToCartButton();

      String actualMsg1=buildYourOwnCoputerPage.TheProducthasbeenaddedtoyourShoppingCartText();
      String expectedMsg1="The product has been added to your shopping cart";
      Assert.assertEquals(actualMsg1,expectedMsg1,"Product added message verified");






    }
}
