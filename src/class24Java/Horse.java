package class24Java;

public class Horse {
    /*     Create a horse class have 5 fields of your choice
    Create constructor and getter setter methods for this class
    at least write one condition inside setter class ( check empty values)     */
    private String name;
    private String breed;
    private String temper;
    private int age;
    private double weight;

    public Horse(String name, String breed, String temper, int age, double weight) {
        setName(name);
        setBreed(breed);
        setTemper(temper);
        setAge(age);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("Please enter the name");
        }else {
            this.name = name;
        }
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        if(breed.isEmpty()){
            System.out.println("Please enter the breed");
        }else {
            this.breed = breed;
        }
    }

    public String getTemper() {
        return temper;
    }
    public void setTemper(String temper) {
        if(temper.isEmpty()){
            System.out.println("Please enter the temper");
        }else {
            this.temper = temper;
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age<0){
            System.out.println("age cant be negative");
        }else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        if(weight<0){
            System.out.println("weight cant be negative");
        }else {
            this.weight = weight;
        }
    }

    void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" Temper "+temper+" Age "+age+" Weight "+weight);
    }
}

class horseTester{
    public static void main(String[] args) {
        Horse horse=new Horse("","","", -7,-5);
        horse.printInfo();

    }
}