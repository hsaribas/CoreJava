package practice06;

import java.util.Arrays;
import java.util.List;

public class Q05 {
    /*
        If the list has 15 as element, change all 15s to 51.
        Ex: (12, 11, 15, 34, 43) ==> Output: (12, 11, 51, 34, 43)
    */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 11, 15, 34, 43);
        System.out.println(list);

        if (list.contains(15)) {
            for (int w : list) {
                if (w == 15) {
                    list.set(list.indexOf(15), 51);
                }
            }
        } else {
            System.out.println("List doesn't contain the expected element");
        }
        System.out.println(list);
    }
}
