package case2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class demo1 {
	WebDriver driver;

@Given("username in the username field as {string}")
public void username_in_the_username_field_as(String string) {
   System.setProperty("webdriver.chrome.driver","C:\\saikumar\\Drivers\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
   driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(string);
   
}

@Given("passwor in the password field as {string}")
public void passwor_in_the_password_field_as(String string) {
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
}

@Then("I click login")
public void i_click_login() {
  driver.findElement(By.xpath("//input[@name='Login']")).click();
}

@Then("home page is displayed")
public void home_page_is_displayed() {
   System.out.println("Home page is displayed");
}

}
