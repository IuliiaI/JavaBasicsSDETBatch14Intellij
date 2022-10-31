package class24Java;

import java.util.ArrayList;

public class NonGenericCollections {
    public static void main(String[] args) {
        //Non generic way of using collections framework is how your ancestors use to write code before Java
        //1.5 it causes a lot of problems of run time because java doesn't know at compile time what type of data
        //you are storing in this class and because java doesn't know it cant help you to avoid these errors
        ArrayList names=new ArrayList();
        names.add("Anna");
        names.add(10);
        System.out.println(((String)names.get(0)).length());
    }
}
