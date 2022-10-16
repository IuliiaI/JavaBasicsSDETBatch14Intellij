package class22Java;

public class FinalDemo {
    public static void main(String[] args) {
        Phone phone=new Phone();
        //phone.RAM=50;
    }
}
//final
    class Phone{
    final int RAM=12;
    final void takePics(){
        //RAM=15;
        final int RAM=12;
    }
}

class Iphone extends Phone{
    //void takePics(){

    }
