package Actionitems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class ActionItem_4 {
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
        //driver.navigate().to("https://www.Hotels.com");


        ArrayList<String> destination = new ArrayList<>();
        destination.add("Los Angeles");
        destination.add("Houston");
        destination.add("San Diego");

        for (int i = 0; i < destination.size(); i++) {
            driver.navigate().to("https://www.Hotels.com");

            //click on going to tab
            WebElement gointo = driver.findElement(By.xpath("//*[@class= 'uitk-fake-input uitk-form-field-trigger']"));
            gointo.click();
            Thread.sleep(2000);

            //typing our desitnation
            WebElement search = driver.findElement(By.xpath("//*[@placeholder='Going to']"));
            search.sendKeys(destination.get(i));
            Thread.sleep(2000);

            //Select destination from drop down
            driver.findElements(By.xpath("//*[@class='truncate']")).get(0).click();


            //click TRAVELERS, then ADULT LIST TO SET BACK TO ONE
            driver.findElement(By.xpath("//*[contains(@class, 'uitk-menu-trigger uitk')]")).click();
            Thread.sleep(2000);

            //set adults amount to '1'
            driver.findElement(By.xpath("//*[@class= 'uitk-step-input-button']")).click();
            //click on child age
            driver.findElements(By.xpath("//*[@class='uitk-icon uitk-step-input-icon uitk-icon-medium']")).get(3).click();
            Thread.sleep(1000);
//declare and define web elment to select child age from drop down
            WebElement childAge = driver.findElement(By.xpath("//*[@name='child-traveler_selector_children_age_selector-0-0']"));
            childAge.click();
            Select childAgedropdown = new Select(childAge);
            childAgedropdown.selectByIndex(i);


            //childAgedropdown.selectByVisibleText("Under 1");
            Thread.sleep(2000);
            ArrayList<Integer> traveler = new ArrayList<>();
            traveler.add(2);
            traveler.add(3);
            traveler.add(4);
            for (int j = 1; j < traveler.size(); j++) {


                //clicking done on travelers tab
                driver.findElement(By.xpath("//*[@id='traveler_selector_done_button']")).click();

                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@id='submit_button']")).click();
                //end of loop 2
//click 1st hotel link
                driver.findElements(By.xpath("//*[@class='uitk-card-link']")).get(1).click();
                Thread.sleep(6000);

                //ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
                Thread.sleep(2000);

                ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
                //switch to the new tab
                driver.switchTo().window(tabs.get(1));

                driver.findElement(By.xpath("//*[@class= 'uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary']")).click();

                Thread.sleep(3000);



                //click reserve button
                try {
                    String dollarValue = driver.findElement(By.xpath("//*[@class='uitk-text uitk-type-600 uitk-type-bold uitk-text-emphasis-theme']")).getText();
                    System.out.println("The amount of stay for " + destination.get(i) + " " + "is: " + dollarValue);
                } catch (Exception e) {
                    System.out.println("unable to click reserve button " + e);
                }
                ;


                driver.close();
                driver.switchTo().window(tabs.get(0));


            }//end of for loop 1
            driver.quit();
        }//end of main
    }//end of java class
}
