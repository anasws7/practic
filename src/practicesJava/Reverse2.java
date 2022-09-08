package practicesJava;

public class Reverse2 {
    public static String ReverseStrange (String str) {

        String reverse ="";

        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i)+ reverse;
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println(ReverseStrange("Anas"));
    }
}

