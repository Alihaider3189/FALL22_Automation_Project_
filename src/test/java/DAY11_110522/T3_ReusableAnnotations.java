package DAY11_110522;

import Reusbale_Library.ReusableActions;
import Reusbale_Library.Reusable_AnnotationsTestNG;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T3_ReusableAnnotations extends Reusable_AnnotationsTestNG {
    @Test(dependsOnMethods = "tc001_verifySignedInOptionIsChecked")
    public void tc002_verifySignedInOptionIsUnChecked() {
        //click on check box to uncheck it
        ReusableActions.clickAction(driver, "//*[@class= 'stay-signed-in checkbox-container']", "SignedInCheckBox");
        //we need to verify that signed in option is checked
        boolean isSignInChecked = driver.findElement(By.xpath("//*[@id= 'persistent']")).isSelected();
        System.out.println("The checkbox check condition is: " + isSignInChecked);
    }//end of test 2







}
