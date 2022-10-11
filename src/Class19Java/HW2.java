package Class19Java;
public class HW2 {
    /* Write program to inherit class A that has method printF which is static and call or reuse that method into class B*/
}
class A1{
    static boolean isLady;
    static void printF(){
        if(isLady==true){
            System.out.println("There are a lot of items for women in our shop");
        }else{
            System.out.println("There are not many items for men in this shop");
        }

    }
}
class B1 extends A1{
    String item;
}

class TestA1B1{
    public static void main(String[] args) {
        B1 obj=new B1();
        obj.isLady=true;
        obj.printF();
    }
}