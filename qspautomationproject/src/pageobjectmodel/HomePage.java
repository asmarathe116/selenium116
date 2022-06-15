package pageobjectmodel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {



	//DECLARATION
	@FindBy(xpath ="//a[@class='logout']") private WebElement LogoutLink;
	@FindBy(xpath = "//input[@value='Create New Tasks']") private WebElement createNewTask;
	@FindBy(xpath ="//div[text()='Settings']") private WebElement settings;

	//INTIALISATION right click-source-genrateconstrctor-deselect all
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	//UTILIZASTION  right click-source-gettersandsetters-expand-select -getter only all
	public WebElement getLogoutLink() {
		return LogoutLink;
	}

	public WebElement getCreateNewTask() {
		return createNewTask;
	}

	public WebElement getSettings() {
		return settings;
	}

	    //GENERIC REUSAGABLE METHOD CLASS
	public void logout()
	{
		LogoutLink.click();
	}

}


