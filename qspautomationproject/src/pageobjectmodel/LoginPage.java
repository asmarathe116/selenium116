package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//DECLARATION
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginbtn;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepmeloggedincheckbox;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement Logo;
	@FindBy(id="licenseLink") private WebElement Licenselink;



	//INTIALISATION right click-source-genrateconstrctor-deselect all
	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver,this);
	}




	//UTILIZASTION  right click-source-gettersandsetters-expand-select -getter only all
	public WebElement getUsn() {
		return usn;
	}

	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebElement getKeepmeloggedincheckbox() {
		return keepmeloggedincheckbox;
	}
	public WebElement getLogo() {
		return Logo;
	}
	public WebElement getLicenselink() {
		return Licenselink;
	}



	//GENERIC REUSABLE METHOD

	public void ActiTimeValidLogin(String username, String password)
	{
		usn.sendKeys(username);
		pass.sendKeys(password);
		loginbtn.click();


	}

	public void ActiTimeInvalidLogin(String invalidusername, String invalidpassword)
	{
		usn.sendKeys(invalidusername);
		pass.sendKeys(invalidpassword);
		loginbtn.click();

	}


	//OPERATIONAL METHODS

}
