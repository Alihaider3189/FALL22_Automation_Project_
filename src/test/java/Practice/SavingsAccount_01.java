package Practice;

import Reusbale_Library.ReusableActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class SavingsAccount_01 {

    public static void main(String[] args) throws InterruptedException {

        //setting up chrome browser with Web manager
        WebDriverManager.chromedriver().setup();
//initializing chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        //go to Nationwide Homepage
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.navigate().to("https://www.nationwide.com");

        //click on Banking and Borrowing
        driver.findElements(By.xpath("//*[@class='nw-header__category nw-header__opener nw-header__tabbable']")).get(2).click();

        //click on  Savings
        driver.findElement(By.xpath("//*[text()='Savings']")).click();
        //scroll down
        driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to the new tab
        driver.switchTo().window(tabs.get(1));
        jse.executeScript("scroll(0,1000)");

        //click on learn more about "My Savings" Account
        driver.findElements(By.xpath("//*[@class='link']")).get(0).click();

        //defining string varibale for account features so we can capture the text
      String   savingsAccountFeautres= ReusableActions.getTextAction(driver,"//*[@class='ax-feat-box']","Savings Account");
       //splitting the text so we can capture it
        String[] savingacct = savingsAccountFeautres.split(" ");
        //printing out the saving account key feautures
        System.out.println(savingsAccountFeautres);
        driver.quit();
    }
}