package class25Java;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {

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
            //beautyProducts.add("EyeLinear");

            Iterator<String> iterator = beautyProducts.iterator();
            // if we call .next() method more than 1 time we could have an error(in case of odd number of elements
            //and we could not have an error in case of even number of elements
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
                System.out.println(iterator.next());

            }
            System.out.println(beautyProducts);
        }
    }
