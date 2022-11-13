package Actionitems;

import Reusbale_Library.ReusableActions;
import Reusbale_Library.ReusableActions_Loggers;
import Reusbale_Library.Reusable_AnnotationsTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class ActionItem_6_PersonalBanking extends Reusable_AnnotationsTestNG {
    JavascriptExecutor jse = (JavascriptExecutor) driver;


    @Test(priority = 1)
    public void tc001_veirfyCheckingAccountInfo() throws InterruptedException {
//navigate to nationwide homepage
        driver.navigate().to("https://www.nationwide.com/");
// Thread.sleep(1000);
        //click on banking and borrowing
        ReusableActions_Loggers.clickActionByIndex(driver, "//*[@class='nw-header__category nw-header__opener nw-header__tabbable']", 2, logger, "Banking And Borrowwing");
        Thread.sleep(500);

        //click on checking from main menu
        ReusableActions_Loggers.clickAction(driver, "//*[text()='Checking']", logger, "checking Button");
        //scroll down
        jse = (JavascriptExecutor) driver;
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to the new tab
        driver.switchTo().window(tabs.get(1));
        //jse.executeScript("scroll(0,1000)");
        ReusableActions_Loggers.scrollByPixel(jse,0,1000);
        Thread.sleep(2000);

        ReusableActions_Loggers.clickActionByIndex(driver,"//*[@class='link']",0,logger,"Click Learn more");
        ReusableActions_Loggers.scrollByPixel(jse,0,1300);


        System.out.println(ReusableActions_Loggers.getTextAction(driver,"//*[@class='section']",logger,"advantge")+"\n");

        driver.close();
        driver.switchTo().window(tabs.get(0));
    }


    @Test(priority = 2)
    public void tc002_SavingsLink() throws InterruptedException {
       driver.navigate().to("https://www.nationwide.com/");
// Thread.sleep(1000);
        //click on banking and borrowing
        ReusableActions_Loggers.clickActionByIndex(driver, "//*[@class='nw-header__category nw-header__opener nw-header__tabbable']", 2, logger, "Banking And Borrowwing");
        Thread.sleep(500);

        //click on Savings from main menu
        ReusableActions_Loggers.clickAction(driver, "//*[text()='Savings']", logger, "Savings Button");


        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to the new tab
        driver.switchTo().window(tabs.get(1));
        //scroll down
         //jse = (JavascriptExecutor) driver;
        //jse.executeScript("scroll(0,1000)");
        ReusableActions_Loggers.scrollByPixel(jse,0,1000);
        Thread.sleep(2000);


        //click on "learn more" about Saving
        driver.findElements(By.xpath("//*[@class='link']")).get(0).click();
        //scrolling down to Advantage checking Info
        jse.executeScript("scroll(0,1000)");
        Thread.sleep(1000);

//defining advantage checking info as string vairbale to capture its text
        //defining string varibale for account features so we can capture the text
        String   savingsAccountFeautres= ReusableActions.getTextAction(driver,"//*[@class='ax-feat-box']","Savings Account");
        //splitting the text so we can capture it
        String[] savingacct = savingsAccountFeautres.split(" ");
        //printing out the saving account key feautures
        System.out.println(savingsAccountFeautres);
        System.out.println();
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }//end of Test case 2






    @Test(priority = 3)
    public void tc003_MoneyMarketFeatures() throws InterruptedException {
        driver.navigate().to("https://www.nationwide.com/");
Thread.sleep(1000);
        //click on banking and borrowing
        ReusableActions_Loggers.clickActionByIndex(driver, "//*[@class='nw-header__category nw-header__opener nw-header__tabbable']", 2, logger, "Money Market");
        Thread.sleep(500);


        //click on Money Market from main menu
        ReusableActions_Loggers.clickAction(driver, "//*[text()='Money market']", logger, "Money Market Button");

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to the new tab
        driver.switchTo().window(tabs.get(1));
        jse= (JavascriptExecutor) driver;
       ReusableActions_Loggers.scrollByPixel(jse,0,1000);
         //ReusableActions_Loggers.getTextAction(driver,"//*[@class='banner-content bg-teal white-text col-md-6 col-sm-12']",logger,"Money Market Account");

        System.out.println(ReusableActions_Loggers.getTextAction(driver,"//*[@class='banner-content bg-teal white-text col-md-6 col-sm-12']",logger,"Money Market Account")+"\n");

    }//end of test 3
}
//end of class



