package class22Java;

public class Animal {
    void eat(){
        System.out.println("Animals usually eats plants");
    }
    void sleep(){
        System.out.println("Animals sleep for 8 to 10 hours");
    }
}
class Panda extends Animal{
    void eat(){
        System.out.println("Panda eat Bamboos");
    }
    /*
    @Override is an annotation that tells java to check for extra rules like if we are properly overriding method or not
     */
    void sleep(){
        System.out.println("Pandas sleep for 14 hours");
    }
}
class Cat extends Animal{
    @Override
    void eat(){
        System.out.println("Cats like to eat Fish");
    }
}