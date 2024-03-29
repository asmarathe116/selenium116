package TestAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DataProvider {

	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-ddcequv/login.do");
	}
	@org.testng.annotations.DataProvider(name="testActiTimeData")
	public Object[][] dataprovider() throws InterruptedException
	{
		Object[][] data=new Object[5][2];

		data[0][0]="admin1";
		data[0][1]="manager123";

		data[1][0]="ad min";
		data[1][1]="manager 123";

		data[2][0]="xyz123";
		data[2][1]="$#4123";
		
		Thread.sleep(2000);
      
		data[3][0]="admin";
		data[3][1]="maager";

		data[4][0]="123";
		data[4][1]="admin";



		return data;

	}

	@Test(dataProvider = "testActiTimeData")
	public void loginToActiTime(String username,String password) throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
	}

	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}


}
