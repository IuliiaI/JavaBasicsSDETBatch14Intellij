package class28Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HW5Maps {
    /*      Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
    John Smith=$100000    */
    public static void main(String[] args) {
        HashMap<String,Integer> data=new HashMap<>();
        data.put("Georg Miru",85000);
        data.put("Anna Ricci",90000);
        data.put("John Smith",100000);
        data.put("Helen Parker",68000);
        data.put("Erica Swan",96000);

        Set<Integer> salaries=new TreeSet<>(data.values());
        System.out.println(salaries);

        Iterator<Integer> iterator=data.values().iterator();
        while(iterator.hasNext()){
           Integer salary =iterator.next();
           if(salary<100000){
               iterator.remove();
           }
        }
        System.out.println(data);

    }
}
