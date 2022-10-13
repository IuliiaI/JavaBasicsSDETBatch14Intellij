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

    public static void main(String[] args) {
        giftInfo("Bag");
        giftInfo("Bag","Dark Green");
        giftInfo("Large","Bag","Dark Green");
        giftInfo("Large","Bag","Dark Green","Bag");
    }
}
