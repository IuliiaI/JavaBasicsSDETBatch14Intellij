package class21Java;
public class HW1 {
    /*Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
    Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
    Call the method by creating an object of each of the three classes. */
    public static void main(String[] args) {
        new Degree().getPrerequisite();
        new Bachelor().getPrerequisite();
        new Master().getPrerequisite();
    }
}
class Degree{
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelor extends Degree{

}
class Master extends Degree{
    void getPrerequisite(){
        System.out.println("To get a Master diploma you need Bachelor diploma");
    }
}