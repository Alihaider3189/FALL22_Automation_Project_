package day6_101622;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_WebElements_Mcalc {

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


        //clear and enter a new value on purchase price field
        WebElement pprice = driver.findElement(By.xpath("//*[@name ='ma']"));
//clear the purchase price
        pprice.clear();

        //type new value on the purchase price
        pprice.sendKeys("450000");

        //clear and enter a new value on down payment field
        WebElement dPayment = driver.findElement(By.xpath("//*[@name ='dp']"));
//clear the down payment
        dPayment.clear();

        //type mew value for down payment
        dPayment.sendKeys("25");
    }//end of main
}//end of class
