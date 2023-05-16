package day25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");

        //Adding operation in Linked List.
        linked.add("A");
        linked.add("C");
        linked.add(0, "AliCan");
        linked.addAll(list);
        linked.addAll(1, list);
        linked.addFirst("K");
        linked.addLast("li");
        System.out.println("Before removing: " + linked);

        //Removing operation in Linked List.
        System.out.println(linked.remove());//Removes the first node, returns it to you.
        System.out.println(linked.remove("X"));//Removes the first occurrence of the specified element from the list. It will return boolean.
        System.out.println(linked.remove(3));//Removes the element at the specified position in this list. It will return removed element.
        //linked.removeAll(list);//Removes all of this collection's elements that are also contained in the specified collection (optional operation).
        //linked.removeIf(t->t.length()<3);
        //linked.clear();

        System.out.println(linked.element());//Retrieves, but does not remove, the head (first element) of this list. ==> copy + paste
        //Throws -> NoSuchElementException - if this list is empty.

        System.out.println(linked.peek());//Retrieves, but does not remove, the head (first element) of this list. ==> copy + paste
        //Gives null if this list is empty.

        System.out.println(linked.poll());//Retrieves and removes the head (first element) of this list. ==> cut + paste
        //Returns null if this list is empty.

        System.out.println("After removing: " + linked);
    }
}
