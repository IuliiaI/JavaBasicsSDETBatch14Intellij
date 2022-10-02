package class13Part2Java;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        /*
        How would you check if String is palindrome or not? aba=> true
        Abbc =>false
        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the word");
        String word=scanner.next();
        String reverseWord = "";


        for(int i=word.length()-1;i>=0;i--) {

            reverseWord=reverseWord+word.charAt(i);

        }
        System.out.println(reverseWord);
        if(reverseWord.equals(word)) {
            System.out.println(word+" is palindrome");
        }else {
            System.out.println(word+" is not palindrome");
        }








    }
}
