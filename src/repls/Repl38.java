package repls;
import java.util.Scanner;
public class Repl38 {
   /* Prompt user with a question: "Is it weekend?"
    If it is not a weekend --> subject="manual testing"
    Otherwise --> subject="Java"
    Output:
    Today you will be learning ____   */

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Is it weekend?");
            boolean isWeekend=scanner.nextBoolean();
            String out;
            if(!isWeekend){
                out="Today you will be learning manual testing";
            }else {
                out="Today you will be learning Java";
            }
            System.out.println(out);
        }
    }

