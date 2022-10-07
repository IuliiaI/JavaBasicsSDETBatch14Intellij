package class17Java;
public class HW2Student {
    /* Write a java class Students that have a constructor which takes students name and 3 subject grades.Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.Your program should print an average mark of each student name.
    NOTE:please use different names for instance and local variables. */
    private String name;
    private int mathGrade;
    private int historyGrade;
    private int programmingGrade;
    public HW2Student(String nameSt, int mathGradeSt, int historyGradeSt, int programmingGradeSt) {
        name = nameSt;
        mathGrade = mathGradeSt;
        historyGrade = historyGradeSt;
        programmingGrade = programmingGradeSt;
    }
    void printAverage(){
        int avrg=0;
        avrg=(mathGrade+historyGrade+programmingGrade)/3;
        System.out.println(avrg);
    }
    public static void main(String[] args) {
        HW2Student student1=new HW2Student("Todd", 70, 90, 90 );
        student1.printAverage();

        HW2Student student2=new HW2Student("Kamilla", 90, 70, 80 );
        student2.printAverage();

        HW2Student student3=new HW2Student("Maya", 70, 70, 90 );
        student3.printAverage();

        HW2Student student4=new HW2Student("Regina", 85, 65, 90 );
        student4.printAverage();

        HW2Student student5=new HW2Student("Mike", 80, 90, 75 );
        student5.printAverage();
    }

}
