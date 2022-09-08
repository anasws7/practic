package Arrays;

public class MaxAndMin {
    public static void main(String[] args) {

        int [] nums = {500, 120, -80, 90, 250, -10};

        int max = nums[0];
        int min = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]){
               max = nums[i];
            }else if(min > nums[i]){
               min = nums[i];
            }
        }
        System.out.println(max);
        System.out.println(min);


    }
}
