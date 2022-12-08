package repls;

public class Repl214 {


}

class SyntaxStudentException extends Throwable {

    public SyntaxStudentException(String s) {
        super(s);
    }
}
class Main {
    public static void gradeCheck(int grade) throws SyntaxStudentException {
        if (grade > 90) {
            throw new SyntaxStudentException("You are an exceptionally awesome student");
        } else {
            System.out.println("You are a great student");
        }
    }

    public static void main(String[] args) {
        try {
            gradeCheck(110);
        } catch (Throwable e) {
            System.out.println(e);
        }
    }
}