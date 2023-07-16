package tests;

import org.testng.annotations.Test;
import pages.FirstPage;
import pages.LoginPage;
import pages.SecondPage;

public class SecondPageTest extends BaseTest{

    @Test
    public void verifyAlert() {
        SecondPage sp = new SecondPage();

        sp.handleAlert();
    }

}
