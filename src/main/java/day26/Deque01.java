package day26;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.add("Aa");
        deque.add("Bb");
        deque.add("Cc");

        //Removes and returns the first element of this deque.
        System.out.println(deque.pop());//Aa
        System.out.println(deque);//[Bb, Cc]
    }
}
