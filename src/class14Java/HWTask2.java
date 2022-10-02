package class14Java;

public class HWTask2 {
    /*
    Create a method that will take a number and prints whether the number is even or odd
     */
    void defineNumber(int num){
        if(num%2==0){
            System.out.println("The number "+num+" is even");
        }else{
            System.out.println("The number "+num+" is odd");
        }
    }

    public static void main(String[] args) {
        HWTask2 choice=new HWTask2();
        choice.defineNumber(7);
    }










}
