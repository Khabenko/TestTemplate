package Tests;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import Helper.WebDriverManager;
import Model.WebDrivers;
import org.junit.*;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.allure.annotations.*;


public class TestCase{
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = WebDriverManager.getWebDriver(WebDrivers.ChromeDriverForWindows);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }


    @Title("[Contact form] Checking the \"Name\" field  (Contain Name and surname)")
    @Features("[Contact form]")
    @Stories("Positive")
    @Issue("Test-1")
    @Test
    public void testCaseP1() throws Exception {
        driver.get("http://firstbridge.io/");



    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}