package class18Java;

public class HWStudentThisKeyword {
    /*
    Write a Student class that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.
     */
    String name;
    String address;

    HWStudentThisKeyword(String name, String address){
        this.name=name;
        this.address=address;
    }

    void displayInfo(){
        System.out.println("Name of student is "+name+" and the address is "+address);
    }

    public static void main(String[] args) {
        new HWStudentThisKeyword("Kamil","718 Boulevard str Queens New York").displayInfo();
    }
}
