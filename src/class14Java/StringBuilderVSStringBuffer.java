package class14Java;

import java.util.Arrays;

public class StringBuilderVSStringBuffer {
    public static void main(String[] args) {
        //Mostly used class newer better faster
        StringBuilder stringBuilder=new StringBuilder("Today is java class");
        // older one slow and not used mostly
        StringBuffer stringBuffer=new StringBuffer("Today is java class");

        String str="Java is very easy";
        /*
        If we want to convert the String to a StringBuilder we can use below Syntax

         */
        StringBuilder stringBuilder1=new StringBuilder(str);
        System.out.println("stringBuilder1 = " + stringBuilder1);
        /*
         If we want to convert the StringBuilder to a String we can use below Syntax
         */
        String newStr=stringBuilder1.toString();






    }
}
