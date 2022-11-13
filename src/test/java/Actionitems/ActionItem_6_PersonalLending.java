package Actionitems;

import Reusbale_Library.ReusableActions_Loggers;
import Reusbale_Library.Reusable_AnnotationsTestNG;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static Reusbale_Library.Reusable_AnnotationsTestNG.driver;
import static Reusbale_Library.Reusable_AnnotationsTestNG.logger;

public class ActionItem_6_PersonalLending extends Reusable_AnnotationsTestNG {
    JavascriptExecutor jse = (JavascriptExecutor) driver;

    @Test(priority = 1)
    public void tc001_calculateAutoLoanPayment() throws InterruptedException {
        //navigate to nationwide homepage
        driver.navigate().to("https://www.nationwide.com/");
//click on Bnaking and Borrowing
        ReusableActions_Loggers.clickActionByIndex(driver, "//*[@class='nw-header__category nw-header__opener nw-header__tabbable']", 2, logger, "Banking And Borrowwing");
        Thread.sleep(500);
        //click on mortgage button
        ReusableActions_Loggers.clickAction(driver, "//*[text()='Auto refinance']", logger, "Auto Refinance button");


        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to the new tab
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        jse = (JavascriptExecutor) driver;
        ReusableActions_Loggers.scrollByPixel(jse, 0, 1000);
        Thread.sleep(1000);
       //clearing Loan Amount by defining that field as webElement to click And Clear
        WebElement loanAmount = driver.findElement(By.xpath("//*[@id='loanAmount']"));
        loanAmount.click();
        loanAmount.clear();
        //inputting $4000 for loan amount
        ReusableActions_Loggers.sendKeysAction(driver, "//*[@id='loanAmount']", "$4000", logger, "Loan Amount");
        Thread.sleep(1000);
    }//end of TEST CASE 1


    @Test(dependsOnMethods = "tc001_calculateAutoLoanPayment")
    public void tc002_MonthlyPaymentCalculationAndCapture() throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
        //changing loan Duration from 36 to 48
        ReusableActions_Loggers.clickAction(driver, "//*[@id='loanDuration']", logger, "loan Amount button");

        //selecting 48 from the Loan Duration Drop down
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='loanDuration']"));
        Select dropdownmenu = new Select(dropdown);
        dropdownmenu.selectByVisibleText("48");
        logger.log(LogStatus.INFO, dropdownmenu.toString(), "selected");
        Thread.sleep(2000);

//clearing Interest rate field to input our desired amount
        WebElement interestRateAmount = driver.findElement(By.xpath("//*[@id='interestRate']"));
        interestRateAmount.click();
        interestRateAmount.clear();
        Thread.sleep(2000);
        //inputting our desired Interest rate amount of 2.5%
        ReusableActions_Loggers.sendKeysAction(driver, "//*[@id='interestRate']", "2.5", logger, "clearing interest rate");
        Thread.sleep(1000);
        //click on calculate Button
        ReusableActions_Loggers.clickActionByIndex(driver, "//*[@class='btn btn-calculate btn-blue']", 0, logger, "Calculate Button");
        Thread.sleep(1000);

        //Capture Text of Loan Amount now after new inputs are entered

        System.out.println(" Our Monthly payment now after new inputs are entered is "+ReusableActions_Loggers.getTextAction(driver, "//*[@id='estimatedPayment']", logger, "Capture New Loan Amount"+"\n"));
    }


    @Test(priority = 3)
    public void tc003_LoanAmountYouCanAffordCalculate() throws InterruptedException {

        driver.navigate().to("https://nationwide.axosbank.com/Personal/Auto-Refinance");

        jse = (JavascriptExecutor) driver;
        ReusableActions_Loggers.scrollByPixel(jse, 0, 1500);
//scroll down
        //jse = (JavascriptExecutor) driver;
//ReusableActions_Loggers.scrollByPixel(jse,0,700);

//clearing Loan Amount by defining that field as webElement to click And Clear
        WebElement amount2 = driver.findElement(By.xpath("//*[@name='loanAmount2']"));
        amount2.click();
        amount2.clear();
        //inputting $8000 for loan amount
        ReusableActions_Loggers.sendKeysAction(driver, "//*[@id='loanAmount2']", "$8000", logger, "Loan Amount");
        Thread.sleep(1000);

//clearing Interest rate field to input our desired amount
        WebElement interestRateAmountT = driver.findElement(By.xpath("//*[@id='interestRate2']"));
        interestRateAmountT.click();
        interestRateAmountT.clear();
        Thread.sleep(1000);
        //inputting our desired Interest rate amount of 3.5%
        ReusableActions_Loggers.sendKeysAction(driver, "//*[@id='interestRate2']", "3.5", logger, "clearing interest rate");
        Thread.sleep(1000);


        //click on calculate Button with index 1 as previous test had index 0
        ReusableActions_Loggers.clickActionByIndex(driver, "//*[@class='btn btn-calculate btn-blue']", 1, logger, "Calculate Button");
        Thread.sleep(1000);

        //Capture Text of Loan Amount We can afford now after new inputs are entered

        System.out.println("loan Amount We can afford now after new inputs are entered is "+ ReusableActions_Loggers.getTextAction(driver, "//*[@id='estimatedPayment2']", logger, "Capture New Loan Amount"+"\n"));




    }//end of Test Case 3

}//end of test class