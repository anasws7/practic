package methods;

public class even {
    public static void main(String[] args) {
        even(5);
        even(10);
    }
    public static void even(int num ){

        if(num % 2 == 0){
            System.out.println("this is even");

        }else{
            System.out.println("this number is odd");
        }
    }
}
