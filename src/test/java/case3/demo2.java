package case3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demo2 {
WebDriver driver;
@Given("proper url in the field")
public void proper_url_in_the_field() {
   System.setProperty("webdriver.chome.driver","C:\\saikumar\\Drivers\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
}

@When("userid in the username field as {string}")
public void userid_in_the_username_field_as(String string) {
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(string);
}

@When("passcode in the password field as {string}")
public void passcode_in_the_password_field_as(String string) {
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
}

@Then("click the login button")
public void click_the_login_button() {
	 driver.findElement(By.xpath("//input[@name='Login']")).click();
	}


@Then("you type {string} in the search bar")
public void you_type_in_the_search_bar(String string) {
   driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);
}

@Then("the product is displayed")
public void the_product_is_displayed() {
   driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
}


}
