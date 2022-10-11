package Class19Java;
public class HW3 {
    /*Write a Java program called Teacher. Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
    that would have it their own features and behaviour. Test all 4 classes */
}
 class Teacher{
    String name;
    String surname;
    String background;
    int experience;
   Teacher (String name,String surname,String background,int experience) {
       this.name = name;
       this.surname = surname;
       this.background = background;
       this.experience = experience;
   }
       void  printInfo(){
           System.out.println(name +" "+surname+" is a teacher with "+background+" and "+experience+" years of teaching");
         }
    }
 class MathTeacher extends Teacher{
     MathTeacher (String name,String surname,String background,int experience){
         super(name,surname,background,experience);
     }
    boolean isGenius;
    void toBeMathTeacher(){
        if(isGenius==true){
            System.out.println("You can apply for position of Math Teacher in Harvard University");
        }else{
            System.out.println("It is a little chance to succeed");
        }
    }
 }
 class ChemistryTeacher extends Teacher{
     ChemistryTeacher (String name,String surname,String background,int experience){
         super(name,surname,background,experience);
     }
    String laboratoryFeatures;
    void toBeChemistryTeacher(){
        System.out.println("You have to be very handy with "+laboratoryFeatures);
    }
 }
 class PianoTeacher extends Teacher{
     PianoTeacher (String name,String surname,String background,int experience){
         super(name,surname,background,experience);
     }
    String specialClass;
    void toBePianoTeacher(){
        System.out.println("You have to be exited about setup of "+specialClass);
    }

 }
 class TestTeacher{
     public static void main(String[] args) {
         MathTeacher teacher1=new MathTeacher("Nataliya","Petrichenko","Science Degree in Math",15);
         teacher1.printInfo();
         teacher1.isGenius=true;
         teacher1.toBeMathTeacher();

         ChemistryTeacher teacher2=new ChemistryTeacher("Alla","Yelevskaya","Master Degree in Chemistry",9);
         teacher2.printInfo();
         teacher2.laboratoryFeatures="equipment for all kinds of experiments";
         teacher2.toBeChemistryTeacher();

         PianoTeacher teacher3=new PianoTeacher("Serhey","Skripka","Bachelor Degree in Piano Performance",15);
         teacher3.printInfo();
         teacher3.specialClass="full of inspiration class";
         teacher3.toBePianoTeacher();
     }
 }