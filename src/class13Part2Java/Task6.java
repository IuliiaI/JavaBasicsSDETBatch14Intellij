package class13Part2Java;

public class Task6 {
    public static void main(String[] args) {

        /*How would you swap  2 strings without a temporary variable? */

        String day1="Monday";
        String day2="Tuesday";

        day1=day2+day1;

        day2=day1.replace(day2,"");
        day1=day1.replace(day2,"");

        System.out.println(day1);
        System.out.println(day2);












    }
}
