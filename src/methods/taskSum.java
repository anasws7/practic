package methods;

public class taskSum {


    public static int number (int [] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
         int [] arr = {23,4,5,14,13};
         // int a = arr.length;

        System.out.println("the sum of the number is: "+ number(arr));
    }


}
