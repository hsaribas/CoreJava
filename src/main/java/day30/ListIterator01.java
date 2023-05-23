package day30;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator01 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Ayse");
        list.add("Fatma");
        list.add("Hayriye");
        System.out.println("list = " + list);//[Ali, Veli, Ayse, Fatma, Hayriye]

        ListIterator<String> listIte1 = list.listIterator();
        //Add 'X' to all elements.
        while (listIte1.hasNext()) {
            listIte1.set(listIte1.next() + "X");//set() method sets the element pointer returns
        }
        System.out.println(list);//[AliX, VeliX, AyseX, FatmaX, HayriyeX]
    }
}
