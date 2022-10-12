package class20Java;
public class HW3Overloading {
    /*    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.   */

    static void giftInfo(String name){
        System.out.println("This "+name+" is a gift for you");
    }
    static void giftInfo(String name, String color){
        System.out.println("This "+color+" "+name+" is a gift for you");
    }
    static void giftInfo(String roominess,String name,String color){
        System.out.println(roominess+" roominess of this "+color+" "+name+" will surprise you");
    }
    static void giftInfo(String roominess,String name,String color,String surprise){
        System.out.println("This "+color+" "+name+" with "+roominess+" roominess has one more "+surprise);
    }
}
class testHWOverloading{
    public static void main(String[] args) {
        HW3Overloading gift=new HW3Overloading();
        gift.giftInfo("Bag");
        gift.giftInfo("Bag","Dark Green");
        gift.giftInfo("Large","Bag","Dark Green");
        gift.giftInfo("Large","Bag","Dark Green","Bag");
    }
}