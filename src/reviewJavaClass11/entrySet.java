package reviewJavaClass11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class entrySet {

        public static void main(String args[])
        {
            // create an empty HashMap
            HashMap<Integer,String> hashMap1 = new HashMap<Integer,String>();

            // use put() method to put elements to the HashMap
            hashMap1.put(1,"Element1");
            hashMap1.put(2,"Element2");
            hashMap1.put(3,"Element3");
            hashMap1.put(4,"Element4");
            hashMap1.put(5,"Element5");

            String value=hashMap1.get(5);
            System.out.println(value);

            //get the entrySet of hashMap1
            Set<Map.Entry<Integer,String>> set1 = hashMap1.entrySet();

            //Print the elements of hashMap1
            System.out.println("**Elements of hashMap1**");
            for (Map.Entry<Integer,String> me : set1)
            {
                System.out.print(me.getKey() + ": ");
                System.out.println(me.getValue().toUpperCase());
            }


        }
    }

