package practicesJava;

public class Reverse {
    public static void main(String[] args) {
        String str =  "Cydeo";
        String reverse = "";


        for(int i = 0; i < str.length(); i++){
            reverse = str.charAt(i)+ reverse;
        }
        System.out.println(reverse);
    }
}
