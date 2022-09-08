package ArraylistPractices;

public class Task1 {
    public static void main(String[] args) {
        String name = "racecar";
        String reverse = "";
        for (int i = name.length()-1; i >= 0 ; i--) {
            reverse += name.charAt(i);
        }
        if(reverse.equals(name)){
            System.out.println("Palindrom");
        }else{
            System.out.println("nothing");
        }
    }
}
