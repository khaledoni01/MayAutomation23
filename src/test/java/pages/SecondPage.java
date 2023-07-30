package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testngTests.BaseTest;
import util.UtilityMethods;

public class SecondPage {

    @FindBy(xpath = "//input[@value='Alert Button']")
    public WebElement alertBtn;

    public SecondPage() {
        PageFactory.initElements(BaseTest.getDriver(), this);
    }

    public void handleAlert() {
        BaseTest.wait.until(ExpectedConditions.elementToBeClickable(alertBtn));
        alertBtn.click();
        UtilityMethods.sleep(5);
        BaseTest.getDriver().switchTo().alert().accept();
    }


}
