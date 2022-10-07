package reviewJavaClass06;

public class Shelter {
    public static void main(String[] args) {
//  accessing static-use class name
        Dog.breed="Huskey";

        Dog dog1=new Dog();
        //how to access instance variables -only through objects of the class
        dog1.name="Bobby";
        dog1.weight=5;
        dog1.printInfo();

        Dog dog2=new Dog();
        System.out.println(dog2.name);
        dog2.name="Tommy";
        dog2.weight=10;
        System.out.println(dog2.name);
        dog2.printInfo();
        System.out.println("Making changes................");
        dog1.name="Bobik";
        dog1.breed="german";//all objects will have breed german then as breed is static

        dog1.printInfo();
        dog2.printInfo();

        double price=dog1.getPrice();
        System.out.println(price);

        float price2=dog2.getPrice();
        System.out.println(price2);

        System.out.println(dog1.bark());
        System.out.println(dog2.bark());

        dog1.love("to jump");
        dog2.love("to play");
    }
}
