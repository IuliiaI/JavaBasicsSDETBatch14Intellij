package class16Java;

public class HW3PrivateAccess {
    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.
     */

    private static String choose(String given){
        String res="";
        for(int i=0;i<given.length();i++){
            if(given.charAt(i)=='a'||given.charAt(i)=='e'||given.charAt(i)=='i'||given.charAt(i)=='o'||
                    given.charAt(i)=='u'){
                res=res+given.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(HW3PrivateAccess.choose("Balenciaga"));
    }
}
