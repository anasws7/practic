package Arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month");
        int monthNum = input.nextInt();
        String  [] monthsName = {" January", "February", "March","April",  "May","June",  "july", "August", "September", "October", "November", "December"};

        System.out.println(monthsName[monthNum-1]);
    }
}
