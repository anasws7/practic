package ArraylistPractices;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkList {
    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Anas");
        linkedList.add("Amine");
        linkedList.add("Khouloud");
        linkedList.add("Celia");

        System.out.println(linkedList);

        for (String each: linkedList) {
            if (each.equals("Khouloud")){
                System.out.println("Hello " + each);
            }
        }









    }
}
