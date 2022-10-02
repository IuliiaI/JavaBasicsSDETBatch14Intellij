package class14Java;

public class MethodsDemo1 {

    //a method that does not take any parameters and prints some lines on the console
    void printHello(){//defined
        System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("Hello Aladin");
    }
    //the method takes a single parameter of type string and prints it
    void printWord(String word){//dynamic method
        System.out.println(word);
    }

    public static void main(String[] args) {

        MethodsDemo1 obj=new MethodsDemo1();
        obj.printHello();
        obj.printWord("Taivinion dont worry it is Java class");
        obj.printWord("No Athira it does not make sence");




    }













}
