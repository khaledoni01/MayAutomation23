package testngTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

    public static WebDriver driver = null;

    public static WebDriverWait wait = null;

    public static String url = null;

////    public static String baseURL = "https://nktechsolutions.com/membership-login/";
////    public static String baseURL = "file:///C:/Users/khale/OneDrive/Desktop/Misc/NK%20TECH%20Solutions/Automation/WebPage/2ndPage.html";

//    @BeforeMethod(groups={"Smoke", "Regression"})
    @BeforeMethod(alwaysRun = true)
    @Parameters({"baseURL"})
    public void launchBrowser(String baseURL) {
        url = baseURL;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        getDriver().manage().window().maximize();
        getDriver().get(baseURL);

        wait = new WebDriverWait(getDriver(), 10);

    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        getDriver().quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
