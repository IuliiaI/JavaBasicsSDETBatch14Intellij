package class20Java;
public class HW4Overloading {
    /*  Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.   */


  private static void giftDisplay(String name){
        System.out.println("This "+name+" is a gift for you");
        }
  private static void giftDisplay(String name, String color){
        System.out.println("This "+color+" "+name+" is a gift for you");
        }
  private static void giftDisplay(String roominess,String name,String color){
        System.out.println(roominess+" roominess of this "+color+" "+name+" will surprise you");
        }
  private static void giftDisplay(String roominess,String name,String color,String surprise){
        System.out.println("This "+color+" "+name+" with "+roominess+" roominess has one more "+surprise);
        }

    public static void main(String[] args) {

        giftDisplay("Bag");
        giftDisplay("Bag","Dark Green");
        giftDisplay("Large","Bag","Dark Green");
        giftDisplay("Large","Bag","Dark Green","Bag");

    }
        }

