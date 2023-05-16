package day26;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    /*
        1) HashMap is "not-thread safe".
        2) HashMap is "non-synchronized".
        3) HashMap does not put "entries" in any order.
        4) We can use a single "null" in key part.
        5) We can use multiple "null" in values part.
    */
    public static void main(String[] args) {
        HashMap<String, Integer> hMap = new HashMap<>();
        hMap.put("Tom Hanks", 13);
        hMap.put("Brad Pitt", 24);
        hMap.put("Angelina Julie", 46);
        hMap.put("Cuneyt Arkin", 85);
        hMap.put("Alex Alex", 33);
        System.out.println(hMap);//{Tom Hanks=13, Brad Pitt=24, Cuneyt Arkin=85, Angelina Julie=46, Alex Alex=33}

        //How to work with "key"s?
        //Example 1: How many letters were used in all names?
        Set<String> keys = hMap.keySet();
        int totalNumOfLetters = 0;
        //[Tom Hanks, Brad Pitt, Cuneyt Arkin, Angelina Julie, Alex Alex]
        for (String w : keys) {
            totalNumOfLetters = totalNumOfLetters + w.replaceAll("[^a-zA-Z]", "").length();
        }
        System.out.println(totalNumOfLetters);

        //How to work with "value"s?
        //Example 2: Find the average age of the students.
        Collection<Integer> values = hMap.values();
        double sum = 0;
        //[13, 24, 85, 46, 33]
        for (Integer w : values) {
            sum = sum + w;
        }
        double avg = sum / values.size();
        System.out.println(avg);

        //How to get a specific value?
        Integer age1 = hMap.get("Cuneyt Arkin");
        System.out.println(age1);//85

        Integer age2 = hMap.getOrDefault("XXX YYYY", 0);
        System.out.println(age2);

        hMap.putIfAbsent("Alex Alex", 99);
        System.out.println(hMap);

        //How to get entries from a Map?
        Set<Map.Entry<String, Integer>> entries = hMap.entrySet();
        System.out.println(entries);//[Tom Hanks=13, Brad Pitt=24, Cuneyt Arkin=85, Angelina Julie=46, Alex Alex=33]

        //Example 3: Get the initials of first 3 entries.
        StringBuilder initials = new StringBuilder();
        int counter = 0;
        for (Map.Entry<String, Integer> w : entries) {
            initials.append(w.getKey().charAt(0));
            counter++;
            if (counter == 3) {
                break;
            }
        }
        System.out.println(initials);

        boolean exist1 = hMap.containsKey("Angelina Jolie");
        System.out.println(exist1);

        boolean exist2 = hMap.containsValue(85);
        System.out.println(exist2);

        //Replace after checking key and value.
        hMap.replace("Cuneyt Arkin", 54, 99);
        System.out.println(hMap);

        //Replace after checking just key.
        hMap.replace("Alex Alex", 44);
        System.out.println(hMap);
    }
}
