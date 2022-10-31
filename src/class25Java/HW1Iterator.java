package class25Java;

import java.util.ArrayList;
import java.util.Iterator;

public class HW1Iterator {
    /*Create an arrayList of words. Remove every word that ends with “e”.
     */
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Whale");
        words.add("Shark");
        words.add("Dolphin");
        words.add("Walrus");
        words.add("Seal");

        Iterator<String> iterator= words.iterator();

        while(iterator.hasNext()){
            String word= iterator.next();
            if(word.endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(words);

    }
}
