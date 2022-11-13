package Practice;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Practice_01 {
    public static void main(String[] args) throws InterruptedException {
//define String variable
        ArrayList<String> car= new ArrayList<>();
        car.add("toyota");
        car.add("Honda");
        car.add("BMW");
//running for loop
        for(int i=0; i< car.size(); i++  ) {

            System.out.println("My favorite car is " + car.get(i));
            Thread.sleep(1000);
        }//end of for loop



    }//end of main



}//end of jave class
