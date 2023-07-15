package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import tests.BaseTest;

public class UtilityMethods {

    public static void jsClick(WebElement ele) {
        JavascriptExecutor js = (JavascriptExecutor) BaseTest.getDriver();
        js.executeScript("arguments[0].click();", ele);
    }
}
