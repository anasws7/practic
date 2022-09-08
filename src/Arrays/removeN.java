package Arrays;

public class removeN {
    //return String where every n-th char is removed

    public static void main(String[] args) {
        System.out.println(removeEveryNthChar("Nadir",2));// Ndr
    }

    public static String removeEveryNthChar(String s, int x){

        String result="";

        if(s.isEmpty()){
            return null;
        }

        for (int i = 1; i <= s.length(); i++) {

            if(i%x!=0){
                result+=s.charAt(i-1);
            }
        }
        return result;
    }
}

