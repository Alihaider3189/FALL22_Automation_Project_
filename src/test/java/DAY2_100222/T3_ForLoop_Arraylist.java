package DAY2_100222;

import java.util.ArrayList;

public class T3_ForLoop_Arraylist {
    public static void main(String[] args) {

        //declare and define the arraylist for zipcode
        ArrayList<String> zipcode= new ArrayList<>();
        zipcode.add("10461");
        zipcode.add("10462");
        zipcode.add("10463");
        zipcode.add("10464");

        //call for loop to print zipcode values from the array list
        //if you want to put actual number, input actual number into forloop condition instead of zipcode.size()
        for (int i=0; i < zipcode.size() ; i++) {

            //to print out all the zipcode values automatically using the for loop
            System.out.println("zipcode: "+zipcode.get(i));
        }//end of for loop



    }//end of main method

}//end of java class
