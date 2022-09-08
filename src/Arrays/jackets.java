package Arrays;

import java.util.Scanner;

public class jackets {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your items");
//        int item = input.nextInt();


        String [] items = {"shoes", "jackets", "iphone", "Ipads", "shirt"};

        for(int i = 0 ; i < items.length;i++){
            if(items[i].equalsIgnoreCase("jackets")){
                System.out.println(items[i]);
                break;
            }


        }

    }
}
