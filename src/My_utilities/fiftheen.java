package My_utilities;

public class fiftheen {
    public static int action(int i) {
        return i * 2;
    }
    public static void main(String [] args) {
        int total = 0;
        total = action(true);
        total += action(6);
        total += action("false");
        total += action ("four");
        System.out.print(total);
    }
        public static int action(String s){
            return s.length();
        }
            public static int action (boolean b) {
                if(!b) {
                    return 5;
                }else {
                    return 10;
                }
}
}
