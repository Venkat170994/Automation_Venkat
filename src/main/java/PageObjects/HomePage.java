package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private static WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//td//marquee[contains(text(),'Welcome To Manager')]")
    WebElement homePageText;

    @FindBy(xpath = "//span[contains(text(),'Close')]")
    WebElement closeAdvertisement;

    public WebElement getOptionName(String option) {
        WebElement getName = driver.findElement(By.xpath("//a[contains(text(),'" + option + "')]"));
        return getName;
    }

    public void clickOptionName(String option) {
        getOptionName(option).click();
    }

    public void verifyHomePage() {
        homePageText.isDisplayed();
    }

    public void closeAd() {
        if (closeAdvertisement.isDisplayed()) {
            closeAdvertisement.click();
        }
    }
}