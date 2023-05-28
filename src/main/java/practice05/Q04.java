package practice05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q04 {
    /*
        Create a method that converts a multidimensional array into a single-dimensional array and puts it
        into a list then print elements in alphabetical order.
        Ex: Input: {{Ali, Veli, Ayse},{Hasan, Can},{Suzan}}
            Output: [Ali, Ayse, Can, Hasan, Suzan, Veli]
    */
    public static void main(String[] args) {
        String[][] arr = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};
        System.out.println(newList(arr));
    }

    public static List<String> newList(String[][] mda) {
        List<String> list = new ArrayList<>();

        for (String[] w : mda) {
            Collections.addAll(list, w);
        }
        Collections.sort(list);

        return list;
    }
}
