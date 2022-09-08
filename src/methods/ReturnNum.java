package methods;

import java.util.Enumeration;
import java.util.Scanner;

public class ReturnNum {
    public static void main(String[] args) {

        System.out.println(numsToWord(2));
        //System.out.println(numsToWord(6));



    }

    public static String numsToWord(int num) {

        if (num < 1 && num > 5) {
            System.out.println("invalid number");
        }

        String[] arr = {"one", "two", "three", "four", "five"};

        return arr[num-1];


    }

}
