package Practice;

import Reusbale_Library.ReusableActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class MoneyMarket_01 {
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
        driver.findElement(By.xpath("//*[text()='Money market']")).click();

        driver.getWindowHandles();
        //store the tabs in arraylist
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to the new tab
        driver.switchTo().window(tabs.get(1));
        WebElement calculateButton= driver.findElement(By.xpath("//*[@class='promo-title']"));
        jse.executeScript("arguments[0].scrollIntoView(true);", calculateButton);

        //defining string variable for account features so we can capture the text
        String  MoneyMarketFeautres= ReusableActions.getTextAction(driver,"//*[@class='promo-container']","Money Market Account");
        //splitting the text so we can capture it
        String[] MoneyMktacct = MoneyMarketFeautres.split(" ");
        //printing out the saving account key feautures
        System.out.println(MoneyMarketFeautres);
        driver.quit();


    }

    }
