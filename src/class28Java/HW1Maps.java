package class28Java;

import java.util.LinkedHashMap;

public class HW1Maps {
    /*Create a map of a building. Store floor number and it is associated company name.
     (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
     Check how many entries you have?
     Update company on a 4th floor
     Remove company on the 7th floor
     Print your map     */
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> building=new LinkedHashMap<>();
        building.put(1, "Google");
        building.put(2, "Google");
        building.put(2, "Syntax");
        building.put(3, "Syntax");
        building.put(4, "Apple");
        building.put(5, "Microsoft");
        building.put(6, "Oracle");
        building.put(7, "IBM");

        System.out.println(building.size());
        building.replace(4,"Samsung");
        System.out.println(building);
        building.remove(7,"IBM");
        System.out.println(building);

    }
}
