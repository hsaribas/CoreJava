package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day17ArrayLists01 {

    public static void main(String[] args) {
        //Find the closest 2 integers in the given list.
        //[12, 15, 10, 11, 20] ==> 12-11, 10-11
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(10);
        list.add(11);
        list.add(20);

        //Sort the list elements.
        Collections.sort(list);
        System.out.println(list);

        //Select a min difference value.
        int minDiff = list.get(1) - list.get(0);

        //Create a loop to compare all differences.
        for (int i = 2; i < list.size(); i++) {
            minDiff = Math.min(minDiff, list.get(i) - list.get(i - 1));
        }
        System.out.println(minDiff);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) - list.get(i - 1) == minDiff) {
                System.out.println(list.get(i) + " - " + list.get(i - 1));
            }
        }
    }
}