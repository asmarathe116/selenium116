package KeyWordDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class ActiTimeInvalidLogin extends BaseTest{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

            BaseTest bt = new BaseTest();
            Flib flib = new Flib();
            bt.openBrowser();
            
            int rc = flib.getrowCount("./Data/ActiTimeCrendns.xlsx","invalidcreds");
            
            for(int i=1;i<=rc;i++)
            {
            	
            	String username = flib.readExcelData("./Data/ActiTimeCrendns.xlsx","invalidcreds", i, 0);
    			String password = flib.readExcelData("./Data/ActiTimeCrendns.xlsx","invalidcreds", i, 1);
    			driver.findElement(By.name("username")).sendKeys(username);
    			driver.findElement(By.name("pwd")).sendKeys(password);
    			driver.findElement(By.id("loginButton")).click();
    			Thread.sleep(2000);
    			driver.findElement(By.name("username")).clear();
            }
            
	}

}
