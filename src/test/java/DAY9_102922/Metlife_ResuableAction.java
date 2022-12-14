package DAY9_102922;

import Reusbale_Library.ReusableActions;
import org.openqa.selenium.WebDriver;

import static Reusbale_Library.ReusableActions.setUpDriver;

public class Metlife_ResuableAction {


    public static void main(String[] args) throws InterruptedException {
        //call webdriver method from reusable library
        WebDriver driver = setUpDriver();
        //navigate to MetLife
        driver.navigate().to("https://www.metLife.com");
        //hover over the solutions dropdown
        //ReusableActions.mouseHover(driver, "//*[contains(text(), 'SOLUTIONS')]", "Solutions Dropdown");
        //or click on solutions dropdown
        ReusableActions.clickActionByIndex(driver, "//*[contains(text(), 'SOLUTIONS')]", 0, "Solutions Link");
        //click on dental link
        ReusableActions.clickAction(driver, "//*[text() = 'Dental']", "Dental Link");
        //capture the headline title
        String headlineTitle = ReusableActions.getTextAction(driver, "//*[@class = 'headline__title']", "Headline Title");
        //print out the title
        System.out.println("The headline title is " + headlineTitle);
        //quit driver
        driver.quit();
    }//end of main
}
