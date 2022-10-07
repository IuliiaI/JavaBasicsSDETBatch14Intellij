package class16Java;

import class17Java.HW3Couple;

import static class17Java.HW3Couple.weddingHall;

public class Test2CoupleOfClass17 {
    public static void main(String[] args) {
        HW3Couple couple7=new HW3Couple("Vlada", "Sasha",weddingHall);
        couple7.printNamesOfCouple();

        //HW3Couple couple8=new HW3Couple("Scorpio", "Leo");
        //couple8.knowCompatibility(); -->default doesn't work in other package

        //HW3Couple couple9=new HW3Couple(36,38);
        //couple9.difAge();--> private does not work even in other class
    }
}
