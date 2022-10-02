package class14Java;

public class Student {
/*     Create  class Student that will have a method getGrade. Your method should accept the score
       of a student and return a grade:score > 90 - A
                                       score >80 - B
                                       score >70 - C
                                       score > 50 - D
                                       anything else - F    */
       char getGrade(int score){
           char grade;
           if(score>90) {
               grade='A';
           }else if(score>80){
               grade='B';
           }else if(score>70){
               grade='C';
           }else if(score>50){
               grade='D';
           }else{
               grade='F';
           }
           return grade;
       }

    public static void main(String[] args) {
        Student obj=new Student();
        char gr =obj.getGrade(95);
        System.out.println(gr);
    }



}
