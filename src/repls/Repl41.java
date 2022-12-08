package repls;
import java.util.Scanner;
public class Repl41 {
    /*   Write a program using the switch statement
Let us consider the scenario regarding the born baby age
First Output: "Enter the age of the Child"
case 1: if age is 1 print as "You can Crawl"
case 2 : if age is 2 print as  "You can Talk"
case 3: If age is 3 print as "You can Dance"
case 4: if age is 4 print as "You can get Trouble"
Other than this age (1-4) it should print "I don't know how old you are"    */

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the age of the Child");
            int age=scanner.nextInt();
            String out;
            switch (age){
                case 1:
                    out="You can Crawl";
                    break;
                case 2:
                    out="You can Talk";
                case 3:
                    out="You can Dance";
                case 4:
                    out="You can get  Trouble";
                default:
                    out="I don't know how old you are";
            }
            System.out.println(out);
        }
    }

