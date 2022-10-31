package class25Java;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {

        int num=10;
        //boxing or manual conversion from primitive to wrapper type
        //Integer wrapperNum=Integer.valueOf(num);

        //AutoBoxing or automatic conversion of a primitive to a wrapper type
        Integer wrapperNum=num;
        System.out.println(wrapperNum);
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        //unboxing converting a wrapper type to a corresponding primitive type
        //int num2=wrapperNum.intValue(); manual unboxing

        //Auto unboxing or automatic conversion of a wrapper to primitive type
        int num2=wrapperNum;
    }
}
