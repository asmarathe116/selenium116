package pageobjectmodel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ActiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		BaseTest bt = new BaseTest();
		bt.setUp();

		Flib flib = new Flib();
		int rc = flib.getRowCount(EXCEL_PATH, "invalidcreds");
		LoginPage lp = new LoginPage(driver);

		for(int i=1;i<=rc;i++)
		{
			String invalidusername = flib.readExcelData(EXCEL_PATH, "invalidcreds", i,1);
			String invalidpassword = flib.readExcelData(EXCEL_PATH, "invalidcreds", i,0);

			lp.ActiTimeInvalidLogin(invalidusername, invalidpassword);
		}
	}

}
