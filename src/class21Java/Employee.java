package class21Java;
public class Employee {
String name;
double baseSalary=40000;
double bonus=20000;
    void calculateSalary(){
        System.out.println(baseSalary+bonus);
    }
}
class Developer extends Employee{
    void calculateSalary(){
        System.out.println(2*baseSalary+(1.5*bonus));
    }
    void test(){           //to call all methods from one class
        super.calculateSalary();
        calculateSalary();
    }
}
class Tester extends Employee{
    void calculateSalary(){
        System.out.println(baseSalary+(2*bonus));
    }
}
class OfficeBoy extends Employee{

}


class Test{
    public static void main(String[] args) {
        Developer developer=new Developer();
        developer.test();
    }
}