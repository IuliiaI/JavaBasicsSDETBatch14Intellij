package reviewJavaClass09;

public class Fruit {
    protected String name;
    String shape;
    private String color;

    final public static boolean FRESH=true;

    //final static variables - constants
    //constants are recommended to write using UPPERCASE
    final public static boolean CAN_EAT=true;

    public Fruit(String name){
        this.name=name;
    }
    Fruit(String name, String shape, String color){
        this(name);//it must be the first statement
        this.shape=shape;
        this.color=color;
    }

    void grow(){
        System.out.println("All fruits grow fresh "+FRESH);
    }
    public static void havePeel(){
        System.out.println("All fruits have to be peeled");
    }
    protected void haveBenefits(){
        System.out.println("All fruits good for your health");
    }
}
