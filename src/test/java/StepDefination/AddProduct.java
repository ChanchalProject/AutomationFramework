package StepDefination;

import Helper.WebDriverHelper;
import Page.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProduct extends WebDriverHelper{
	ProductPage product = new ProductPage();
	
	@When("click on search icon and type {string}")
	public void click_on_search_icon_and_type(String string) {
	   product.click_on_search_icon_and_type(string);
	}

	@When("get all list from page")
	public void get_all_list_from_page() {
		product.product_mouse_hover();
	}
	@When("click on first result")
	public void click_on_first_result() {
	  
	}

	@Then("click add to cart button")
	public void click_add_to_cart_button() {
		//product.click_add_to_cart_button();
	}  

	@Then("confirm mini-basket displayed count of {string}")
	public void confirm_mini_basket_displayed_count_of(String string) {
	   
	}
}
