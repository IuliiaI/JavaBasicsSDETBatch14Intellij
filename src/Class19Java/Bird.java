package Class19Java;
public class Bird {
    String name;
    String color;
    int age;
    double weight;
    Bird (String name,String color, int age, double weight){
        this.name=name;
        this.color=color;
        this.weight=weight;
        this.age=age;
    }
    void printInfo(){
        System.out.println("Name "+name+" Color "+color+" Age "+age+" Weight "+weight);
    }
}
class Parrot extends Bird{
    Parrot(String name,String color, int age, double weight){
        super(name,color,age,weight);
        /*this.name=name;
        this.color=color;
        this.weight=weight;
        this.age=age;*/
    }
}
class Crow extends Bird{
    boolean isClever;
    Crow(String name,String color, int age, double weight,boolean isClever){
        /*this.name=name;
        this.color=color;
        this.weight=weight;
        this.age=age;*/
        super(name,color,age,weight);
        this.isClever=isClever;
    }
}
class Sparrow extends Bird{
    Sparrow(String name,String color, int age, double weight){
        /*this.name=name;
        this.color=color;
        this.weight=weight;
        this.age=age;*/
        super(name,color,age,weight);
    }
}
class Test{
    public static void main(String[] args) {
        Parrot parrot=new Parrot("Zeki","Green",2, 1);
        parrot.printInfo();
        Crow crow=new Crow("Crow","Black",3, 1.5,true);
        crow.printInfo();
        Sparrow sparrow=new Sparrow("Sparrow","White",3,5);
        sparrow.printInfo();
    }
}