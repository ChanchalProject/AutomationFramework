package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Helper.WebDriverHelper;

public class ProductPage extends WebDriverHelper {

	public By HomePageUrl = By.xpath("//div[@class=\"column logo-container\"]/a");
	public By SEARCH_ICON = By.cssSelector("#search.input-text");
	public By SEARCH_BUTTON = By.cssSelector("button.action.search");
	public By PRODUCT_COUNT = By.cssSelector("#product-list-plp > li");

	public void click_on_search_icon_and_type(String search) {
		waitForExpectedElement(HomePageUrl, 15);
		waitForExpectedElement(SEARCH_ICON, 10).click();
		waitForExpectedElement(SEARCH_ICON, 10).sendKeys(prop.getProperty(search));
		waitForExpectedElement(SEARCH_BUTTON, 15).click();
		// System.out.println(search+"test");
	}

	public void product_mouse_hover() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		
		List<WebElement> p = driver.findElements(PRODUCT_COUNT);
		
		for (WebElement i : p) {
			
		}

	}

	public void click_add_to_cart_button() {

	}

}