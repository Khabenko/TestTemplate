package StepsDefenition;

import Helper.WebDriverManager;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Issue;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;


import java.util.HashMap;
import java.util.concurrent.TimeUnit;


public class LoginForm {
    private HashMap<String,Object> _context;
    private WebDriver driver;


    @Before
    public void setUp() throws Exception {

    }

    @Given("^Operation System Windows$")
    public void operationSystemWindows()  {


    }

    @And("^I have <browser>$")
    public void iHaveBrowser() throws Throwable {

    }

    @When("^I open wallet$")
    public void iOpenWallet() throws Throwable {

    }

    @Then("^I get title: Apollo$")
    public void iGetTitleApollo() throws Throwable {

    }
}
