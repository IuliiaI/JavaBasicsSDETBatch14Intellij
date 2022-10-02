package class15Java;

public class Dog {
    String name; //instance
    String color;
    static int noOfLegs=4;//static

    void bark(){
        int i=10;//local
        for (int j=0;j<i;j++ ) {
            //int j is also a local variable
            System.out.println("Barking...");
        }
    }

    void printInfo(){
        System.out.println("name "+name+" color"+color);
    }

    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="Tomy";
        dog1.bark();

        Dog dog2=new Dog();
        dog2.name="Lucky";

    }
}
