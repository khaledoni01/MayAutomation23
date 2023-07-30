package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import testngTests.BaseTest;

public class UtilityMethods {

    public static void jsClick(WebElement ele) {
        JavascriptExecutor js = (JavascriptExecutor) BaseTest.getDriver();
        js.executeScript("arguments[0].click();", ele);
    }

    public static void sendKeys(WebElement ele, String message) {
        ele.clear();
        ele.sendKeys(message);
        System.out.println("Typing: " + message);
    }

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
