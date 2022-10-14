package reviewJavaClass07;

public class Teacher {
    String name, lastName;
    int experience;
    String subject;
    double salary;

    static String school;

    //how to create a constructor
    /* 1.constructor name=classname
    2. no return type not even void
     when we do not create a constructor, compiler creates default constructor and initialized the object
     when you create a constructor compiler is not going to create default constructor for you
     */
    //using below constructor we initialize instance variables(name,Lastname)

    Teacher(String fname,String lName){
        name=fname;
        lastName=lName;
    }


    void print(){
        System.out.println(name+" "+" name"+lastName+" "+" lastname");
    }
}
