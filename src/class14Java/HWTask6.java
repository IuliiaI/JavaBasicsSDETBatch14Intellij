package class14Java;

public class HWTask6 {
    /*
     Write a method to return whether given number is prime or not?
     */
    boolean isPrime(int num){
        boolean isPrime=true;
        if(num>1) {
            for(int i=2;i<num; i++) {
                if(num%i==0) {
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }
        return isPrime;
    }
    public static void main(String[] args) {
        HWTask6 obj=new HWTask6();
        boolean res=obj.isPrime(5);
        System.out.println(res);
    }
}
