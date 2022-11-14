package class28Java;

import java.util.Collection;
import java.util.LinkedHashSet;

public class HW6Maps {
    /*   Create the collection that will store single uniques Objects of a String type in which order is preserved.
         Write a logic to concatenate all string from the collection.      */
    public static void main(String[] args) {

        Collection<String> address=new LinkedHashSet<>();

        address.add("1316 Hollyvud Avenue");
        address.add("Los-Angeles");
        address.add("California");
        address.add("11239");

        for(String data:address){
            System.out.println(data+" ");
        }

    }
}
