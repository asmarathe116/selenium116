package TestAnnotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchGoogle extends BaseTest{
	
  @Test
  public void searc1() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
	  Thread.sleep(2000);
	 
  }
  
  @Test
  public void searc2() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  driver.switchTo().activeElement().sendKeys("sql");
	  Thread.sleep(2000);
  }
  
  @Test
  public void searc3() throws InterruptedException 
  {
	 
	  driver.switchTo().activeElement().sendKeys("automation");
	  Thread.sleep(2000);
  }
  
  
}
