package Helper;

import Model.WebDrivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

import java.io.File;


public class WebDriverManager {
    private static WebDriver webDriver;
    private static OperaOptions options;

    public WebDriverManager() {

    }

    public static WebDriver getWebDriver(WebDrivers webDriverType) {
        String wedDriverPath = TestConfiguration.getTestConfiguration().getWedDriverPath(webDriverType);
      //  String operaPath = TestConfiguration.getTestConfiguration().getWedDriverPath("");

        switch (webDriverType)
        {
            case ChromeDriverForWindows:
                System.setProperty("webdriver.chrome.driver", wedDriverPath);
                webDriver = new ChromeDriver();
                break;
            case OperaDriverForWindows:
                options = new OperaOptions();
                options.setBinary(new File("C:\\Program Files\\Opera\\54.0.2952.54\\opera.exe"));
                System.out.printf(new File("C:\\Program Files\\Opera\\54.0.2952.54\\opera.exe").getAbsolutePath().toString());
                System.setProperty("webdriver.opera.driver", wedDriverPath);
                webDriver = new OperaDriver(options);
                break;
            case FireFoxDriverForWindows:
                System.setProperty("webdriver.gecko.driver", wedDriverPath);
                webDriver = new FirefoxDriver();
                break;
            default:
                throw new NullPointerException("WebDriver don't exist in " + WebDrivers.class);
        }
        return webDriver;
    }
}
