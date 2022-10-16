package class22Java;
public class HW1RunTimePolymorphism {
    /*         Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Write example of achieving run time polymorphism          */
    public static void main(String[] args) {
        SyntaxStudent student1=new SyntaxStudent();
        student1.study();
        student1.backgroung();

        CollegeStudent student2=new CollegeStudent();
        student2.study();
        student2.fieldChoice();

        SchoolStudent student3=new SchoolStudent();
        student3.study();
        student3.choice();
    }
}

class Student{
    void study(){
        System.out.println("You are studying");
    }
}
class SyntaxStudent extends Student{
    void study(){
        System.out.println("You are studying at Syntax School");
    }
    void backgroung(){
        System.out.println("You don't need any background to apply Syntax School");
    }
}
class CollegeStudent extends Student{
    void study(){
        System.out.println("You are studying at College");
    }
    void fieldChoice(){
        System.out.println("You have to know your strengths to choose proper subjects credits");
    }
}
class SchoolStudent extends Student{
    void study(){
        System.out.println("You are studying at High School");
    }
    void choice(){
        System.out.println("It is good for future education to choose a school with deep learning " +
                "of certain subjects approaches  ");
    }
}