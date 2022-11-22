package repls;

import java.util.LinkedList;

public class Repl192 {

    //Repl192=Main in actual Repl resourse
        static int num=100;
        public static void printPrimeNumbers(LinkedList arr) {

            for(int i=2; i < num; i++){

                boolean isPrime = true;


                for(int j=2; j < i ; j++){
                    //check to see if the number is prime
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                // add numbers
                if(isPrime) {
                    arr.add(i);
                }

            }}

        public static void main(String[] args) {
            LinkedList<Integer> arr = new LinkedList<>();
            Repl192.printPrimeNumbers(arr);
            System.out.println(arr);


        }}

