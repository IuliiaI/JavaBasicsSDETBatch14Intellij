package class28Java;

import java.util.HashMap;

public class HW3Maps {
    /*   Create a map of Best Buy store. Place
         item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
         Retrieve all keys and values from a Best Buy map using EntrySet.    */
    public static void main(String[] args) {
        HashMap<String,String> items=new HashMap<>();
        items.put("7664847","Printer");
        items.put("7879885","TV");
        items.put("4567478","Radio");
        items.put("7567567","CD Player");
        items.put("6769854","Headphones");
        items.put("3445666","Iphone");
        items.put("1234256","Scanner");

        for(var item:items.entrySet()){
            System.out.println(item);
        }
















    }
}
