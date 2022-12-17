package Page;

import org.openqa.selenium.By;

import Helper.WebDriverHelper;

public class LoginPage extends WebDriverHelper {
	
public By EMAIL_INPUTBOX = By.cssSelector("input#email.input-text");
public By PASSWORD_INPUTBOX = By.cssSelector("input#pass");
public By SIGNIN_BUTTON = By.cssSelector("button#send2.action.login.primary");
public By ERROR_MESSAGE = By.cssSelector("div.message-error");

public void userLogin(String username , String password) {
	waitForExpectedElement(EMAIL_INPUTBOX, 10).sendKeys(prop.getProperty(username));
	waitForExpectedElement(PASSWORD_INPUTBOX, 10).sendKeys(prop.getProperty(password));
    waitForExpectedElement(SIGNIN_BUTTON, 10).click();
}

}