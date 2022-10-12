package class20Java;
public class HW4Overloading {
    /*  Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.   */


  void giftDisplay(String name){
        System.out.println("This "+name+" is a gift for you");
        }
  void giftDisplay(String name, String color){
        System.out.println("This "+color+" "+name+" is a gift for you");
        }
  void giftDisplay(String roominess,String name,String color){
        System.out.println(roominess+" roominess of this "+color+" "+name+" will surprise you");
        }
  void giftDisplay(String roominess,String name,String color,String surprise){
        System.out.println("This "+color+" "+name+" with "+roominess+" roominess has one more "+surprise);
        }
        }
class testHW4Overloading{
    public static void main(String[] args) {
        HW4Overloading gift=new HW4Overloading();
        gift.giftDisplay("Bag");
        gift.giftDisplay("Bag","Dark Green");
        gift.giftDisplay("Large","Bag","Dark Green");
        gift.giftDisplay("Large","Bag","Dark Green","Bag");
    }
}