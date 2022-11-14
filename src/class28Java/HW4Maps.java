package class28Java;

import java.util.Objects;
import java.util.TreeMap;

public class HW4Maps {
    /*   Create a Person class with following private fields: name, lastName, age, salary.
         Variables should be initialized through constructor.
         Inside the class also create a method to print user details.
         In Test Class create a Map that will store key in ascending order.
         In that map store personId and a Person Object. Print each object details.     */
    public static void main(String[] args) {
        TreeMap<String,Person> data=new TreeMap<>();
        data.put("234254",new Person("Kelly","Orland",24,160000));
        data.put("576578",new Person("Brenda","Bosso",26,180000));
        data.put("465777",new Person("Jason","Nerkly",25,250000));

        System.out.println(data);
    }
}
class Person{
    private String name;
    private String lastName;
    private int age;
    private double salary;

    Person(String name,String lastName,int age,double salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }

    void printUserDetails(){
        System.out.println(name+" "+lastName+" is "+age+" years old and has a salary of "+salary);

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.salary, salary) == 0 && Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age, salary);
    }
}
