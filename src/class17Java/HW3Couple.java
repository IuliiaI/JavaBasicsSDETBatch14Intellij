package class17Java;

public class HW3Couple {
    /*Write a java class that have 4 costructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this class.
    1-inside same class;2-from outside the class; 3-from different class inside
    different package and observe result.
     */
    private String nameOfBride;
    private String jobOfBride;
    private String zodiacSignOfBride;
    private int ageOfBride;
    private String nameOfGroom;
    private String jobOfGroom;

    private String zodiacSignOfGroom;
    private int ageOfGroom;

    public static String weddingHall="Central";

    public HW3Couple(String nameOfBrideC, String nameOfGroomC, String weddingHall) {
        nameOfBride = nameOfBrideC;
        nameOfGroom = nameOfGroomC;
    }

    HW3Couple(String zodiacSignOfBrideC, String zodiacSignOfGroomC) {
        zodiacSignOfBride = zodiacSignOfBrideC;
        zodiacSignOfGroom = zodiacSignOfGroomC;
    }

    private HW3Couple(int ageOfBrideC, int ageOfGroomC) {
        ageOfBride = ageOfBrideC;
        ageOfGroom = ageOfGroomC;
    }

    protected HW3Couple(String jobOfGroomC) {
        jobOfGroom = jobOfGroomC;
    }

    public void printNamesOfCouple(){
        System.out.println("Name of bride is "+nameOfBride+" "+" and name of groom is "+nameOfGroom+"."+" Today they" +
                "are getting married in "+weddingHall+" wedding hall");
    }
    void knowCompatibility(){
        System.out.println("Zodiac sign of bride "+zodiacSignOfBride+" "+" and zodiac sign of groom "+zodiacSignOfGroom+" "
        +"are the great union of love and understanding");
    }
    protected void displayInterests(){
        System.out.println("Profession of groom "+jobOfGroom+" "
        +" would play important role in time for family traditions");
    }
    private void difAge(){
        if(ageOfGroom>=ageOfBride){
            System.out.println("Your couple is mostly common union");
        }else{
            System.out.println("Your couple is more unique than usual");
        }
    }

    public static void main(String[] args) {
        HW3Couple couple1=new HW3Couple("Lana", "Artem", weddingHall);
        couple1.printNamesOfCouple();

        HW3Couple couple2=new HW3Couple("Aquarius", "Virgo");
        couple2.knowCompatibility();

        HW3Couple couple3=new HW3Couple(30,40);
        couple3.difAge();
    }
}
