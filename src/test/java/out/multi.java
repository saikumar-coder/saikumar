package out;



import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class multi {
	@Given("user in home page")
	public void user_in_home_page() {
	   System.out.println("User in home page");
	}

	@When("user enters credentials")
	public void user_enters_credentials(io.cucumber.datatable.DataTable dt) {
	  List<Map<String,String>> list =dt.asMaps();
	  for(int i=0;i<=1;i++)
	  {
	  System.out.println(list.get(i).get("username"));
	  System.out.println(list.get(i).get("password"));
	    //throw new cucumber.api.PendingException();
	}
	}

	@When("click on login button")
	public void click_on_login_button() {
	   System.out.println("login button is clicked");
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	  System.out.println("home page is displayed");
	}

}
