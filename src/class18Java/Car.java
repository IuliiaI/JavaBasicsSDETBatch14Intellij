package class18Java;

public class Car{
    //Common class has different names like parent, base or super class
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;
    //if a field or method has private access modifier in parent class then child class cant use it
    private String engineType;

    void printCarDetails(){
        System.out.println("Model "+model+" Make "+make+" Color "+color);
    }
}


class BMW extends Car{
    //Child classes, derived classes
    double engineCC;

}
 class Tesla extends Car{

 }

 class Toyota extends Car{

     double engineCC;

 }
 class CarTester{
     public static void main(String[] args) {
         BMW bmw=new BMW();
         bmw.model="x8";
         bmw.make="BMW";
         bmw.color="white";
         bmw.engineCC=200;
         bmw.printCarDetails();
     }
 }