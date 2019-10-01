package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import objectrepository.ObjectRepository;

public class NewToursePageTwo {

    private WebDriver driver;

    public NewToursePageTwo(WebDriver driver) {
        PageFactory.initElements(driver, new ObjectRepository());
    }

    public void loginToNewTours(String uName, String pswd) {

        ObjectRepository.userId.clear();
        ObjectRepository.userId.sendKeys(uName);

        ObjectRepository.password.sendKeys(pswd);

        ObjectRepository.loginButton.click();

    }

    public void switchToFrame(){
            driver.switchTo().frame(ObjectRepository.iframe);

    }

    public String getSignOFF() {
        String signOffText = ObjectRepository.logoutButton.getText();
        return signOffText;
    }

    public void logoutNewTours() {
        ObjectRepository.logoutButton.click();
    }

}
