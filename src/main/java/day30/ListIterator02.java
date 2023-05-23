package day30;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator02 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Ayse");
        list.add("Fatma");
        list.add("Hayriye");
        System.out.println("list = " + list);//[Ali, Veli, Ayse, Fatma, Hayriye]

        //Print all elements in reverse order by using iterator.
        ListIterator<String> listIte1 = list.listIterator();
        while (listIte1.hasNext()) {
            listIte1.next();
        }

        while (listIte1.hasPrevious()) {
            System.out.print(listIte1.previous() + " ");//previous() => Returns the previous element in the list and moves the pointer position backwards.
        }

        System.out.println();

        //Add elements into list by using listIterator.
        System.out.println("list = " + list);//[Ali, Veli, Ayse, Fatma, Hayriye]

        while (listIte1.hasNext()) {
            listIte1.next();
        }

        listIte1.add("Can");
        listIte1.add("Hasan");

        System.out.println(list);//[Ali, Veli, Ayse, Fatma, Hayriye, Can, Hasan]
    }
}
