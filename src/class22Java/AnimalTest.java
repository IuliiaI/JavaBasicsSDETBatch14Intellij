package class22Java;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.sleep();
        cat.eat();

        Animal animal=new Panda();//Upcasting
        //Panda panda=new Animal();//down-casting is not allowed
        Animal animal1=new Cat();
        Animal[] animals={new Cat(),new Panda()};
    }
}
