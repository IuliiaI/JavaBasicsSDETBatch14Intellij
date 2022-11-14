package class25Java;

import java.util.ArrayList;

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

        /* Iterator<String> iterator=drinks.iterator();

        while(iterator.hasNext()){
            String drink= iterator.next();
            if(drink.contains("a")||drink.contains("e")){
                drinks.set(drinks.indexOf(drink),"water"); --> it is too much effort to use method of indexOf with iterator
            }
        }
        System.out.println(drinks);
        ===>>> we dont use the iterator here because the number of elements will not change because we have to replace only
        */

        for (int i=0;i<drinks.size();i++){
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"Water");
            }
        }
        System.out.println(drinks);
    }
}
