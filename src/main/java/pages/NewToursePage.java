package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import objectrepository.ObjectRepository;

public class NewToursePage {

	@FindBy(xpath = "//input[@name='userName']")
	public static WebElement userId;
	
	@FindBy(xpath = "//input[@name='password']")
	public static WebElement password;
	
	@FindBy(xpath = "//input[@name='login']")
	public static WebElement loginButton;
	
	@FindBy(xpath = "//a[text()='SIGN-OFF']")
	public static WebElement logoutButton;

	@FindBys(@FindBy(xpath = "//input[@name='userName']"))
	public static List<WebElement> webElementList;

	public NewToursePage(WebDriver driver) 	{
		PageFactory.initElements(driver, this);  // this == new NewToursePage(driver)
	}

	public void enterCredentials(String uName, String pswd) {

		userId.clear();
		userId.sendKeys(uName);

		password.sendKeys(pswd);

	}

	public void clickLoginButton() {

		loginButton.click();

	}

	public String getSignOFF() {
		String signOffText = logoutButton.getText();
		return signOffText;
	}

	public void logoutNewTours() {
		logoutButton.click();
	}

}
