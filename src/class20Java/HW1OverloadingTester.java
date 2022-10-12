package class20Java;

public class HW1OverloadingTester {
    public static void main(String[] args) {
        HW1Overloading rectangle=new HW1Overloading();
        rectangle.calculateArea(15,9);
        HW1Overloading square=new HW1Overloading();
        square.calculateArea(6);
        HW1Overloading box=new HW1Overloading();
        box.calculateVolume(15,9,6);
    }
}
