package day6_101622;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class T4_Mcalc_Scroll {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //initialize chrome options
        ChromeOptions options = new ChromeOptions();
        //add options for maximizing the chrome window
        options.addArguments("start-maximized");
        //options.addArguments("headless");
        //for mac use "start-fullscreen"
//go to google page
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.mlcalc.com");


        //wait a few seconds
        Thread.sleep(3000);
//define javascript executor
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll down to 800 pixels
        //  jse.executeScript("scroll(0,2000)");
        //wait 2 secs
        Thread.sleep(2000);
        //scroll up to 400 pixels
        //   jse.executeScript("scroll(0,-1)");
        //wait 2 secs
        //   Thread.sleep(2000);
        //store calculate button into webelement variable
        WebElement calculateButton = driver.findElement(By.xpath("//*[@value='Calculate']"));
        //scroll into view of calculate button
        jse.executeScript("arguments[0].scrollIntoView(true);", calculateButton);
        //wait 2 secs
        Thread.sleep(5000);
        //quit chrome
        //driver.quit();


    }
}
