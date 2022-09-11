package AssignMents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class opencart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver=new  ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.navigate().to("https://www.amazon.com");
			driver.findElement(By.xpath("//span[@class=\"icp-nav-link-inner\"]")).click();
			
		driver.findElement(By.xpath("//i[@class=\"a-icon a-icon-dropdown\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"icp-currency-dropdown-selected-item-prompt\"]/span/span/span")).click();
			
			
			
	   

	}

}
