package class21Java;
public class HW2 {
    /*   Create a class CreditCard and define variable balance and interest.  Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest. Call the method by creating an object of each of the three classes.     */
    public static void main(String[] args) {
        System.out.println(new CreditCard().calculateInterest(300));
        System.out.println(new Visa().calculateInterest(500));
        System.out.println(new AX().calculateInterest(1000));
    }
}
class CreditCard{
    double balance;
    double interest;
    double calculateInterest(double balance){
        return balance*2.5/100;
    }
}
class Visa extends CreditCard{

}
class AX extends CreditCard{
    double calculateInterest(double balance){
        return balance*3.5/100;
    }
}