package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public static WebDriver driver = null;

    public static WebDriverWait wait = null;

    public static String baseURL = "https://nktechsolutions.com/membership-login/";


    @BeforeMethod
    public void launchBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        getDriver().manage().window().maximize();
        getDriver().get(baseURL);

        wait = new WebDriverWait(getDriver(), 10);

    }

    @AfterMethod
    public void closeBrowser() {
        getDriver().quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
