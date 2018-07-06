package Helper;

import Model.WebDrivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static Model.WebDrivers.ChromeDriverForWindows;
import static Model.WebDrivers.FireFoxDriverForWindows;
import static Model.WebDrivers.OperaDriverForWindows;

public class WebDriverManager {
    private static WebDriver webDriver;

    public WebDriverManager() {

    }

    public static WebDriver getWebDriver(WebDrivers webDriverType) {
        String path = TestConfiguration.getTestConfiguration().getWedDriverPath(webDriverType);
        switch (webDriverType)
        {
            case ChromeDriverForWindows:
                System.setProperty("webdriver.chrome.driver", path);
                webDriver = new ChromeDriver();
                break;
            case OperaDriverForWindows:
                break;
            case FireFoxDriverForWindows:
                System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\WebDriver.Windows\\geckodriver.exe");
                webDriver = new FirefoxDriver();
                break;
            default:
                throw new NullPointerException("WebDriver don't exist in " + WebDrivers.class);
        }
        return webDriver;
    }
}
