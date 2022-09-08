package methods;

public class NumsContain {
    public static void main(String[] args) {


        System.out.println(nums(new int[]{ 1,2,3,4}, (7)));

    }
    public static boolean nums (int [] arr , int number){

         for(int each : arr){
             if(each == number){
                 return true;
             }
         }

        return false;
    }
}
