package testngTests;

import org.testng.annotations.Test;
import pages.SecondPage;

public class SecondPageTest extends BaseTest{

    @Test(groups = {"Regression"})
    public void verifyAlert() {
        SecondPage sp = new SecondPage();

        sp.handleAlert();
    }

}
