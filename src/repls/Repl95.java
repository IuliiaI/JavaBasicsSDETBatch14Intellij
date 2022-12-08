package repls;
import java.util.Scanner;
public class Repl95 {

    /*
    Using Scanner class input string value.
    Print out the following: "The first 3 letters of ___ is ___"
    For example, if the input is "banana", your output should be: "The first 3 letters
    of banana is ban".
     */

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String value = scan.nextLine();
            String letters = value.substring(0, 3);
            System.out.println("The first 3 letters of " + value + " is " + letters);
        }
    }

