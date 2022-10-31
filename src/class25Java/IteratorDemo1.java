package class25Java;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
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

        Iterator<String> iterator=beautyProducts.iterator();

        while(iterator.hasNext()){
            String item= iterator.next();//it is better to store item in a variable and then use it with next() method
            if(item.endsWith("r")){
                iterator.remove();
            }
        }
        System.out.println(beautyProducts);
    }
}