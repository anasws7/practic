package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Friendslist {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your fiends");
        int friends = input.nextInt();

        String [] friendsNames = new String[friends];

        for(int i = 0; i < friends; i++){
            friendsNames[i] = input.next();
        }
        System.out.println(Arrays.toString(friendsNames));



    }






}
