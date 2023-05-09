package day17;

import java.util.Arrays;
import java.util.List;

public class Day17ArrayLists02 {
    /*
        From a given list find all pairs whose sum is a given number;
        {4, 6, 5, -10, 8, 5, 20} ==> 10
        For example;  4+6=10, 5+5=10, -10+20=10
    */
    public static void main(String[] args) {
        //To create a List, following syntax can be used but if you create the List by using following syntax,
        // you cannot use List methods change the size.
        List<Integer> list = Arrays.asList(4, 6, 5, -10, 8, 5, 20);

        //list.add(222);//UnsupportedOperationException
        //list.clear();//UnsupportedOperationException
        //list.remove((Integer)5);//UnsupportedOperationException

        for (int i = 0; i < list.size(); i++) {
            for (int k = i + 1; k < list.size(); k++) {
                if (list.get(i) + list.get(k) == 10) {
                    System.out.println(list.get(i) + " and " + list.get(k));
                }
            }
        }
    }
}
