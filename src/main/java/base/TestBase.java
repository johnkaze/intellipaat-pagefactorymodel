package base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestBase {

	public WebDriver driver;

	@BeforeSuite
	public void setup(){
		launchBrowser();
	}

	public WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\Users\\JohnKaze\\intellipaat-pagefactorymodel\\PageFactoryModel\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}


}
