package class24Java;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //Syntax to create an ArrayList
        ArrayList<String> colors=new ArrayList<>();
        //use add method to insert elements in an arrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Brown");
        //prints all elements
        System.out.println(colors);
        //get method prints individual elements from arrayList
        System.out.println(colors.get(0));
        System.out.println(colors.get(2));
        //size me
        System.out.println(colors.size());

        for(int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }
        System.out.println("*******************");
        for(String color:colors){
            System.out.println(color);
        }









    }


}
