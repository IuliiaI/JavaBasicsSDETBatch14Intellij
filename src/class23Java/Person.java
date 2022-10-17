package class23Java;

public interface Person {
    void eat();
}
interface Employee{
    void work();
}
interface SyntaxEmployee extends Employee,Person{
    void createRepl();
}
class Asghar implements SyntaxEmployee{

    @Override
    public void eat() {
        System.out.println("Like to eat grilled Fish");
    }

    @Override
    public void work() {
        System.out.println("Teaches Batch14");
    }

    @Override
    public void createRepl() {
        System.out.println("Creates Repl tasks");
    }
}