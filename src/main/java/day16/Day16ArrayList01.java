package day16;

import java.util.ArrayList;
import java.util.List;

public class Day16ArrayList01 {
    /*
        1)Arrays are fixed in length which is not good but Lists have flexible length.
        2)Arrays can store just primitives and references but Lists store non-primitives.
        3)Arrays use less memory than Lists.
    */
    public static void main(String[] args) {
        //How to create a List(ArrayList)
        //1st Way: Mostly used
        List<Integer> al = new ArrayList<>();
        //2nd Way:
        ArrayList<Integer> bl = new ArrayList<>();

        //How to print a List on console
        System.out.println(al);//[] ==> empty List

        //How to add elements into a List
        //add() method puts the elements in insertion order.
        al.add(12);
        al.add(21);
        al.add(5);
        System.out.println(al);//[12, 21, 5]

        al.add(2, 99);
        al.add(88);
        System.out.println(al);//[12, 21, 99, 5, 88]

        //How to get the number of elements in a list
        int numOfElements = al.size();//5
        System.out.println("numOfElements: " + numOfElements);

        //How to get a specific element from list by using index
        int el = al.get(1);//21
        System.out.println(el);

        //Create a list and add even integers between 13 and 51 in descending order.
        //Then print the 7th element on the console.
        List<Integer> cl = new ArrayList<>();
        for (int i = 51; i > 12; i--) {
            if (i % 2 == 0) {
                cl.add(i);
            }
        }
        System.out.println("cl: " + cl);
        System.out.println("7th element is: " + cl.get(6));

        //How to remove a specific element
        List<String> dl = new ArrayList<>();
        dl.add("A");
        dl.add("C");
        dl.add("C");
        dl.add("C");
        dl.add("B");
        dl.add("E");
        System.out.println(dl);//[A, C, C, C, B, E]
        dl.remove("C");
        //If you have repeated elements, remove() method removes just the first one.
        System.out.println(dl);//[A, C, C, B, E]

        List<Integer> fl = new ArrayList<>();
        fl.add(12);
        fl.add(21);
        fl.add(32);
        fl.add(45);
        System.out.println(fl);//[12, 21, 32, 45]
        //Remove 21 from the list.
        //1st Way: To remove a specific element, use indexOf() inside the remove()
        fl.remove(fl.indexOf(21));
        System.out.println(fl);//[12, 32, 45]
        //2nd Way:
        fl.remove((Integer) 32);
        System.out.println(fl);//[12, 45]

        //Create a String list add elements into it then remove the elements start with "M" end with "a".
        List<String> gl = new ArrayList<>();
        gl.add("Maria");
        gl.add("Marina");
        gl.add("Cate");
        gl.add("Mehmet");
        gl.add("Carina");
        for (int i = 0; i < gl.size(); i++) {
            String element = gl.get(i);
            if (element.startsWith("M") && gl.get(i).endsWith("a")) {
                gl.remove(i);
                i--;
            }
        }
        System.out.println(gl);
    }
}
