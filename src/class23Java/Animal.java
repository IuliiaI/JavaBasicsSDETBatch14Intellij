package class23Java;

public abstract class Animal {
    abstract void eat();
    abstract void sleep();
    void walk(){
        System.out.println("Animals walk");
    }

    public static void main(String[] args) {
        //Animal animal=new Animal();
        //animal.eat();

    }
}
class Cat extends Animal{
    @Override
    void eat(){
        System.out.println("cats like fish");
    }
    void sleep(){
        System.out.println("Cats like to sleep 12 to 16 hours");
    }
    void showAttitude(){
        System.out.println("hmm hmm hmm hmm");
    }
}
class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Dogs like cheese");
    }
    void sleep(){
        System.out.println("Dogs like to sleep 8 to 10 hours");
    }
}