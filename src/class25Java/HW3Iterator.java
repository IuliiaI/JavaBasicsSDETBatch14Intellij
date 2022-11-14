package class25Java;

import java.util.ArrayList;
import java.util.Iterator;

public class HW3Iterator {
    /*     Create an arrayList of even numbers from 1 to 500.
    Remove any number that is divisible by 5 from that arrayList.
    */
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=2;i<=500;i=+2){
            int num=i+1;
            if(num%2==0){
                numbers.add(num);
            }
        }
        /*
        for(int i=2;i<=500;i=i+2){
        numbers.add(i);
        }
         */
        System.out.println(numbers);

        Iterator<Integer> iterator= numbers.iterator();
        while(iterator.hasNext()){
            int num= iterator.next();
            if(num%5==0){
                iterator.remove();
            }
        }
        System.out.println(numbers);

    }
}
