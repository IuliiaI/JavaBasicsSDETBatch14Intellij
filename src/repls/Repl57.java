package repls;

public class Repl57 {
    /* Create a for loop that prints out odd numbers from 5 to 22
    Must not include the number 22 in the output
    Expected Output:

            5
            7
            9
            11
            13
            15
            17
            19
            21  */
    public static void main (String[] args) {

        for(int num=5; num<22; num++) {
            if(num%2!=0) {
                System.out.println(num);
            }
        }

    }
}
