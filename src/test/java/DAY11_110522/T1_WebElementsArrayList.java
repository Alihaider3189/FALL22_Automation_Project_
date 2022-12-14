package DAY11_110522;

import Reusbale_Library.ReusableActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class T1_WebElementsArrayList {
    WebDriver driver;
    ArrayList<WebElement> totalMenuHeaders, mainMenuHeaders;
    @BeforeSuite
    public void SetChromeDriver() throws InterruptedException {
        driver = ReusableActions.setUpDriver();
        //navigate to usps.com home page
        driver.navigate().to("https://www.usps.com/");
        //Thread.sleep(5000);
        //store all the elements of the menu header into an arraylist of webelements
        totalMenuHeaders = new ArrayList<>(driver.findElements(By.xpath("//*[@class = 'nav-list']/li")));
    }//end of set driver method
    @AfterSuite
    public void quitTheSession() {
        driver.quit();
    }//end of after suite

    //Test case 2 should verify the total count of displayed menu headers
    @Test(priority = 1)
    public void tc001() {
        System.out.println("The total number of menu header is:"+totalMenuHeaders.size());
    }
@Test(priority = 2)
public void tc002_clickonfirstdropdown() {totalMenuHeaders.get(0).click();
    }


    @Test(priority =3 )
public void tc003_verifyCountofMainMenuHeaders() {
        mainMenuHeaders= new ArrayList<>(driver.findElements(By.xpath("//*[@class='menuheader']")));
    System.out.println("total number of main menu headers is:"+mainMenuHeaders.size());
}//end of test3
}//end of class
