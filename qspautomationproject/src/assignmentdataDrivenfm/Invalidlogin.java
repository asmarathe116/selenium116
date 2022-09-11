package assignmentdataDrivenfm;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalidlogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		driver.get("https://www.saucedemo.com/");
		Flib flib = new Flib();

		int rc = flib.getRowCount("./Data/saucedemo.xlsx", "invalid");
  

		for(int i=1;i<=rc;i++)
		{
			String username = flib.ReadExcelData("./Data/saucedemo.xlsx","invalid", i, 0);
			String password = flib.ReadExcelData("./Data/saucedemo.xlsx","invalid", i, 1);


			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
			
			driver.findElement(By.name("username")).clear();
		}

	}

}
