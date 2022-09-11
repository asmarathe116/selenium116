package AssignMents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class flipkart_assighnment01 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("iphone12");

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);  
		robot.keyRelease(KeyEvent.VK_ENTER);



		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"APPLE iPhone 12 (Blue, 64 GB)\"]")).click();

		Set<String> childwindow = driver.getWindowHandles();
		Iterator<String> itr = childwindow.iterator();
		while(itr.hasNext())
		{
			String window = itr.next();
			driver.switchTo().window(window);
		}


		String price = driver.findElement(By.xpath("//div[@class=\"_30jeq3 _16Jk6d\"]")).getText();
		System.out.println(price);


		price=price.replaceAll("[^0-9]","");
		System.out.println(price);
		
		int i=Integer.parseInt(price); 
		
		driver.navigate().to("https://www.amazon.com");
		driver.findElement(By.xpath("//span[@class=\"icp-nav-link-inner\"]")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("//i[@class=\"a-icon a-icon-dropdown\"]"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(11);
		

        
    
	
		
		
		
		

	}

}
