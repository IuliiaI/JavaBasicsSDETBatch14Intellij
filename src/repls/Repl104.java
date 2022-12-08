package repls;
import java.util.Scanner;
public class Repl104 {
    /*
    Create an array of names that will hold 5 String elements.
    Names must be taking from a user.
    Print out the first three characters of each element of the array, one per line.
    Note: every array element must be at least 3 characters long.
    Input Example:
    John
    Jane
    Jimmy
    Mike
    Emily
    Expected Output:
    Joh
    Jan
    Jim
    Mik
    Emi
     */

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String[] arr = new String[5];
            int i;
            for (i = 0; i < arr.length; i++) {
                arr[i] = input.nextLine();
            }
            for (String ar : arr) {
                System.out.println(ar.substring(0, 3));
            }
        }
    }
