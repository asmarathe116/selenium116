package assignmentdataDrivenfm;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","drivers./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		driver.get("https://www.saucedemo.com/");


		Flib flib = new Flib();

		String username = flib.ReadExcelData("./Data/saucedemo.xlsx","valid", 1, 0);
		String password = flib.ReadExcelData("./Data/saucedemo.xlsx","valid", 1, 1);


		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();


	}

}
