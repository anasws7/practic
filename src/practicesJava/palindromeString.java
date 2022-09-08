package practicesJava;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {

        String str = "Anas";
       // String orgStr = str;
        String rev = "";

        int len = str.length();

        for (int i = len; i <= 0 ; i--) {
            rev += str.charAt(i);
        }
        System.out.println(rev);

        if(str.equals(rev)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }

        }

    }
