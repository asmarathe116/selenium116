package ReadTextExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginByFrameWorkExcelData {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-ddcequv/login.do");
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		//USERNAME
		FileInputStream fis = new FileInputStream("./Data/ActiTimeCrendns.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("logincreds");
		Row row = sh.getRow(1);
		Cell cell = row.getCell(0);
		String username = cell.getStringCellValue();
		
		Thread.sleep(3000);
		//Password
		FileInputStream fis1 = new FileInputStream("./Data/ActiTimeCrendns.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis1);
		Sheet sh1 = wb1.getSheet("logincreds");
		Row row1 = sh1.getRow(1);
		Cell cell1 = row1.getCell(1);
		String password = cell1.getStringCellValue();

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
	}

}
