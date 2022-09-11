package assignmentdataDrivenfm;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	 static WebDriver driver;


	public void setUp() throws IOException
	{
		Flib flib = new Flib();

		String value = flib.readPropertyData("./Data/config.properties","Browser");
		String url = flib.readPropertyData("./Data/config.properties","Url");

		if(value.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		}
		else if(value.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		}
		else
		{
			System.out.println("enter the correct choice");
		}

	}

	public void closeBrowser()
	{
		driver.quit();
	}
}
