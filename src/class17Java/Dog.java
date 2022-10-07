package class17Java;

public class Dog {
    private String name;
    private String breed;
    private String color;
    private int age;
    private double weight;

    Dog(String dogName,String dogBreed,String dogColor,int dogAge,double dogWeight) {
        name = dogName;
        breed = dogBreed;
        color = dogColor;
        age = dogAge;
        weight = dogWeight;
    }

    void printInfo(){
        System.out.println("name "+name+" "+" breed "+" "+" age "+age);
    }

    public static void main(String[] args) {
        /*Dog dog=new Dog();
        dog.name="Tomy";
        dog.breed="huskey";
        dog.color="Pink";
        dog.age=10;
        dog.weight=30;
        dog.printInfo();*/

        Dog dog=new Dog("Tomy","Huskey", "Pink",10,30);
        dog.printInfo();


        /*Dog dog2=new Dog();
        dog2.name="Cmi";
        dog2.breed="German";
        dog2.color="Green";
        dog2.age=12;
        dog2.weight=30;
        dog2.printInfo();*/

        Dog dog2=new Dog("Cmi","German", "Green",12,30);
        dog2.printInfo();
    }
}
