package class17Java;

public class HW4 {
    /*
    Write a program that have static consructor and observe result
     */

    static String nameOfBride;
    static String nameOfGroom;
    static String weddingHall="Central";


    HW4(String nameOfBrideC, String nameOfGroomC, String weddingHall) {
        nameOfBride = nameOfBrideC;
        nameOfGroom = nameOfGroomC;
    }

    void printNamesOfCouple(){
        System.out.println("Name of bride is "+nameOfBride+" "+" and name of groom is "+nameOfGroom+"."+" Today they" +
                " are getting married in "+weddingHall+" wedding hall");
    }

    public static void main(String[] args) {
        HW4 newCouple=new HW4("Linda","Roccy",weddingHall);
        newCouple.printNamesOfCouple();
    }
}
