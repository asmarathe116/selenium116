package OperationalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetSelectFirstElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/A/Desktop/HTML/multidrop.html");

		WebElement dropdownElement = driver.findElement(By.id("menu"));

		Select sel = new Select(dropdownElement);
		
		for(int i=3;i<=7;i++)
		{
			sel.selectByIndex(i);
		}
		
		WebElement firstOpt = sel.getFirstSelectedOption();
		String firstOptText = firstOpt.getText();
		System.out.println(firstOptText);
	}

}
