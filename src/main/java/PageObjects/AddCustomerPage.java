package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddCustomerPage {

    private WebDriver driver;

    public AddCustomerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(name = "name")
    WebElement customerName;

    @FindBy(xpath = "//input[@name='rad1']")
    List<WebElement> radio;

    @FindBy(name = "dob")
    WebElement dob;

    @FindBy(name = "addr")
    WebElement addressBox;

    @FindBy(name = "city")
    WebElement cityBox;

    @FindBy(name = "state")
    WebElement stateBox;

    @FindBy(name = "pinno")
    WebElement pinnoBox;

    @FindBy(name = "telephoneno")
    WebElement telephonenoBox;

    @FindBy(name = "emailid")
    WebElement emailidBox;

    @FindBy(name = "password")
    WebElement passwordBox;

    @FindBy(name = "sub")
    WebElement submitButton;

    public void enterCustomerName(String cust_name) {
        customerName.sendKeys(cust_name);
    }

    public void clickGender(String gender) {

        for (WebElement genderOptions : radio) {
            String actual = genderOptions.getText();
            if (actual.equalsIgnoreCase(gender)) {
                if (!genderOptions.isSelected())
                    genderOptions.click();
            }
        }
    }

    public void enterDOB(String dobValue) {
        dob.sendKeys(dobValue);
    }

    public void enterAddress(String address) {
        addressBox.sendKeys(address);
    }

    public void enterCity(String city) {
        cityBox.sendKeys(city);
    }

    public void enterState(String state) {
        stateBox.sendKeys(state);
    }

    public void enterPin(String pin) {
        pinnoBox.sendKeys(pin);
    }

    public void enterMobileNumber(String mobileNumber) {
        telephonenoBox.sendKeys(mobileNumber);
    }

    public void enterEmail(String email) {
        emailidBox.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordBox.sendKeys(password);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

}