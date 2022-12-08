package repls;
import java.util.Scanner;
public class Repl39 {
    /*  A school has following rules for grading system:
    a. 1 to 25 - F b. 25 to 45 - E c. 45 to 50 - D d. 50 to 60 - C e. 60 to 80 - B f. Above 80 - A
    Ask the user to enter marks and print the corresponding grade.
    Example Output:
    Please enter your mark
    Your grade is A

    Example Output:
    Please enter your mark
    Please enter valid mark   */
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter your mark");
            int marks = scanner.nextInt();
            String out;
            if(marks>=1 && marks<=25){
                out="Your grade is F";
            }else if(marks>25 && marks<=45){
                out="Your grade is E";
            }else if(marks>45 && marks<=50){
                out="Your grade is D";
            }else if(marks>50 && marks<=60){
                out="Your grade is C";
            }else if(marks>60 && marks<=80){
                out="Your grade is B";
            }else if(marks>80 &&marks<=100){
                out="Your grade is A";
            }else {
                out="Please enter valid mark";
            }
            System.out.println(out);
        }
    }

