package DAY12_110622;

import Reusbale_Library.ReusableActions_Loggers;
import Reusbale_Library.Reusable_AnnotationsTestNG;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

import static Reusbale_Library.Reusable_AnnotationsTestNG.driver;
import static Reusbale_Library.Reusable_AnnotationsTestNG.logger;

public class T2_ReUsableAnnottation_GoogleSearch extends Reusable_AnnotationsTestNG {
    @Test
    public void searchForBmw(){
        driver.navigate().to("https://www.google.com");
        //search for bmw on the search field
        ReusableActions_Loggers.sendKeysAction(driver,"//*[@name='q']","BMW",logger,"Search Field");
        //hit submit on google search button
        ReusableActions_Loggers.submitAction(driver,"//*[@name='btnK']",logger,"Google Search");
    }//end of test 1

    @Test(dependsOnMethods = "searchForBmw")
    public void captureSearchNumber(){
        //capture the search results text
        String results = ReusableActions_Loggers.getTextAction(driver,"//*[@id='result-stats']",logger,"Search Results");
        String[] arrayResult = results.split(" ");
        //print back to html report by using log INFO
        logger.log(LogStatus.INFO,"Search number for BMW is " + arrayResult[1]);
    }//end of test 2


}
