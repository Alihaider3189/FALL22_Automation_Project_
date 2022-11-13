package Actionitems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Actionitem_3 {

    public static void main(String[] args) throws InterruptedException {

        //setting up chrome browser with Web manager
        WebDriverManager.chromedriver().setup();
//initializing chrome options
        ChromeOptions options= new ChromeOptions();
        //having the window maximized and incognito
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        WebDriver driver= new ChromeDriver(options);

        driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
Thread.sleep(2000);
//create Array list of zipcodes
        ArrayList<String> zipcode= new ArrayList<>();
        zipcode.add("10461");
        zipcode.add("10462");
        zipcode.add("10457");
//use for loop to iterate the search bar and click through all the zipcodes
        for (int i = 0; i < zipcode.size(); i++) {
            //go to weight watchers site
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
//define a webElement to click on search bar
            WebElement search = driver.findElement(By.xpath("//*[contains(@id,'location-search')]"));
            //type out the zipcode on the search bar
            search.sendKeys(zipcode.get(i));
            //clicking search after the zipcode is typed
            search.click();
            //sleep statement
            Thread.sleep(1000);
            //create Web Element to click on the arrow and search our zipcode
            WebElement arrow = driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']"));
            //calling our web element to click
            arrow.click();
            Thread.sleep(500);
            //scrolling down
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            //scroll down to 500 pixels
            jse.executeScript("scroll(0,500)");
            Thread.sleep(2000);



//creating array list of web elements to click through the addresses and run if condition on it
            ArrayList<WebElement> address = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@class,'wrapperLink-2NobU')]")));
            if (i == 0) {
                address.get(1).click();
                Thread.sleep(1000);

            }//end first statement
            else if (i == 1) {
                // //scroll down to 1300 pixels
                jse.executeScript("scroll(0,1300)");
                address.get(2).click();
                Thread.sleep(2000);
            }//end second statement

            else if ( i == 2) {
                address.get(0).click();
            }// end of 3rd statement
            String location  = driver.findElements(By.xpath("//*[contains(@class, 'address')]")).get(1).getText();
            //"\n" that means spacing result
            String[] splitLocation = location.split("\n");
            System.out.println (splitLocation[0] + "\n"+splitLocation[1] );
            jse.executeScript("scroll(0,700)");
            String schedule = driver.findElement(By.xpath("//*[contains(@class,'scheduleContainerMobile')]")).getText();
            System.out.println(schedule);
            System.out.println();

        }//end of loop
        //driver.quit();

    }//end of method




}//end of main
