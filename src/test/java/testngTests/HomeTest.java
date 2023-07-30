package testngTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest{

    String homePageURL = "https://nktechsolutions.com/";

    @Test(groups = {"Regression"})
    public void validateMenuOption(){
        HomePage homePage = new HomePage();
        getDriver().get(homePageURL);
        homePage.selectMenuOption("contact us");

        Assert.assertEquals(getDriver().getCurrentUrl(),
                homePageURL);
    }



}
