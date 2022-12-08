package repls;

public class Repl86ClassAndObject {
    /*
Create a class 'Main' (please do not make it public as Repl will give you an error)
Inside class declare a String variable 'name' and integer variable 'roll_no'.
Create an object of the class and assign the value of 2 to roll_no and value of
"John" to name
Your program should print the following:
Name is John and roll number is 2
 */
        String name;
        int roll_no;
        public static void main(String[] args) {
            Repl86ClassAndObject m = new Repl86ClassAndObject();
            m.roll_no = 2;
            m.name = "John";
            System.out.print("Name is " + m.name + " and roll number is " + m.roll_no);
        }
    }

