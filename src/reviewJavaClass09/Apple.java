package reviewJavaClass09;

public class Apple extends Fruit{

    String size;
    String taste;
    double price;

    Apple(String name,String shape,String color,String size){
        super(name,shape,color);
        this.size=size;//we cant create new constructor in child class we have to call parent class constructor
    }
    Apple(String name,String shape,String color,String size,String taste,double price){
        this(name,shape,color,size);
        this.taste=taste;
        this.price=price;
    }
    //overloading - methods with the same name within same class
    /* how to achieve overloading:
    1. change # of parameters
    2.type of parameters
    in overloading -method signiture MUST BE DIFFERENT
    method signiture=name+parameters
    we dont care about return type
     */
    void makeJuice(){
        System.out.println("from "+name+ " we can make " +taste + "juice");
    }
    /*
    String makeJuice(){
    } --> this is not overloading, signiture is same
     */
    void makeJuice(String fruit){
        System.out.println("We can have a juice from "+name+" mixed with "+fruit);
    }


    public static void main(String[] args) {
        Apple app=new Apple("apple","circle","red","big");
        //app.color; private member of super class is not visible
        System.out.println(app.name);
        System.out.println(app.shape);

        System.out.println(Fruit.FRESH);
        System.out.println(Apple.FRESH);

        app.grow();//fruit class
        app.haveBenefits();
        app.makeJuice();//apple class
    }
}
