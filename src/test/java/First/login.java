package First;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	@Given("i Enter user id in the user id field as {string}")
	public void i_Enter_user_id_in_the_user_id_field_as(String string) {
		 System.out.println("user id is="+string);
	}

	@Given("password in the password field as {string}")
	public void password_in_the_password_field_as(String string) {
		System.out.println("Password entered as ="+string);
	}

	@When("i click login")
	public void i_click_login() {
		System.out.println("Login buton is clicked");
	}

	@Then("the homepage is displayed")
	public void the_homepage_is_displayed() {
		System.out.println("Home page is displayed");
	}

	/*@Given(" i Enter user id in the user id field as {string}")
	public void i_Enter_user_id_in_the_user_id_field void as(String x) {
	   System.out.println("user id is="+x);
	}

	@And("password in the password field as {int}")
	public void password_in_the_password_field as(int x) {
		System.out.println("Password is entered as ="+x);
	}

	@When("i click login")
	public void i_click_login() {
		System.out.println("Login buton is clicked");
	}

	@Then("the homepage is displayed")
	public void the_homepage_is_displayed1() {
		System.out.println("Home page is displayed");
	}*/
	
}
