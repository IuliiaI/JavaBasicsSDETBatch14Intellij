package class24Java;
import java.util.ArrayList;

public class HWCollections {
    /*        Create an ArrayList that will store 5 names into it.
     Find out whether the given ArrayList is empty or not?
     Check whether the specific name is present in an ArrayList or not?
     Find the size of your arrayList and print all values from that        */
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Pall");
        names.add("Sara");
        names.add("Mickle");
        names.add("Tiffany");
        names.add("Kevin");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Mickle"));
        System.out.println(names.size());
        System.out.println(names);

        /*  for(int i=0;i< names.size();i++){
            System.out.println(names.get(i));
        }   */
        /*  for(String name:names){
            System.out.println(name);
        }   */

    }
}
