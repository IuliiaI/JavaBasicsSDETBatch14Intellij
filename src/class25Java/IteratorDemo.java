package class25Java;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Primer");
        beautyProducts.add("Shampoo");
        beautyProducts.add("Lotion");
        beautyProducts.add("Concealer");
        beautyProducts.add("EyeLinear");
        //get the iterator from the list
        Iterator<String> iterator=beautyProducts.iterator();
        /*System.out.println(iterator.hasNext());//we have one item//hasNext says us if there is any element left
        System.out.println(iterator.next());//it gives us the item and also removes the items from iterator
        System.out.println(iterator.hasNext());

        iterator.next();
        iterator.next();
        System.out.println(iterator.next());*/

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}