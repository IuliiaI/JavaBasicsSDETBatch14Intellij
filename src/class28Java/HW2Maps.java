package class28Java;

import java.util.Iterator;
import java.util.TreeMap;

public class HW2Maps {
    /*     Create a map of countries with its capital that will store countries in alphabetical order.
     Print all keys and values from a country map using for each loop and iterator.
     Print all values(keys and values at the same time) from a country map using for each loop and iterator.      */

    public static void main(String[] args) {
        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("Ukraine","Kiev");
        countries.put("USA","Washington");
        countries.put("Germany","Berlin");
        countries.put("Canada","Ottava");
        countries.put("Australia","Canberra");
        countries.put("China","Peking");
        countries.put("Ireland","Dublin");
        countries.put("Poland","Warsaw");

        System.out.println("*******COUNTRIES******");
        for(var country:countries.keySet()){
            System.out.print(country+" ");
        }
        System.out.println();

        Iterator<String> iterator1=countries.keySet().iterator();
        while(iterator1.hasNext()){
            String country= iterator1.next();
            System.out.print(country+" ");
        }
        System.out.println();

        System.out.println("*******CAPITALS******");
        for(var capital:countries.values()){
            System.out.print(capital+" ");
        }
        System.out.println();

        Iterator<String> iterator2=countries.values().iterator();
        while(iterator2.hasNext()){
            String capital= iterator2.next();
            System.out.print(capital+" ");
        }
        System.out.println();

        for(var countryAndCapital:countries.entrySet()){
            System.out.println(countryAndCapital);
        }
        System.out.println();

        var iterator3=countries.entrySet().iterator();
        while(iterator3.hasNext()){
            var countryAndCapital= iterator3.next();
            var country=countryAndCapital.getKey();

            var capital=countryAndCapital.getValue();
            System.out.println(country+" "+capital);
        }

    }
}
