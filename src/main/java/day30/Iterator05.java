package day30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator05 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(1);
        list.add(9);
        list.add(8);
        list.add(2);
        System.out.println("list = " + list);//[5, 3, 7, 1, 9, 8, 2]

        //Calculate sum of all elements by using iterator.
        Iterator<Integer> ite1 = list.iterator();
        int sum = 0;
        while (ite1.hasNext()) {
            sum += ite1.next();
        }
        System.out.println("sum = " + sum);
    }
}
