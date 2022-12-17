package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import Helper.WebDriverHelper;

public class HomePage extends WebDriverHelper {

	public By allowCookiesButton = By.cssSelector("button#onetrust-accept-btn-handler");
	public final static By ButtonAgeAllow = By.cssSelector("#btn-entry-age-allow");
	public By PersonIcon = By.cssSelector("div.column.desktop-only.customer_action");
	public By SignLink = By.cssSelector("div.userLoggout  ul > li:nth-child(1) > a");
	public By UserName = By.cssSelector("input#email.input-text");
	public By Basket_Count = By.cssSelector("span.counter.qty");
	public By BASKET_ICON = By.cssSelector("a.action.showcart");
	public By BasketPrice = By.cssSelector("span.cart_details > span");
	public By VIEW_BASKET = By.cssSelector("a.action.viewcart.primary");
	public By REMOVE_ITEM_FROM_BASKET = By.cssSelector("button.action.primary.remove.button-flavoured");
	public By REMOVE_CONFIRM = By.cssSelector("a.action.action-delete");
	public By GET_BASKET_TITLE = By.cssSelector("#minicart-content-wrapper > div > strong");
	public By HomePageUrl = By.xpath("//div[@class=\"column logo-container\"]/a");

	public void selectCookieAndAgeGate() {
		waitForExpectedElement(allowCookiesButton, 20);
		waitForExpectedElement(allowCookiesButton, 20).click();
		waitForExpectedElement(ButtonAgeAllow, 20);
		waitForExpectedElement(ButtonAgeAllow, 20).click();
	}

	public void clickOnPersonIcon() {
		waitForExpectedElement(PersonIcon, 15);
		hoverOnElement(PersonIcon);
		waitForExpectedElement(SignLink, 20).click();
	}

	public void basketIconDisplayed() {
		hoverOnElement(BASKET_ICON);

	}

	public void click_on_basket_icon_and_ensure_basket_empty() {
		
		boolean result = waitForExpectedElement(BasketPrice, 15).getText().contains("£0.00");
		if (result != true) {
			try {
				waitForExpectedElement(BASKET_ICON, 15).click();
				waitForExpectedElement(VIEW_BASKET, 10).click();
			} catch (Exception e) {
				//waitForExpectedElement(BASKET_ICON, 15).click();
			}
			while (driver.findElements(REMOVE_ITEM_FROM_BASKET).size() != 0) {
				waitForExpectedElement(REMOVE_ITEM_FROM_BASKET, 30).click();
				//waitForExpectedElement(By.cssSelector("div.ampromo-close"), 10).click();
				waitForExpectedElement(REMOVE_CONFIRM, 25).click();
			}
			if (driver.findElement(By.cssSelector("div:nth-child(1) > div > div > div > div:nth-child(3) > p"))
					.getText().contains("Your basket is empty")) {

				driver.navigate().to(driver.findElement(HomePageUrl).getAttribute("href"));
			}
		}
		else
		{
			waitForExpectedElement(BASKET_ICON, 15).click();
			waitForExpectedElement(By.cssSelector("#btn-minicart-close"), 15).click();
			driver.navigate().to(driver.findElement(HomePageUrl).getAttribute("href"));
			
		}
	}

}