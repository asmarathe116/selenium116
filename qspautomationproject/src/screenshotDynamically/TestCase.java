package screenshotDynamically;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase extends BaseTest {

	@BeforeMethod
	public void setUp()
	{
		intialization();
	}


	@Test
	public void alidLogin() throws InterruptedException 
	{
		SoftAssert softAssert = new SoftAssert(); 
		String actualPageTitle = driver.getTitle();
		softAssert.assertEquals(actualPageTitle,"OrangeHRM");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("suraj");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement dashBoard = driver.findElement(By.xpath("//h1[.='Dashboard']"));
		boolean statusOfDashBoard = dashBoard.isDisplayed();
		Assert.assertEquals(statusOfDashBoard, true);
		Thread.sleep(4000);

	}

	@Test
	public void testCase2()
	{
		Assert.fail();
	}

	@Test
	public void testCase3()
	{
		Assert.fail();
	}

	@Test
	public void testCase4()
	{
		Assert.fail();
	}


	@Test
	public void testCase5()
	{
		Assert.fail();
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
