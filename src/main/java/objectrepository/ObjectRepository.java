package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectRepository {

	@FindBy(xpath = "//input[@name='userName']")
	public static WebElement userId;

	@FindBy(xpath = "//input[@name='password']")
	public static WebElement password;

	@FindBy(xpath = "//input[@name='login']")
	public static WebElement loginButton;

	@FindBy(xpath = "//a[text()='SIGN-OFF']")
	public static WebElement logoutButton;

	@FindBy(id = "'a077aa5e'")
	public static WebElement iframe;
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
