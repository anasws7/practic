package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SameLetters {

    /*
    String - Same letters
    Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:
     */

    public static boolean sameLetters(String word1 , String word2 ){

        char [] words1 = word1.toCharArray();
        char [] words2 = word2.toCharArray();

        Arrays.sort(words1);
        Arrays.sort(words2);

        return Arrays.equals(words1,words2);

    }

    public static void main(String[] args) {
      //sameLetters("anas","Vugar");

        System.out.println(sameLetters("anas","sanaa"));
    }
}
