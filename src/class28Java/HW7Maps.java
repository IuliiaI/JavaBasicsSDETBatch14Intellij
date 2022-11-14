package class28Java;

import java.util.ArrayList;
import java.util.Collection;

public class HW7Maps{
    /*     Create a collection of integers in which you can keep duplicates.
           Write a logic to find sum of all integers    */
    public static void main(String[] args) {

        Collection<Integer> nums=new ArrayList<>();
        nums.add(2500);
        nums.add(2700);
        nums.add(3200);
        nums.add(2000);
        nums.add(2500);
        nums.add(2800);

        int sum=0;

        for(Integer num:nums){
            sum=sum+num;
        }
        System.out.println(sum);

    }
}
