package StepDefinitions;

import Base.TestBase;
import Enums.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;


public class ServiceHooks {

    TestBase testBase;

    Logger log = LogManager.getLogger(ServiceHooks.class);

    @Before
    public void launchBrowser() {
        testBase = new TestBase();
        testBase.selectBrowser(Browsers.CHROME.name());
    }

    @After
    public void endTest(Scenario scenario) {
        if (scenario.isFailed()) {

            try {
                log.info(scenario.getName() + " is Failed");
                final byte[] screenshot = ((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName()); // ... and embed it in
            } catch (WebDriverException e) {
                e.printStackTrace();
            }

        } else {
            try {
                log.info(scenario.getName() + " is pass");
                scenario.attach(((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.BYTES), "image/png", scenario.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        TestBase.driver.quit();
    }
}
