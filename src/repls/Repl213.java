package repls;

public class Repl213 {
    public static void temperatureCheck(int n) {
        if(n>32) {
            System.out.println("Enjoy");
        } else {

            throw new RuntimeException("It is freezing");

        }

    }

    public static void main(String[] args) {
        try{
            temperatureCheck(30);
        } catch (Exception e) {
            System.out.println(e);

        }

    }
}
