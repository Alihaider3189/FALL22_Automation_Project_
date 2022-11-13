package DAY2_100222;

import java.util.ArrayList;

public class T2_ARRAYLIST {
            public static void main(String[] args) {
                //choose java.util from library list when you type array list
                //declare and define an array list of countries
                ArrayList<String> countries= new ArrayList<>();

                //now add the values for countries array
                countries.add("USA");
                countries.add("Canada");
                countries.add("Bangladesh");

                //print usa from the countries list
                System.out.println("countries values: "+ countries.get(0));
//get me all the count of countries from arraylist
                System.out.println("countries count: "+ countries.size());
                //call an integer arraylist for street number
                ArrayList<Integer> streetNumber =new ArrayList<>();
                streetNumber.add(225);
                streetNumber.add(335);
                streetNumber.add(445);
                //to print an integer arraylist of streetnnumber
                System.out.println("streetnumber:"+streetNumber.get(0));

//get me all the count of street numbers from array list
                System.out.println("all of the street Numbers are: "+ streetNumber.size());







    }//end of main








}//END OF CLASS
