package StepDefinitions;

import Base.TestBase;
import PageObjects.LoginPage;
import Utils.ConfigReader;
import Utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.testng.Assert;

public class LoginPageStepDefinition extends TestBase {

    LoginPage loginPage = new LoginPage(driver);
    Logger log = LogManager.getLogger(LoginPageStepDefinition.class);
    Alert alert;

    @Given("user is on login page")
    public void user_is_login_page() {
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Guru99 Bank Home Page");
        log.info("Titls is : " + pageTitle + " verified");

    }

    @When("user enters username as {string} and password as {string}")
    public void user_enters_username_and_password(String userName, String password) {
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        String uname = ConfigReader.getProperty(userName);
        String pwd = ConfigReader.getProperty(password);
        loginPage.enterUserName(uname);
        loginPage.enterPassword(pwd);
        log.info("UserName is  : " + userName + " and password is: " + password);
    }

    @Then("user clicks submit button")
    public void user_clicks_submit_button() {
        loginPage.clickLoginButton();
    }

}