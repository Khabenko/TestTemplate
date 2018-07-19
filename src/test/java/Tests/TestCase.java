package Tests;

import java.sql.DriverManager;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import Helper.TestHelper;
import Helper.WebDriverManager;
import Model.API.Response.BlockchainTransactions;
import Model.WebDrivers;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.*;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.allure.annotations.*;

@RunWith(Parameterized.class)
public class TestCase{
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    public TestCase(WebDrivers driver) {
        this.driver = WebDriverManager.getWebDriver(driver);
        this.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Before
    public void setUp() throws Exception {

    //    System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    //     driver = WebDriverManager.getWebDriver(WebDrivers.ChromeDriverForWindows);
    //    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }


    @Title("[Login form] Checking the \"Name\" field  (Contain Name and surname)")
    @Features("[Contact form]")
    @Stories("Positive")
    @Issue("Test-1")
    @Test
    public void testCaseP1() throws Exception {
        /*
        driver.get("http://firstbridge.io/");
        makeScreenshot();
        driver.get("http://firstbridge.io/");
        */


        Request request = new Request.Builder()
                .url("http://localhost:6876/apl?requestType=getPrivateBlockchainTransactions&publicKey=4652486ebc271520d844e5bdda9ac243c05dcbe7bc9b93807073a32177a6f73d")
                .get()
                .build();



        Response response =  TestHelper.getClient().newCall(request).execute();
        BlockchainTransactions blockchainTransactions = TestHelper.getGson().fromJson(response.body().string().toString(), BlockchainTransactions.class);


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

    @Attachment(type = "image/png")
    public byte[] makeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Parameterized.Parameters
    public static List<Object[]> isEmptyData() {
        return Arrays.asList(new Object[][] {
                { WebDrivers.FireFoxDriverForWindows },
                { WebDrivers.ChromeDriverForWindows }
        });
    }
}
