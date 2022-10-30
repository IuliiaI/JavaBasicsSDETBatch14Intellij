package class24Java;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Tymur");
        names.add("Salma");
        names.add("MJ");
        names.add("Lubo");
        names.add("Josh");
        //names.add(0,"Josh Again");//element is on index place, other elements are shifted but still be in ArrayList
        names.set(2,"Josh Again");//in this case it will be replaced
        System.out.println(names);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(35);
        numbers.add(1,200);
        numbers.set(0,12000);
        System.out.println(numbers);
        numbers.clear();// deletes all the elements from the list
        System.out.println(numbers);




    }
}
