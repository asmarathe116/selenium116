package AssignMents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class review_TC01 {

	public static void main(String[] args) {

      System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
      driver.navigate().to("https://www.tripadvisor.in/");
      
      driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("club mahindra");
      

	}

}
