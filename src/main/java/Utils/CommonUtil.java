package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class CommonUtil {
    private WebDriver driver;
    Actions actions;

    public CommonUtil(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void mouseHover(WebElement element) {
        actions.moveToElement(element).build().perform();
    }

    public void sendValues(WebElement element, String inputValue) {
        element.sendKeys(inputValue);

    }

    public void verifyBrokenURL(String urlLink) throws IOException {

        URL url = new URL(urlLink);
        HttpURLConnection hp = (HttpURLConnection) url.openConnection();
        hp.connect();
        if (hp.getResponseCode() == 200) {

        }

    }

    public void takeScreenshot() throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("E:\\Documents\\Venkat\\Learning\\Automation_Venkat\\src\\test\\resources\\screenshots"));
    }
}
