package class25Java;

import java.util.ArrayList;

public class ContainsAllDemo {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Concealer");
        beautyProducts.add("Mascara");
        beautyProducts.add("EyeLinear");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Shampoo");
        beautyProducts.add("Lotion");

        //System.out.println(beautyProducts.contains("Lipstick"));
        //System.out.println(beautyProducts.contains("Lotion"));

        ArrayList<String> cosmetics = new ArrayList<>();
        cosmetics.add("Dove Soap");
        cosmetics.add("Conditioner");
        cosmetics.add("Shampoo");
        cosmetics.add("Lotion");

        System.out.println(beautyProducts.containsAll(cosmetics));//we do this if the new list was created by somebody
    }
}