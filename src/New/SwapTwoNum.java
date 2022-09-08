package New;

public class SwapTwoNum {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;

        System.out.println(a + " " + b);


        int temp = a;
         a=b;
         b = temp;

        System.out.println(a + " " + b);

        System.out.println("-----------");
        a += b;

        b=a-b;
        a = a-b;

        System.out.println(a + " " + b);





    }
}
