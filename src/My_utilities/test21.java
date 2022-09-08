package My_utilities;

import java.util.ArrayList;

public class test21 {
    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<>() ;
        strs.add("j");
        strs.add("11");
        strs.add("i");
        strs.add("5");
        strs.remove(1);
        strs.add("e");
        strs.add("i");
        strs.remove("i");
        System.out.print(strs);
    }
}
