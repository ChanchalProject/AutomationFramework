package StepDefination;

import Helper.WebDriverHelper;
import Page.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepagesteps extends WebDriverHelper {
	HomePage home = new HomePage();
	
	@When("After Login Ensure Basket Icon is Displayed")
	public void after_login_ensure_basket_icon_is_displayed() {
		home.basketIconDisplayed();
	    
	}

	@When("Click On Basket Icon and Ensure Basket is Empty")
	public void click_on_basket_icon_and_ensure_basket_empty() {
		
	   home.click_on_basket_icon_and_ensure_basket_empty();
	}

	@Then("Items Remove from Basket")
	public void remove_item_from_basket() {
	  
	}


}
