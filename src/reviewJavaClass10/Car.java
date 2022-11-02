package reviewJavaClass10;

interface Drivable{
    //all variables by default public static final in interface
    boolean DRIVES=true;

    //we cannot have a constructor

    //by default all methods are public abstract
    void breaks();
}

interface Vehicle{
    void haveMotor();

    //from Java 8 we can have static and default methods(in case of default method we have to add DEFAULT as a keyword
    default void haveBreak() {
        System.out.println("All vehicle have break");
    }
        static void honk() {
            System.out.println("All vehicles honk");
        }
    }


//with help of abstract class we can achieve 0 to 100% abstraction
public abstract class Car {
    String color,make,model;
    public static final int WHEELS=4;

    public Car(String color,String make,String model){
        this.color=color;
        this.make=make;
        this.model=model;
    }
    void drive(){
        System.out.println("all cars can drive");
    }
    abstract void start();

    abstract void stop();

}

//multiple inheritanse is supported by interface only
class Tesla extends Car implements Drivable, Vehicle{
    Tesla(String color,String make,String model){
        super(color,make,model);
    }

    @Override
    void start() {
        System.out.println(make+ " starts automatically");
    }

    @Override
    void stop() {
        System.out.println(make+" stops when we press break");
    }
    public void charge(){
        System.out.println("You need to charge this car");
    }

    @Override
    public void breaks() {
        System.out.println(make+" can break");
    }

    @Override
    public void haveMotor() {
        System.out.println(make+" have a motor");
    }
    public void haveBreak() {
        System.out.println("All vehicle have break");
    }
}