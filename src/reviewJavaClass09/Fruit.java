package reviewJavaClass09;

public class Fruit {
    protected String name;
    String shape;
    private String color;

    public static boolean fresh;

    public Fruit(String name){
        this.name=name;
    }
    Fruit(String name, String shape, String color){
        this(name);//it must be the first statement
        this.shape=shape;
        this.color=color;
    }

    void grow(){
        System.out.println("All fruits grow fresh "+fresh);
    }
    public static void havePeel(){
        System.out.println("All fruits have to be peeled");
    }
    protected void haveBenefits(){
        System.out.println("All fruits good for your health");
    }
}
