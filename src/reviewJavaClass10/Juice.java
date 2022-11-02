package reviewJavaClass10;

final class Drink{
    void drink(){
        System.out.println("drinking method");
    }
    //final methods cannot be overriden
    protected final void enjoy(){
        System.out.println("we enjoy drinking water");
    }

}
    //CE(compiler error) : the Type Juice Class cant be inherited from final class Drink
    //public class Juice extends Drink{

   /* public void enjoy(){
        System.out.println("we enjoy drinking juice");

    }*/

