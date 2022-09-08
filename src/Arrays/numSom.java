package Arrays;

public class numSom {
    public static void main(String[] args) {


        int [] nums = { 1, 2, 3, 4, 5, 6, 7};

        /*
        req:

        sum : 9
        Print those numbers

         */

        int sum = 9;
        for (int i = 0; i < nums.length; i++) {
            for(int k = 0 ; k < nums.length; k++)
            if(nums[i] + nums[k] ==sum ){
                System.out.println(nums[i] + " + " + nums[k] + " = " + sum);
            }

        }

    }
}
