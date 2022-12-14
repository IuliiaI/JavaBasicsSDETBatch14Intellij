package repls;
import java.util.Scanner;
public class Repl35LogicalOperators {
    /*   Create a program that prompt user with question: "Do you need a loan?"(Use a boolean)
    If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"
    Based on the score define users eligibility:
            if score is below 600 --> eligibility = "Not eligible"
            if score is between 600 and 700 inclusive --> eligibility = "Maybe eligible"
            if score is between 701 and 800 inclusive --> eligibility = "Eligible"
            if score is higher than any other previous values --> eligibility = "Definitely eligible" .
    Output:
    The eligibility is ____    */

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Do you need a loan?");
            boolean isLoanRequired=scanner.nextBoolean();
            int creditScore;
            String out;
            if(isLoanRequired){
                System.out.println("What is your credit score?");
                creditScore=scanner.nextInt();
                if(creditScore<600){
                    out="The eligibility is Not eligible";
                }else if(creditScore<=700){
                    out="The eligibility is Maybe eligible";
                }else if(creditScore<=800){
                    out="The eligibility is Eligible";
                }else {
                    out="The eligibility is Definitely eligible";
                }
            }else {
                out="Unknown";
            }
            System.out.println(out);
        }
    }

