package reviewJavaClass09;

public class Banana extends Fruit{

    String origin;

    Banana(String name, String shape, String color,String origin){
        super(name,shape,color);
        this.origin=origin;
    }
    void makeSmothie(){
        System.out.println("from "+name+" we get tasty smoothy");
    }
    /*when child class have same method name as super class-overriding
    2 methods with same name BUT inside different classes
    how to override
    1.method signiture MUST be same
    2.return type MUST BE SAME
    3.access modifier/visibility can be same or MUST be higher
     */
    void makePie(){
        System.out.println("Banana pie is delicious");
    }
    protected void grow(){
        System.out.println(name+" grows fast and fresh");
    }
    //when child class have same static method as parent class we are not achieving overriding,
    //this is called method hiding
    public static void havePeel(){
        System.out.println("banana is very easy to peel");
    }

    public static void main(String[] args) {
        Banana ban=new Banana("banana","banana shape","yellow","Ecuador");
        ban.haveBenefits();//fruit
        ban.makeSmothie();//banana
        ban.grow();//banana
        Banana.havePeel();//banana
        System.out.println("________________________");
        //runtime polymorphism
        Fruit fruit=new Banana("banana","banana shape","green","Africa");
        fruit.grow();//runtime polymorphism
        fruit.haveBenefits();
        fruit.havePeel();//not polymorphism
    }
}
