package repls;
import java.util.Scanner;
public class Repl36 {
    /* Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"
    and make the comparisons:
            if int1 and int2 are equal and word1 and word2 are equal, output "AND"
            if int1 and int2 are equal or word1 and word2 are equal, output "OR"
            if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"
            **Example input/output:**
    word1: banana
    word2: banana
    int1: 2
    int2: 2
    Output: AND
    word1: banana
    word2: apple
    int1: 2
    int2: 2
    Output: OR

    word1: phone
    word2: pie
    int1: 2
    int2: 3
    Output: NONE   */
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter two strings");
            String string1=scanner.next();
            String string2=scanner.next();
            System.out.println("Please enter two numbers");
            int number1=scanner.nextInt();
            int number2=scanner.nextInt();
            String out;
            if(string1.equals(string2)&&number1==number2){
                out="AND";
            }else if(string1.equals(string2) || number1==number2){
                out="OR";
            }else {
                out="NONE";
            }
            System.out.println(out);
        }
    }


