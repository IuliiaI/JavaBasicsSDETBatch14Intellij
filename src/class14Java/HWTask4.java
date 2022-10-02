package class14Java;

import java.util.Scanner;

public class HWTask4 {
    /*
    Create a method that will say Hello in different language based on the country
    that will pass when method is executed
     */

    void sayHello(String country) {

        switch (country) {
            case "USA":
                System.out.println("Hello");
                break;
            case "India":
                System.out.println("Namaste");
                break;
            case "Turkiye":
                System.out.println("Merhaba");
                break;
            case "Japan":
                System.out.println("Nihau");
                break;
            default:
                System.out.println("Country not supported");
        }

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter number of countries");
        int number=scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<number;i++){
            System.out.println("Please enter the name of country");
            String countries=scanner.nextLine();

            System.out.println("Please enter Hello on the language of this country");
            String helloInLanguage=scanner.nextLine();
            System.out.println("Hello in "+country+" is said as "+helloInLanguage);
        }
    }

    public static void main(String[] args) {
        HWTask4 greeting=new HWTask4();
        greeting.sayHello("Japan");
        greeting.sayHello("India");
    }
}
