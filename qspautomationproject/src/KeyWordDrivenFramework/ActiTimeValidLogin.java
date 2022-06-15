package KeyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest {

	public static void main(String[] args) throws InterruptedException, IOException {

		BaseTest bt = new BaseTest();
		Flib flib = new Flib();

		String username = flib.readPropertyFile("./Data/config.properties", "username");
		String password = flib.readPropertyFile("./Data/config.properties", "password");

		bt.openBrowser();
		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);

		bt.closeBrowser();
	}

}
