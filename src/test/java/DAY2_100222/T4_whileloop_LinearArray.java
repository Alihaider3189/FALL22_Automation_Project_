package DAY2_100222;

public class T4_whileloop_LinearArray {

    public static void main(String[] args) {


//you can also you Arraylist for while loop as well
        //declare and define linear array for zipcode
        int[] streetNumber= new int[]{111,333,444,555,666};

//iterate through all street number by while loop
//set the initializer
int i= 0;

//now set the condition for while loop
//linear array gets the count by using .length command
while(i < streetNumber.length) {
    System.out.println("street Number: "+ streetNumber[i]);
//incrementation goes at the end of the while loop
i++;
}//end of while loop




    }//end of main method




}//end of Java class

