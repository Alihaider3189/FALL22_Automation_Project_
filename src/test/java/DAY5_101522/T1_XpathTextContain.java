package DAY5_101522;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class T1_XpathTextContain {

    public static void main(String[] args) throws InterruptedException {

        //define the web driver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();
        //define the chrome driver to use for your test
        //creating an instance for a chrome driver(browser) to use for automation
        WebDriver driver = new ChromeDriver();

        //navigate to the yahoo site
        driver.navigate().to("https://www.Yahoo.com");

        //sleep statement
        Thread.sleep(3000);

        //maximize my window
        //for Windows
        driver.manage().window().maximize();
        //for mac
        //driver.manage().window().fullscreen();

        //sleep statement
        Thread.sleep(3000);


        //click on sign in button
        driver.findElement(By.xpath("//*[text()='Sign in']")).click();

        //sleep statement
        Thread.sleep(3000);

        //goto yahoo homepage
        driver.navigate().to("https://www.yahoo.com");

        //click on bell icon, we use contain method since it does not have text
        driver.findElement(By.xpath("//*[contains(@class,'rapid-nonanchor')]")).click();

        Thread.sleep(3000);

        driver.quit();//exit chrome
    }
}
