package StepDefination;

import Helper.WebDriverHelper;
import Page.HomePage;
import Page.LoginPage;
import io.cucumber.java.en.When;

public class LoginSteps extends WebDriverHelper {
	HomePage home = new HomePage();
	LoginPage login =new LoginPage();
	
	@When("User launch site URL")
	public void user_launch_site_url() {
	   launch();
	}

	@When("select allow all from cookies and select over {int} age confirmation option")
	public void select_allow_all_from_cookies_and_select_over_age_confirmation_option(Integer int1) {
	   home.selectCookieAndAgeGate(); 
	   home.clickOnPersonIcon();
	  
	}

	@When("user login into the application with valid {string} and {string}")
	public void user_login_into_the_application_with_valid_and(String string, String string2) {
	    login.userLogin(string, string2);
	}
}