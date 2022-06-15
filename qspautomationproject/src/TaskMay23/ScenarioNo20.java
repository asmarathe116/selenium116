package TaskMay23;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioNo20 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(3000);

		WebElement targetToMouseHover = 
				driver.findElement(By.xpath("//a[@title='Jewellery']"));

		Actions act = new Actions(driver);
		act.moveToElement(targetToMouseHover).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@title='Gold Coins']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='filter 10gms']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='10 gram 24 KT Lakshmi Gold Coin']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
