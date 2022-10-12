package class20Java;

public class MethodOverloadingDemo2 {
    private MethodOverloading md;

    void F1(String name,int number){
        System.out.println("String name, int number");
    }

    //by changing the number of parameters
    void F1(String name,int number,int number2){
        System.out.println("String name, int number,int number2");
    }

    //by changing the data type
    void F1(int num1,int number){
        System.out.println("int num1,int number");
    }
    void F1(int number,String name){
        System.out.println("int number,String name");
    }

    public static void main(String[] args) {
        MethodOverloadingDemo2 md=new MethodOverloadingDemo2();
        md.F1("Taras",20);
    }
}
