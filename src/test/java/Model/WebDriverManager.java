package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static Model.WebDrivers.ChromeDriverForWindows;

public class WebDriverManager {
    private WebDriver webDriver;

    public WebDriverManager(WebDrivers webDriverType) {
         switch (webDriverType)
         {
             case ChromeDriverForWindows:
                 System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\WebDriver.Windows\\chromedriver.exe");
                 webDriver = new ChromeDriver();
                 break;
             case OperaDriverForWindows:
                 break;
             case FireFoxDriverForWindows:
                 System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\WebDriver.Windows\\geckodriver.exe");
                 webDriver = new FirefoxDriver();
                 break;
             default:
                 throw new NullPointerException("WebDriver don't exist in "+WebDrivers.class);
         }
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
