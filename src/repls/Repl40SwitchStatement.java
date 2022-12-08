package repls;
import java.util.Scanner;
public class Repl40SwitchStatement {
    /* By using the switch statement concept please validate what is the responsibility each instructor in the syntax solution.
    First Output: "Enter name of the instructor"
            case 1: if User provided the name as Asghar as input it should show  "Will take care of Java Assignment"
            case 2: if User provided the name as Moazzam as input it should show  "Will take care of SDLC Assignment"
            case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
            case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"
    Other than these four names if the user provides any other names --> " Invalid instructor selected"  */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name of the instructor");
            String name = scanner.next();
            String out;
            switch (name) {
                case "Asghar":
                    out="Will take care of Java Assignment";
                    break;
                case "Moazzam":
                    out="Will take care of SDLC Assignment";
                    break;
                case "Weqas":
                    out="Will take care of Selenium Assignment";
                    break;
                case "Asel":
                    out="Will take care of every Assignment";
                    break;
                default:
                    out="Invalid instructor selected";
            }
            System.out.println(out);
        }
    }

