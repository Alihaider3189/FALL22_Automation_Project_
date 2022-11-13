package DAY7_102222;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T1_selectcommand {
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
        driver.navigate().to("https://www.mlcalc.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[text()='Show advanced options']")).click();
        Thread.sleep(1000);




//use select command for month drop dowwn
        WebElement startMonth = driver.findElement(By.xpath("//*[@name='sm']"));

        Select startMonthDropdown = new Select(startMonth);

        //Select by VISIBLE element
        //CAN
        startMonthDropdown.selectByVisibleText("Nov");


//use select command for year, STORING YEAR DROP DOWN AS WEBELEMENT TO CALL LATER
        WebElement startYear = driver.findElement(By.xpath("//*[@name='sy']"));
        Select startYeardropdown = new Select(startYear);
        startYeardropdown.selectByVisibleText("2023");



//HOW TO USE DROP DOWN WITHOUT SELECT COMMAND
       // driver.findElement(By.xpath("//*[@name='sy']")).click();
      // driver.findElement(By.xpath("//*[text()='2023']")).click();

    }
}

//driver.findElement(By.xpath("//*[@name='sy']")).click();
  //      driver.findElement(By.xpath("//*[text()='2023']")).click();
