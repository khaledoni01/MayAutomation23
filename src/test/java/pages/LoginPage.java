package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import tests.BaseTest;

public class LoginPage {

    @FindBy(xpath = "//input[@name='swpm_user_name']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='swpm_password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='swpm-login']")
    public WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(BaseTest.driver, this);
    }

    public void login(String uname, String pword) {
        username.clear();
        username.sendKeys(uname);
        password.sendKeys(pword);
        loginButton.click();

        Assert.assertEquals(BaseTest.driver.getCurrentUrl(), BaseTest.baseURL, "URL mismatch");
    }

}
