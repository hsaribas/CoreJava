package day30;

import java.util.ArrayList;
import java.util.List;

public class Iterator01 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(1);
        list.add(9);
        list.add(8);
        list.add(2);
        System.out.println("list = " + list);

        for (Integer w : list) {
            w = w + 3;
            System.out.print(w + " ");
        }

        System.out.println();
        System.out.println(list);

        for (Integer w : list) {
            System.out.println(w + 3 + " ");
        }

        System.out.println(list);
        //With the foreach loop, we can access all elements without using index, but we can not make permanent changes.
    }
}
