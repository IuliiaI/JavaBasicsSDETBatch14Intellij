package class13Part2Java;

public class Task5InClass {

    public static void main(String[] args) {

        String str="dad";
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(str)) {
            System.out.println("The String is Palindrome");
        }else {
            System.out.println("The String is not Palindrome");
        }









    }
}
