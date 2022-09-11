package assignmentdataDrivenfm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asssss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("http://ww12.demoaut.com/");
		
		driver.findElement(By.xpath("//a[@class=\"i_ si144 \"]")).click();
		//span[text()="Rental Car In"]
		//a[@class="i_ si144 "]
	}

}
