package practicesJava;

public class ReverseNum {
    public static void main(String[] args) {

        int num = 1234567;
//        int reverse = 0;




//        StringBuffer str = new StringBuffer(String.valueOf(num));
//
//        str.reverse();
//        System.out.println(str);




//        while(num != 0){
////            int i = num % 10;
//            reverse = reverse *  10 + num % 10;
//            num /= 10;
//        }
//        System.out.println("the reverse number is :" + reverse);


        StringBuilder str = new StringBuilder();
        str.append(num);

        str.reverse();

        System.out.println(str);




    }
}
