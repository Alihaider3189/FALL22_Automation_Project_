package DAY5_101522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_chromeOptions {


        public static void main(String[] args) throws InterruptedException {
            //setup your chromedriver with webdrivermanager
            WebDriverManager.chromedriver().setup();
            //initialize chrome options
            ChromeOptions options = new ChromeOptions();
            //add options for maximizing the chrome window
            options.addArguments("start-maximized","incognito");
            //options.addArguments("incognito");
       //options.addArguments("headless");
            //for mac use "start-fullscreen"
//go to google page
            WebDriver driver = new ChromeDriver(options);
            driver.navigate().to("https://www.google.com");
            //locate element for search field and type cars
            //this is an example of relative xpath
            //driver.findElement(By.xpath("//*[@name = 'q']")).sendKeys("cars");

            //this is using the class instead of the name to xpath find the search bar and type cars
            driver.findElement(By.xpath("//*[contains(@class,'gLFyf')]")).sendKeys("cars");

            //submit on google search button
            driver.findElement(By.xpath("//*[@name ='btnK']")).submit();

            //capture the search result and print it
            String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();

            //extract out the number and print the search number only
            String[] arrayResult = searchResult.split(" ");
            System.out.println("My search number is " + arrayResult[1]);

            //quit driver
           // driver.quit();

     }//end of method





}//end of class
