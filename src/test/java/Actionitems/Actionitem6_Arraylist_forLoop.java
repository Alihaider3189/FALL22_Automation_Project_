package Actionitems;

import java.util.ArrayList;

public class Actionitem6_Arraylist_forLoop {
    public static void main(String[] args) {

        //declare and define String array list of countries
        ArrayList<String> countries= new ArrayList<>();

        countries.add("USA");
        countries.add("Mexico");
        countries.add("Jamaica");
        countries.add("Peru");

    //declare and define integer Array list for country code
    ArrayList<Integer> countryCode= new ArrayList<>();
    countryCode.add(+1);
    countryCode.add(+52);
    countryCode.add(+53);
    countryCode.add(+56);
       // System.out.println(countryCode.get(1));

    //call forloop to print countries and countrycode from Array lists
        for (int i = 0; i <countryCode.size() ; i++) {
            System.out.println("My country is "+countries.get(i)+ " and my country code is "+countryCode.get(i));
        }//end of for loop
    }//end of main
}//end of java class

