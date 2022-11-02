package reviewJavaClass10;

public class TestCarAndTesla {
    public static void main(String[] args) {
       Car car=new Tesla("yellow","Tesla","X");
       car.drive();
       car.start();
       car.stop();
       //car.charge(); cannot use
        Tesla tesla=new Tesla("Green","Tesla","X");
        tesla.drive();
        tesla.start();
        tesla.stop();
        tesla.charge();

        //new car(); not possible because of incompleted class Car
    }
}
