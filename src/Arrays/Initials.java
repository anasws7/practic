package Arrays;

import java.util.Arrays;

public class Initials {
    public static void main(String[] args) {


        String [] arr = {"Anass Zahot", "Amine Bergui", "Kouloud Bergui"};



     for(String name : arr){
         char first = name.charAt(0);
         String last = name.substring(name.indexOf(' ')+1,name.indexOf(' ')+2 );


         System.out.println(first + last);

     }

    }
}
