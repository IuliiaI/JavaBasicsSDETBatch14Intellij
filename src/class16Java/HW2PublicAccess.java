package class16Java;

public class HW2PublicAccess {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */
    public static String revGiven(String given){
        StringBuilder sb=new StringBuilder(given);
        sb.reverse();
        String afterRev=sb.toString();
        return afterRev;
    }

    public static void main(String[] args) {

        System.out.println(HW2PublicAccess.revGiven("Beautiful Day"));
    }
}
