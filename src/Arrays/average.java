package Arrays;

public class average {
    public static void main(String[] args) {

       int [] arr = {10, 15, 5, 6};

       int total = 0;

       for(int each : arr){
           total += each;
       }
        System.out.println(total/arr.length);

    }
}
