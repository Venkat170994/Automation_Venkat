package StepDefinitions;

import Base.TestBase;
import PageObjects.HomePage;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.testng.Assert;

public class HomePageStepDefinition extends TestBase {

    HomePage homePage = new HomePage(driver);
    Logger log = LogManager.getLogger(HomePageStepDefinition.class);
    Alert alert;

    @Then("user lands on home page")
    public void user_lands_on_home_page() {
        homePage.verifyHomePage();
    }

    @Then("user clicks {string} button")
    public void user_clicks_logout_button(String optionName) {
        homePage.clickOptionName(optionName);
    }

    @Then("user verifies logged out alert")
    public void user_verifies_logged_out_alert() {
        alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assert.assertEquals(alertText, "You Have Succesfully Logged Out!!");
        alert.accept();
    }

    @Then("user close advertisements")
    public void user_close_advertisements() {
        homePage.closeAd();
    }

    @Then("user navigates to Add customer page")
    public void user_navigates_to_Add_customer_page() {
        driver.get("https://demo.guru99.com/v4/manager/addcustomerpage.php");
    }
}