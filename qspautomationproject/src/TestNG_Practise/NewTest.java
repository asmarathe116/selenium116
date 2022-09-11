package TestNG_Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {

	WebDriver driver;
	@Test
	public void openBrowser()
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser is opened-----------------------");

	}

	@Test
	public void openUrl() 
	{
		driver.get("http://desktop-ddcequv/login.do");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		System.out.println("website is open-------------------------");


	}

	@Test
	public void Login() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("login credentials is entered lgin is done");

	}

	@Test
	public void title() {

		if(driver.getTitle().equals("actiTIME  Enter Time-Track"))
		{
			Assert.assertTrue(true);
			System.out.println("Title is verified");
		}
		else {
			Assert.assertTrue(false);
			System.out.println("Title is Not verified");
		}
	}

	@Test
	public void Logtout() {
		driver.quit();
		System.out.println("browser is closed");

	}


}
