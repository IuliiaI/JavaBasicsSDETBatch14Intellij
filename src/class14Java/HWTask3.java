package class14Java;

public class HWTask3 {
    /*
    Create a method that will print whether given String palindrome or not
     */
    void reverse(String sentence){
        String sentenceNew=sentence.toLowerCase().replaceAll("\\s","");
        StringBuilder sb=new StringBuilder(sentenceNew);
        sb.reverse();
        String sentenceRev=sb.toString();
        if(sentenceRev.equals(sentenceNew)){
            System.out.println("String "+sentence+" is Palindrome");
        }else{
            System.out.println("String "+sentence+" is not Palindrome");
        }
    }

    public static void main(String[] args) {
        HWTask3 palindrome=new HWTask3();
        palindrome.reverse("Never odd or even");
    }



}
