package class14Java;

import java.util.Scanner;

public class HWTask1 {
    /*
    Create a method that will take 2 parameters as a numbers and prints which number is larger
     */
    void printLarger(int num1, int num2) {
        if(num1>num2){
            System.out.println("Number "+num1+" is more than "+num2);
        }else if(num2>num1){
            System.out.println("Number "+num2+" is more than "+num1);
        }else{
            System.out.println("Numbers are equal");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int number1=scanner.nextInt();
        System.out.println("Please enter the second number");
        int number2=scanner.nextInt();

        HWTask1 compare = new HWTask1();
        compare.printLarger(number1, number2);
        compare.printLarger(67, 98);


    }


}
