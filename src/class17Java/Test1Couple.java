package class17Java;

import static class17Java.HW3Couple.weddingHall;

public class Test1Couple {
    public static void main(String[] args) {
        HW3Couple couple4=new HW3Couple("Tetiana", "Mihail", weddingHall);
        couple4.printNamesOfCouple();

        HW3Couple couple5=new HW3Couple("Libra", "Leo");
        couple5.knowCompatibility();

       // HW3Couple couple6=new HW3Couple(40,30);
        // couple4.difAge(); --> as private it does not work in other class
    }
}
