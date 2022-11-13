package DAY7_102222;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class T2_multipletabs {

    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //initialize chrome options
        ChromeOptions options = new ChromeOptions();
        //add options for maximizing the chrome window
        options.addArguments("start-maximized");
        //options.addArguments("headless");
        //for mac use "start-fullscreen"
//go to mlcalc page
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.fideliscare.org");
        Thread.sleep(2000);

        //click on shop for a plan
        driver.findElement(By.xpath("//*[text() = 'Shop For a Plan']")).click();
        //wait a bit
        Thread.sleep(2000);
        //click on medicaid managed care
        driver.findElement(By.xpath("//*[text() = 'Medicaid Managed Care']")).click();
        //wait a bit
        Thread.sleep(2000);
        //click on find a doctor search icon (which will launch a new tab)
        driver.findElement(By.xpath("//*[@class= 'btn btn-outline-primary btn-external btn-show link-external']")).click();
        //wait a bit
        Thread.sleep(2000);
//store the tabs in arraylist
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to the new tab
        driver.switchTo().window(tabs.get(1));
        //enter a zip code on the search field
        driver.findElement(By.xpath("//*[@id = 'searchLocation']")).sendKeys("11230");
        //wait a bit
        Thread.sleep(2000);
//close the find a doctor tab
        driver.close();

        //switch to initial tab(parent tab)
        driver.switchTo().window(tabs.get(0));

        //go to the home page
        driver.navigate().to("https://www.fideliscare.org");
Thread.sleep(1000);

//click on get coverage,first match is index 0
        //both of these find element and find elementS lead to the same thing, except element gives you 0 index and Element(S) gives you all the index you need
        //driver.findElements(By.xpath("//*[@class='btn ng-binding btn-primary']")).get(0).click();
driver.findElement(By.xpath("//*[@class='btn ng-binding btn-primary']")).click();
Thread.sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll down to 800 pixels
         jse.executeScript("scroll(0,500)");


WebElement name= driver.findElement(By.xpath("//*[@id='firstName']"));

name.click();
name.sendKeys("Bhatti");
    }
}