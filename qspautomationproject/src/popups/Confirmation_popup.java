package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_popup {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		driver.get("file:///C:/Users/A/Desktop/HTML/confirmationpop.html");
		driver.findElement(By.xpath("//button[text()=\"Try it\"]")).click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	} 
}
