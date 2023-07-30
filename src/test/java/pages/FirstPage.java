package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import testngTests.BaseTest;

public class FirstPage {

    @FindBy(xpath = "//select[@id='month']")
    public WebElement monthDropdown;

    public FirstPage() {
        PageFactory.initElements(BaseTest.getDriver(), this);
    }

    public void selectMonth(String monthName) {
        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByVisibleText(monthName);
    }

}
