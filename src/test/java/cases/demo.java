package cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class demo {
	WebDriver driver;

@Given("login page in testme app")
public void login_page_in_testme_app() {
	 System.setProperty("webdriver.chrome.driver", "C:\\saikumar\\Drivers\\chromedriver.exe");
	   driver =new ChromeDriver();
	   driver.manage().window().maximize();
	  
}

@Given("signin option in the login page")
public void signin_option_in_the_login_page() {
	 driver.get("http://10.232.237.143:443/TestMeApp/");
	   driver.findElement(By.linkText("SignUp")).click();
}

@Given("when username is entered as {string}")
public void when_username_is_entered_as(String string) {
	 driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(string);
}

@Given("when firstname is entered as {string}")
public void when_firstname_is_entered_as(String string) {
	 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(string);
}

@Given("when lastname is entered as {string}")
public void when_lastname_is_entered_as(String string) {
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(string);
}

@Given("when password is entered as {string}")
public void when_password_is_entered_as(String string) {
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
}

@Given("when conform password is entered as {string}")
public void when_conform_password_is_entered_as(String string) {
	 driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(string);
}

@Given("when gender is selected")
public void when_gender_is_selected() {
	 driver.findElement(By.xpath("//input[@value='Male']")).click();
}

@Given("when mailid is entered as {string}")
public void when_mailid_is_entered_as(String string) {
	driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(string);
}

@Given("when mobilenumber is entered as {string}")
public void when_mobilenumber_is_entered_as(String string) {
	driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(string);
}

@Given("when DOB is entered")
public void when_DOB_is_entered() {
	driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img")).click();
	WebElement month= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
	Select selmonth=new Select(month);
	selmonth.selectByValue("7");
	
	WebElement year=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
	Select selyear =new Select(year);
	 selyear.selectByValue("1998");   
	 
	 WebElement date=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
	 date.findElement(By.linkText("30")).click();
	
}

@Given("when address is entered as {string}")
public void when_address_is_entered_as(String string) {
	driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(string);
}

@Given("when security question is entered")
public void when_security_question_is_entered() {
	WebElement seqque=driver.findElement(By.xpath("//select[@name='securityQuestion']"));
	 Select ques=new Select(seqque);
	 ques.selectByVisibleText("What is your favour color?");
}

@Given("when answer is entered as {string}")
public void when_answer_is_entered_as(String string) {
	 driver.findElement(By.xpath("//input[@name='answer']")).sendKeys(string);
}

@Then("I click register")
public void i_click_register() {

	 driver.findElement(By.xpath("//input[@type='submit']")).click();
}

@Then("the testme app registration is done")
public void the_testme_app_registration_is_done() {
	 System.out.println("registration done");
}

}
