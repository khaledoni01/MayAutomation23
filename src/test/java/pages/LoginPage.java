package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import tests.BaseTest;
import util.UtilityMethods;

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
        BaseTest.wait.until(ExpectedConditions.visibilityOf(username));
        username.clear();
        username.sendKeys(uname);

//        password.sendKeys(pword);
        UtilityMethods.sendKeys(password, pword);

        loginButton.click();
//        UtilityMethods.jsClick(loginButton);

        Assert.assertEquals(BaseTest.driver.getCurrentUrl(), BaseTest.url, "URL mismatch");
    }

}
