package reviewJavaClass08;
public class Teacher {

    public String name,lname;
    protected String subject;
    int experience;
    double salary;

    static String school;
    //this . ->use to refer to the current object:instance variables
    //instance methods
    public Teacher(String name,String lname){
        this.name=name;
        this.lname=lname;
    }
    //this() -> refers to the current object:current class constructor
    protected Teacher (String name,String lname,String subject){
        this(name,lname);//Constructor call must be the first statement in a
        this.subject=subject;
    }
    Teacher(String name,String lname,int experience){
        this(name,lname);
        this.experience=experience;
    }
    //static can work only with static
    public static void work(){
        //print(); --> static members can work only with static members
        System.out.println("All teachers work at "+school);
    }
    protected void print(){
        this.work();//instance methods can work with instance and static methods and variables not constructors
        System.out.println("Teacher name is "+name+" "+lname);
    }
    void teach(){
        this.print();//we call method from this current class inside other method
        System.out.println(name+" teaches "+subject);
    }
    //method that will calculate bonus based on experience and return it
    private double getBonus(){
        if(experience<5){
            return 3;
        }else{
            return 3.5;
        }
    }
}
