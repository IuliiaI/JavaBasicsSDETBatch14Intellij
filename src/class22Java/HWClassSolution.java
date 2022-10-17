package class22Java;
public class HWClassSolution {
}
class Student1{
    void study(){
        System.out.println("students must study");
    }
    void doHomeWork(){
        System.out.println("Students must solve their homeworks");
    }
    void doPractice(){
        System.out.println("Students must practice to get good marks");
    }
}
class SyntaxStudent1 extends Student1{

    @Override
    void doHomeWork() {
        System.out.println("Syntax students must solve all Repls three time ");
    }

    @Override
    void doPractice() {
        System.out.println("Syntax student must do their own research and practice ");
    }

}
class CollegeStudent1 extends Student1{

    @Override
    void doPractice() {
        System.out.println("College students must practice to get good marks");
    }
}
class SchoolStudent1 extends Student1{

}
class StudentTester {
    public static void main(String[] args) {
        Student1[] arr={new CollegeStudent1(),
                new SchoolStudent1(),new SyntaxStudent1()};

        for (Student1 st:arr
        ) {
            st.study();
            st.doHomeWork();
            st.doPractice();
        }
    }
}