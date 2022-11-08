package StepDefinitions;

import Base.TestBase;
import PageObjects.AddCustomerPage;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AddCustomerStepDefinition extends TestBase {

    AddCustomerPage addCustomerPage = new AddCustomerPage(driver);
    Logger log = LogManager.getLogger(AddCustomerStepDefinition.class);

    @Then("user enters customer name as {string}")
    public void user_enters_customer_name_as(String customerName) {
        addCustomerPage.enterCustomerName(customerName);
    }

    @Then("user enters gender as {string}")
    public void user_enters_gender_as(String gender) {
        addCustomerPage.clickGender(gender);
    }

    @Then("user enters Date of birth as {string}")
    public void user_enters_dob_as(String dob) {
        addCustomerPage.enterDOB(dob);
    }

    @Then("user enters Address as {string}")
    public void user_enters_Address_as(String address) {
        addCustomerPage.enterAddress(address);

    }

    @Then("user enters City as {string}")
    public void user_enters_City_as(String city) {
        addCustomerPage.enterCity(city);
    }

    @Then("user enters State as {string}")
    public void user_enters_state_as(String state) {
        addCustomerPage.enterState(state);
    }

    @Then("user enters PIN as {string}")
    public void user_enters_PIN_as(String pin) {
        addCustomerPage.enterPin(pin);
    }

    @Then("user enters Mobile Number as {string}")
    public void user_enters_mobileNumber_as(String mobileNumber) {
        addCustomerPage.enterMobileNumber(mobileNumber);
    }

    @Then("user enters email as {string}")
    public void user_enters_email_as(String email) {
        addCustomerPage.enterEmail(email);
    }

    @Then("user enters password as {string}")
    public void user_enters_password_as(String password) {
        addCustomerPage.enterPassword(password);
    }

    @Then("user clicks add customer submit button")
    public void user_clicks_add_customer_submit_button() {
        addCustomerPage.clickSubmitButton();
    }

}

