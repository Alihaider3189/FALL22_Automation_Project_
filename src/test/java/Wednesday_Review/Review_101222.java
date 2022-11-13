package Wednesday_Review;

public class Review_101222 {

    public static void main(String[] args) {
    /*    int a = 5;
        int b = 6;

        if (a > b) {
            System.out.println("option1");
        } else if (b < a) {
            System.out.println("option 2");

        } else if (a == b) {
            System.out.println("option 3");

        } else{
            System.out.println("option 4");
        }
*/

        //Practice with spilt command
        //define automation string variable
//As a professor I woul like to see the 5 only from Action_Item05

        String subject= "Automation_AI5";
//spilt the string
String[] splitMessage= subject.split("_");
//take the second string from the array to grab the number only
String actionItemNumber= splitMessage[1].substring(2);

//to print out the 5 to the console
        System.out.println("the action item number is "+actionItemNumber);

    }//End of main
}