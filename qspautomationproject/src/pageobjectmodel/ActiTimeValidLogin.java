package pageobjectmodel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ActiTimeValidLogin extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();

		String username = flib.readPropertyFile(PROP_PATH,"username");
		String password = flib.readPropertyFile(PROP_PATH,"password");

		LoginPage lp = new LoginPage(driver);
		lp.ActiTimeValidLogin(username,password);
	}

}

