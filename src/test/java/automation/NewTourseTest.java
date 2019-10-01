package automation;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;
import pages.NewToursePage;
import pages.NewToursePageTwo;

public class NewTourseTest extends TestBase {

    NewToursePage newToursePage;
    NewToursePageTwo newToursePageTwo;

    @Test(priority = 1)
    public void loginTest() {
    	driver.get("http://newtours.demoaut.com/");
        //Create Login Page object
        newToursePage = new NewToursePage(driver);

        newToursePage.enterCredentials("demo","demo");
        newToursePage.clickLoginButton();
        
        String signOffText = newToursePage.getSignOFF();
        System.out.println("signOffText is :: "+signOffText);
        Assert.assertEquals("SIGN-OFF", signOffText);

        newToursePage.logoutNewTours();

    }
    
    @Test(priority = 2)
    public void loginTest2() {

    	driver.get("http://newtours.demoaut.com/");

        //Create Login Page object
        newToursePageTwo = new NewToursePageTwo(driver);

        newToursePageTwo.loginToNewTours("demo","demo");
        
        String signOffText = newToursePageTwo.getSignOFF();
        System.out.println("signOffText is :: "+signOffText);

        Assert.assertEquals("SIGN-OF", signOffText);

        newToursePageTwo.logoutNewTours();
        
        
        
    }

}
