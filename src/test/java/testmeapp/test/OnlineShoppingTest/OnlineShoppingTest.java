package testmeapp.test.OnlineShoppingTest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testmeapp.utility.Drivers;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class OnlineShoppingTest
{
	static WebDriver driver;
	public static ExtentHtmlReporter htmlReporter;
	static ExtentReports extent;
	static ExtentTest Logger;
  @Test(priority=1)
  public void registration() 
  {
	  Logger = extent.createTest("Register Test");
	  
	 driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm"); 
	 Logger.log(Status.INFO,"regestration get started");
	 driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("vsksaiumrr");
	 driver.findElement(By.id("firstName")).sendKeys("vsksai");
	 String flag= driver.findElement(By.id("err")).getText();
	 System.out.println(flag);
	/* Assert.assertEquals("Available", flag);*/
	 Logger.log(Status.INFO, MarkupHelper.createLabel("ID is  available", ExtentColor.GREEN));
	 driver.findElement(By.id("lastName")).sendKeys("umrr");
	 driver.findElement(By.id("password")).sendKeys("vemasani1234");
	 driver.findElement(By.id("pass_confirmation")).sendKeys("vemasani1234");
	 driver.findElement(By.xpath("//input[@value='Male']")).click();
	 driver.findElement(By.id("emailAddress")).sendKeys("vemasani1234@gmail.com");
	 driver.findElement(By.id("mobileNumber")).sendKeys("9876543210");
	 driver.findElement(By.xpath("//img[@title='Ch']")).click();
	 WebElement month=driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
	 Select selmonth=new Select(month);
	 selmonth.selectByValue("4");
	 
	 WebElement year=driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
	 Select selyear=new Select(year);
	 selyear.selectByValue("1998");
	 
	 WebElement date=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
	 date.findElement(By.linkText("30")).click();
	 driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Yakasiri village and post chittamuru mandal spsr nellore district");
	 WebElement ques = driver.findElement(By.xpath("//select[@name='securityQuestion']"));
	 Select sel=new Select(ques);
     sel.selectByVisibleText("What is your favour color?");
	 driver.findElement(By.xpath("//input[@name='answer']")).sendKeys("yellow");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
     System.out.println("Username already exist");
    // Logger.fail("Username already exist");
  }
@Test(priority=2)
public void login()
{
	Logger = extent.createTest("Login Test");
	Logger.log(Status.INFO,"Login started");
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("lalitha");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123");
	driver.findElement(By.xpath("//input[@name='Login']")).click();
	Logger.log(Status.INFO,MarkupHelper.createLabel("Login Sucess!!!", ExtentColor.GREEN));
	
}
@Test(priority=3)
public static void addtocart() throws InterruptedException
{
	Logger = extent.createTest("Cart Test");
  Actions a = new Actions(driver);
  a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'All')]"))).click().build().perform();
  a.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[2]/a/span"))).click().build().perform(); 
  Thread.sleep(5000);
  a.moveToElement(driver.findElement(By.xpath("//*[@id=\"submenuul11292\"]/li[3]/a/span"))).click().build().perform();
  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
  driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
  driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
  /*String title=driver.getTitle();
	 Assert.assertEquals("View Cart", title);*/
	 Logger.log(Status.INFO, MarkupHelper.createLabel("Product Added", ExtentColor.GREEN));
}
@Test(priority=4)
public static void payment()
{
	Logger=extent.createTest("payment");
	Logger.log(Status.INFO,"payment page opened");
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
	driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans");
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
    Logger.fail("mismatch of pas code");
	String strr=driver.findElement(By.xpath("/html/body/b/section/div/div/div/table[1]/tbody/tr/td[5]/span")).getText();
	String str1=driver.findElement(By.xpath("/html/body/b/section/div/div/div/table[1]/tbody/tr/td[1]")).getText();
	String str2=driver.findElement(By.xpath("/html/body/b/section/div/div/div/table[1]/tbody/tr/td[2]")).getText();
	String str3=driver.findElement(By.xpath("/html/body/b/section/div/div/div/table[1]/tbody/tr/td[4]")).getText();
	System.out.println("order id="+str1);
	System.out.println("product name="+str2);
	System.out.println("price="+str3);
	System.out.println(strr);
}
  @BeforeTest
  public void beforeTest() 
  {
	  driver=Drivers.getDriver("chrome");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/extent.reports/"+new SimpleDateFormat("hh-mm-ss-ms-dd-MM-yyyy").format( new Date(0))+".html");
	  extent= new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "GFT NexGen Testing Stream");
		extent.setSystemInfo("Environment","Automation Testing");
		extent.setSystemInfo("User Name","saikumar");
		htmlReporter.config().setDocumentTitle("Html reports for onlineshopping");
		htmlReporter.config().setReportName("Reports appear here");
		htmlReporter.config().setTheme(Theme.DARK);
  }
  @AfterMethod
	  public void getResultAfterMethod(ITestResult result) throws IOException{
			if(result.getStatus() == ITestResult.FAILURE)
			{   Logger.log(Status.FAIL,MarkupHelper.createLabel(result.getName() + "Test case fail", ExtentColor.RED));
				TakesScreenshot snapshot=(TakesScreenshot)driver;
				File src=snapshot.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
				String path=System.getProperty("user.dir")+"/extent-reports/snapshot/" +result.getName()+ ".png";
				FileUtils.copyFile(src,new File(path));
				Logger.addScreenCaptureFromPath(path,result.getName());
				Logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable()+"-Test Case Failed",ExtentColor.RED));
			}
			else if(result.getStatus()==ITestResult.SKIP){
				Logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+"-Test Case Skipped",  ExtentColor.ORANGE));
			}
  } 
  @AfterTest
  public void afterTest()
  {
	  Logger = extent.createTest("end report");
		extent.flush();
		driver.close();
  }

}
