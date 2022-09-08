package methods;

public class sum {
    public static void main(String[] args) {

        int [] arr = {1,3,7,8};

        System.out.println(number(arr));

    }

    public static int number(int [] nums ){

       // int [] arr = {2,2,4};
        int sum = 0;
       for(int i = 0; i < nums.length;i++){
           sum += nums[i];
       }
       return sum;
    }


}
