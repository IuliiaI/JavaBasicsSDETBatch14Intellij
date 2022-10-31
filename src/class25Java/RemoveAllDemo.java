package class25Java;

import java.util.ArrayList;

public class RemoveAllDemo {
    public static void main(String[] args) {
        ArrayList<String> makeUpItem = new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("Concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("EyeLinear");
        makeUpItem.add("Lipstick");

        makeUpItem.remove("Blush");
        makeUpItem.remove("Base");
        makeUpItem.remove("Concealer");

        ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Blush");
        itemsToBeRemoved.add("Base");
        itemsToBeRemoved.add("Concealer");

        makeUpItem.removeAll(itemsToBeRemoved);
        //makeUpItem.clear(); //it removes everything
        System.out.println(makeUpItem);

    }
}