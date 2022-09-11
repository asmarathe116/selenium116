package assignmentdataDrivenfm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_file {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://desktop-ddcequv/login.do");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[1]/td[13]/a/img")).click();
		driver.findElement(By.xpath("//a[text()=\"Logo & Color Scheme\"]")).click();
		
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/input")).click();
		driver.findElement(By.xpath("//input[@name=\"formCustomInterfaceLogo.logo\"]")).click();

	}

}
