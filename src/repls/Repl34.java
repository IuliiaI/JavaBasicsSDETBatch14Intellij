package repls;
import java.util.Scanner;
public class Repl34 {
    /*  Write a program to find the largest number among three distinct numbers using nested if condition
    Please use Scanner class to take input from users
    Expected Output:
    Please enter 3 distinct numbers 4 5  and 14
    The largest number is 14  */

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter 3 distinct numbers");
            int num1=scanner.nextInt();
            int num2=scanner.nextInt();
            int num3=scanner.nextInt();
            if(num1>num2){
                if(num1>num3){
                    System.out.println("The largest number is "+num1);
                }else {
                    System.out.println("The largest number is "+num3);
                }
            }else {
                if(num2>num3){
                    System.out.println("The largest number is "+num2);
                }else {
                    System.out.println("The largest number is "+num3);
                }
            }
        }
    }


