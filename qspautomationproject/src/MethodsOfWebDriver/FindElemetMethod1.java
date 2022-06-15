package MethodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElemetMethod1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-smc8hiai/login.do");
		
		WebElement usernameTextBox = driver.findElement(By.name("username"));
		usernameTextBox.sendKeys("admin");
		System.out.println(usernameTextBox);
		WebElement passwordTextBox = driver.findElement(By.name("pwd1234"));
		passwordTextBox.sendKeys("manager");
	}

}