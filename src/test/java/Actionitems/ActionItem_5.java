package Actionitems;

public class ActionItem_5 {
    /*
        WebDriver driver;
        @BeforeSuite
        public void setUpDriver(){
            driver= ReusableActions.setUpDriver();
        }//end of before suit


        @AfterSuite
        public void quitSession(){
            driver.quit();
        }//end of after suit


        @Test(priority = 0)
        public void TestCase_1(){
            //1.Navigate to UHC.com
            driver.navigate().to("https://www.uhc.com/");

            //handle pop up window
            try {
                //if the pop up is displayed then click on no
                driver.findElement(By.xpath("//*[@id='ip-no']")).click();
            } catch (Exception e) {
                System.out.println("Unable to find pop up window " + e);
            }//end of popUp Action


            //CLick on find a Doctor link
            ReusableActions.clickAction(driver,"//*[@aria-label='Find a doctor']","Find a Doctor");

            //Scroll into view by Find a dentist
            WebElement MoveToView=driver.findElement(By.xpath("//*[text()='Find a dentist']"));
            // Actions class with moveToElement()
            Actions Move = new Actions(driver);
            Move.moveToElement(MoveToView);
            Move.perform();
            //click on find a dentist
            ReusableActions.clickAction(driver,"//*[text()='Find a dentist']","Find a dentist");
            //Switch to new tab
            //ReusableActions.SwitchToTabByIndex(driver,);
            //click on Employer and individual plans
            ReusableActions.clickActionByIndex(driver,"//*[@class='gs-option']",0,"Employer and individual plans");
        }// End of test case 1
        @Test(priority = 1)
        public void TestCase_2() throws InterruptedException {
            //Enter a zip code
            ReusableActions.sendKeysAction(driver,"//*[@id='location']","10036","Enter a zip code");
            Thread.sleep(1000);
            //Click on continue button
            ReusableActions.submitAction(driver,"//*[@class='action-btn dialog-btn noZip']","continue button");
            //CLick on National options ppo 30
            ReusableActions.clickAction(driver,"//*[@class='sc-jomqko TEkcT']","National options ppo 30");
            //CLick on General dentist
            ReusableActions.clickAction(driver,"//*[text()='General Dentists']","General Dentists");
        }// End of test case 2
        @Test(priority = 3)
        public void TestCase_3(){
            //1.Select from drop down
            ReusableActions.selectbytext(driver,"//*[@id='distance']","Within 5 Miles","Select a mile");
            //2.Click on doctor name
            ReusableActions.clickActionByIndex(driver,"//*[@id='provider-name-link']",0,"first doctor name");
            //3.click on save button
            ReusableActions.clickAction(driver,"//*[text()='Save']","save button");
            //4.Capture and print out element names
            ReusableActions.getTextAction(driver,"//*[@id='label__selectedLocation0']","ADDRESS");
            ReusableActions.getTextAction(driver,"//*[@data-test-id='distance-away']","MILES");
            ReusableActions.getTextAction(driver,"//*[@class='status-label']","NETWORK");
            //click on close
            ReusableActions.clickAction(driver,"//*[@class='action-btn']","click on close");
            //close tab
            driver.close();

        }// End of test case 3

        @Test(priority = 3)
        public void TestCase_4(){
            //1.Switch back to default tab
            ReusableActions.switchTabsByIndex(driver,0);
            //2.enter Key word Doctor
            ReusableActions.sendKeysAction(driver,"//*[@id='search-desktop']","Doctor","Key word Doctor");
            //3.click on search icon
            ReusableActions.clickAction(driver,"//*[@id='search__button-desktop']","click on search icon");
            //4.Capture result
            String result=ReusableActions.getTextAction(driver,"//*[@id='search-results-count__header']","Capture result");
            String[] ResultSplit=result.split(" ");
            System.out.println("search result for Doctor is" + " " + ResultSplit[2]);

        }// End of test case 4
  public static void scrollByView(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;

            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));

            jse.executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (Exception e) {
            System.out.println("unable to scroll : " + elementName + "for reason" + e);
        }//end of catch
    }//end of scrollByView




    }// end of main class
*/


}