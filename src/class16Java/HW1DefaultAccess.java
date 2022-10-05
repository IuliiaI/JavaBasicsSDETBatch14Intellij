package class16Java;

public class HW1DefaultAccess {
    /*
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.
     */
    int add(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        HW1DefaultAccess obj=new HW1DefaultAccess();
        int[] a={1,2,3,4,5};
        int res=obj.add(a);
        System.out.println(res);
    }
}
