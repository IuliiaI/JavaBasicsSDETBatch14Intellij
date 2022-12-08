package repls;
import java.util.Scanner;
public class Repl37 {
    /*Take 2 boolean inputs from a user:
            "Are you thirsty?"
            "Are you sleepy?"
    If user is thirsty and not sleepy--> drink=water
    If user is thirsty and sleepy--> drink=coffee
    If user is not thirsty and sleepy --> drink=tea
    Otherwise drink="nothing"
    Output:
    Looks like you need to drink ___    */

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Are you thirsty?");
            boolean isThirsty=scanner.nextBoolean();
            System.out.println("Are you sleepy?");
            boolean isSleepy=scanner.nextBoolean();
            String out;
            if(isThirsty &&!isSleepy){
                out="Looks like you need to drink water";
            }else if(isThirsty){
                out="Looks like you need to drink coffee";
            }else if(isSleepy){
                out="Looks like you need to drink tea";
            }else {
                out="Looks like you need to drink nothing";
            }
            System.out.println(out);
        }
    }

