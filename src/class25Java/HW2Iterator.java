package class25Java;

import java.util.ArrayList;
import java.util.Iterator;

public class HW2Iterator {
    /*    Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.    */
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("Cocoa");
        drinks.add("Hot Chocolate");
        drinks.add("Juice");
        drinks.add("Soda");

        Iterator<String> iterator=drinks.iterator();

        while(iterator.hasNext()){
            String drink= iterator.next();
            if(drink.contains("a")||drink.contains("e")){
                drinks.set(drinks.indexOf(drink),"water");
            }
        }
        System.out.println(drinks);

    }
}
