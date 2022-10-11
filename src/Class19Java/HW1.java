package Class19Java;
public class HW1 {
    /* Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.*/
}
class A{
    String brandOfDishes;
    String nameOfDishes;
    void printInfo(){
        System.out.println("Very famous brand with dishes is "+brandOfDishes);
    }
}
class B extends A{
    int teaSetContent;
    void printData(){
        System.out.println("This tea set of "+brandOfDishes+" consists of "+teaSetContent+" items");
    }
}
class C extends B{
    int cupChangable;
    void printGuarantee(){
        System.out.println("Among these "+teaSetContent+" items are "+cupChangable+ " cups could be changed during guarantee term");
    }
}
class ABCTest{
    public static void main(String[] args) {
        A dishes=new A();
        dishes.brandOfDishes="VANDAN MART";
        dishes.printInfo();
        B teaSet=new B();
        teaSet.brandOfDishes="Royal English Tradition";
        teaSet.teaSetContent=15;
        teaSet.printData();
        C cups=new C();
        cups.teaSetContent=21;
        cups.cupChangable=3;
        cups.printGuarantee();

    }
}
