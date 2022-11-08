package PageObjects;

import Utils.CommonUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    CommonUtil cutil;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        cutil=new CommonUtil(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "uid")
    WebElement loginUserName;

    @FindBy(name = "password")
    WebElement loginPassword;

    @FindBy(name = "btnLogin")
    WebElement loginButton;

    public void enterUserName(String userName) {
            cutil.sendValues(loginUserName,userName);
//        loginUserName.sendKeys(userName);
//        String s=loginUserName.getCssValue("font-size");
//        System.out.println(s);

    }

    public void enterPassword(String password) {
        loginPassword.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

}