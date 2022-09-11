package AssignMents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartTimepass {

	public static void main(String[] args) throws InterruptedException {

      System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     WebDriver driver=new  ChromeDriver();
     driver.manage().window().maximize();
     
     driver.get("https://www.flipkart.com/");
     driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
     
     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();    //POPUP
     
     //MOUSE OVER ACTION 
     WebElement target = driver.findElement(By.xpath("//div[text()='Electronics']")); 
     Actions act = new Actions(driver);
     act.moveToElement(target).perform();
     
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles");
     driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    
     
    

	}

}
