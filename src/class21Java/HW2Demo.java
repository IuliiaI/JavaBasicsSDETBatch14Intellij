package class21Java;

public class HW2Demo {
}

class CreditCard1{
    double balance;
    double interest;
    CreditCard1(double balance,double interest){
        this.balance=balance;
        this.interest=interest;
    }

    void calculateInterest(){

        double interestAmount=interest*balance/100;
        System.out.println("Interest Amount "+interestAmount);
    }

}
class Visa1 extends CreditCard1{

    Visa1(double balance,double interest){
        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        double interestAmount=interest*balance/100;
        System.out.println();
        System.out.println("interest Amount "+interestAmount+5);
    }
}

class AX1 extends CreditCard1{

    AX1(double balance,double interest){
        super(balance, interest);
    }

    @Override
    void calculateInterest() {
        double interestAmount=interest*balance/100;
        System.out.println();
        System.out.println("Interest Amount "+interestAmount+10);
    }
}