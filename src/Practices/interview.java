package Practices;

public class interview {
    public static void main(String[] args) {
        String word = "silent";
        String reverse = "";
        for (int i = word.length()-1 ; i >= 0 ; i--) {
            reverse += word.charAt(i);
        }
        System.out.println(reverse);

        if(word.equals(reverse)){
            System.out.println("Palindrom");
            }else{
            System.out.println("Not palindrom ");
        }
    }
}
