package class26Java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TypesOfSets {
    public static void main(String[] args) {
        //there are three types of sets
        /*
        HassSet
        DownSide: it does not care about the insertion order
        Upside: it is fastest type of Set when it comes to retrieving data
         */
        HashSet<String> letters=new HashSet<>();
        letters.add("Mango");
        letters.add("Apple");
        letters.add("Kiwi");
        letters.add("Orange");
        letters.add("Banana");
        System.out.println("HashSet");
        System.out.println(letters);
//when ever you need insertion order, insertion speed is same as HashSet but retrieval speed is the worst
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");
        System.out.println("LinkedHashSet");
        System.out.println(linkedHashSet);
//when ever you need to sort elements
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Mango");
        treeSet.add("Apple");
        treeSet.add("Kiwi");
        treeSet.add("Orange");
        treeSet.add("Banana");
        System.out.println("TreeSet");
        System.out.println(treeSet);

    }
}
