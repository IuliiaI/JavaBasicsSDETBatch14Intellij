package class25Java;

import java.util.ArrayList;

public class IteratorDemo4WithLambda {
    public static void main(String[] args) {
        //delete all the products which start with letter B or ends with letter a
        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove Soap");

        //we dont use an iterator in the case of use Lambda / it is Java 8 feature
        beautyProducts.removeIf(item -> item.startsWith("B"));
        System.out.println(beautyProducts);
    }
}
