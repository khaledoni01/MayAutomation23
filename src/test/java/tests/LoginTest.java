package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    @Test
    public void loginInvalidUsernameInvalidPassword(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("admin", "admin");
    }

    @Test
    public void loginValidUsernameInvalidPassword(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("khaledzamanqa", "test1234");
    }


}
