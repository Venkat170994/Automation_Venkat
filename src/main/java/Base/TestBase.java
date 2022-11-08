package Base;

import Enums.Browsers;
import Enums.OS;
import Utils.ConfigReader;
import Utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


public class TestBase {

    public static WebDriver driver;

    public void getURL() {
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        driver.get(ConfigReader.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        WebDriverWait wait=new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
//        Wait wt=new FluentWait(driver).withTimeout(60,TimeUnit.SECONDS).pollingEvery(20,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

    }


    public WebDriver selectBrowser(String browser) {

        if (System.getProperty("os.name").toLowerCase().contains(OS.WINDOW.name().toLowerCase())) {
            if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
                System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
                driver = new ChromeDriver();
                getURL();
            } else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
                System.setProperty("webdriver.gecko.driver", Constants.GECKO);
                driver = new FirefoxDriver();
                getURL();
            }
        } else if (System.getProperty("os.name").toLowerCase().contains(OS.MAC.name().toLowerCase())) {
            if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
                System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
                driver = new ChromeDriver();
                getURL();
            } else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
                System.setProperty("webdriver.firefox.marionette", Constants.GECKO);
                driver = new FirefoxDriver();
                getURL();
            }
        }
        return driver;
    }
}
