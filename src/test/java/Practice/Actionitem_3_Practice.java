package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Actionitem_3_Practice {

    public static void main(String[] args) throws InterruptedException {

        //setting up chrome browser with Web manager
        WebDriverManager.chromedriver().setup();
//initializing chrome options
        ChromeOptions options= new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        WebDriver driver= new ChromeDriver(options);

        driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
Thread.sleep(2000);

        ArrayList<String> zipcode= new ArrayList<>();
        zipcode.add("10461");
        zipcode.add("10462");
        zipcode.add("10457");

        for (int i=0; i < zipcode.size() ; i++) {

//driver.findElement(By.xpath("//*[text()='Find a Workshop')]")).click();

 WebElement search = driver.findElement(By.xpath("//*[contains(@id,'location-search')]"));
        search.sendKeys(zipcode.get(i));
        search.click();
Thread.sleep(1000);
       //create Web Element to click on the arrow and search our zipcode
      WebElement arrow = driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']"));
      //calling our web element to click
      arrow.click();
      Thread.sleep(500);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
      //scroll down to 500 pixels
        jse.executeScript("scroll(0,500)");
        Thread.sleep(2000);
//clicking on the  studio link for each zipcode
        driver.findElements(By.xpath("//*[contains(@class,'linkUnderline-1_h4g')]")).get(i).click();
        Thread.sleep(1000);
//creating a web element to scroll down to in person section
        WebElement inperson= driver.findElement(By.xpath("//*[@class='title-bEfSM']"));
           jse.executeScript("arguments[0].scrollIntoView(true);",inperson);
            Thread.sleep(2000);
String schedule= driver.findElement(By.xpath("//*[@id='studioWorkshopSchedule']")).getText();
           String[] scheduleresult= schedule.split(" ");
            System.out.println("the adress for each zipcodeis "+scheduleresult[i]);


           // WebElement studio= driver.findElement(By.xpath(("//*[contains(@class,'linkUnderline-1_h4g')]")));

           // if (i==0){studio.click(); WebElement inperson= driver.findElement(By.xpath("//*[@class='title-bEfSM']"));
             //   jse.executeScript("arguments[0].scrollIntoView(true);",inperson);
             //   Thread.sleep(2000);  }





driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
      Thread.sleep(1000);}


        /*search.sendKeys(zipcode.get(1));
        search.click();
        Thread.sleep(1000);
        arrow.click();

        */


















    }//end of method




}//end of main
