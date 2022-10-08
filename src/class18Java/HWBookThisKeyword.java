package class18Java;

public class HWBookThisKeyword {
    /* Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
     Instance variables are being initialized
     Both Constructors are being executed */

    private String name;
    private int numOfPages;
    private String redLineTopic;
    private double reviewMark;
    private boolean isExpensive;

    HWBookThisKeyword(String name,String redLineTopic){
        this.name=name;
        this.redLineTopic=redLineTopic;
    }

    HWBookThisKeyword(boolean isExpensive){
        this.isExpensive=isExpensive;
    }

    void printInfo(){
        System.out.println("The main topic of book "+name+" is "+redLineTopic);
    }
    void knowCost(){
        if(isExpensive==true){
            System.out.println("You have to earn enough to have it in your library");
        }else{
            System.out.println("It is possible to have it for everyone");
        }
    }

    public static void main(String[] args) {
        HWBookThisKeyword book=new HWBookThisKeyword(true);
        book.knowCost();
        HWBookThisKeyword book1=new HWBookThisKeyword("Free Market","historical implementation" +
                " of approach in different economics in the world");
        book1.printInfo();
    }
}
