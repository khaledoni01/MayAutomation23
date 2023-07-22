package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    @DataProvider(name="loginData")
    public static Object[][] loginTestData() {

        return new Object[][] {
                {"admin", "admin"},
                {"khaledzamanqa", "test1234"},
                {"admin12", "admin12"},
                {"khaled12", "test1234"}
        };
    }

    @Test(groups = {"Smoke", "Regression"}, dataProvider = "loginData")
    public void loginInvalidUsernameInvalidPassword(String username, String password){
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }



}
