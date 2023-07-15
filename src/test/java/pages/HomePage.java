package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import tests.BaseTest;

import java.util.List;

public class HomePage {

    @FindBy(xpath = "//ul[@id='menu-main-menu']/li/a")
    public List<WebElement> menuOptions;

    public HomePage() {
        PageFactory.initElements(BaseTest.driver, this);
    }

    public void selectMenuOption(String expectedMenu) {
        for(WebElement menu : menuOptions) {

            System.out.println(menu.getText());

            if(menu.getText().trim().equalsIgnoreCase(expectedMenu)) {
                menu.click();
                break;
            }
        }
    }

}
