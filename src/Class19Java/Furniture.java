package Class19Java;

public class Furniture {
    String color="green";
}
class Chair extends Furniture{
    String color="red";
    void printColor(){
        String color="black";
        System.out.println(color);//prints the local variable
        System.out.println(this.color);//prints the instance variable from the same class
        System.out.println(super.color);//prints the instance variable from the parent class
    }
}
class TestChair{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}