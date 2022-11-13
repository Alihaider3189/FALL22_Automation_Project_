package Actionitems;

public class Actionitem6_LinearArray_WhileLoop {
    public static void main(String[] args) {


//declaring and defining region with linear array
        String[] Region;
    //Defining region values for linear array
Region= new String[] {"Upper","Lower","Eastern","Western"};

//declare and define areacode with linear array
int[] areacode;
areacode= new int[]{10,22,30,44};
 int i =0;
while(i< Region.length) {
    System.out.println("my region is "+Region[i]+ " and my areacode is "+areacode[i]);
    i++;
}//end of while loop
    }//end of main
}//end of java class
