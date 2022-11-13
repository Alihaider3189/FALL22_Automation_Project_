package Practice;

import Reusbale_Library.ReusableActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class CheckingAccount_01 {

    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //initialize chrome options
        ChromeOptions options = new ChromeOptions();
        //add options for maximizing the chrome window
        options.addArguments("start-maximized");

//go to Nationwide Homepage
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.navigate().to("https://www.nationwide.com");
        driver.findElements(By.xpath("//*[@class='nw-header__category nw-header__opener nw-header__tabbable']")).get(2).click();
        driver.findElement(By.xpath("//*[text()='Checking']")).click();

        driver.getWindowHandles();
        //store the tabs in arraylist
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to the new tab
        driver.switchTo().window(tabs.get(1));
        jse.executeScript("scroll(0,1000)");

        //click on "learn more" about advantage checking
        driver.findElements(By.xpath("//*[@class='link']")).get(0).click();
        //scrolling down to Advantage checking Info
        jse.executeScript("scroll(0,1200)");
Thread.sleep(1000);

//defining advantage checking info as string vairbale to capture its text
String advantageChecking = ReusableActions.getTextAction(driver,"//*[@class='section']","advantge");
     //splitting the text for advantge checking
        String[] arrayResult = advantageChecking.split(" ");

//printing out the info for advantgae checking account offered
        System.out.println(" " +advantageChecking);
       driver.quit();

    }
}
/*}

 *String results="";
               for (int i=0; i<3;i++){
        results=results+ ReusableActions_Loggers.getTextByIndex(driver,"//*[@scope='colgroup']",i,logger,"advantge");
        }
        System.out.println(" "+results);

        Thread.sleep(1000);



        driver.findElement(By.xpath("//*[text()='Gmail']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Create an account']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Help']")).click();
        Thread.sleep(1000);
        jse.executeScript("scroll(0,4000)");
        //driver.findElements(By.xpath("//*[contains(@class,'down')]")).get(1).click();


        //driver.findElements(By.xpath("//*contains(@class(),'article-link')")).get(3).click();

        //WebElement calculateButton = driver.findElement(By.xpath("//*[contains(@class,'need-more-help-title')]"));
        //scroll into view of calculate button
        //jse.executeScript("arguments[0].scrollIntoView(true);", calculateButton);
        //wait 2 secs


*/

//driver.quit();
