package Class19Java;

class Vehicle {
    int noOfWheel;
    int topSpeed;
    public void printTopSpeed(){
        System.out.println(topSpeed);
    }
}

public class Car extends Vehicle {
    String model;
    String make;
    int year;
}

class Tesla extends Car {
    void printInfo(){
        System.out.println("I am a Electrical car");
    }
}

class Toyota extends Car{

}
/*class CustomClass extends Toyota,Tesla{
    not allowed in java because of dimond problem
}*/
class Tester{
    public static void main(String[] args) {
        Toyota toyota=new Toyota();
        toyota.printTopSpeed();
    }
}