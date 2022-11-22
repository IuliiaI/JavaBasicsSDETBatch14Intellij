package repls;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Repl209 {
    public static void main(String[] args){
        List<Map<String,Object>> dataList= new ArrayList<>();

        Map<String, Object> appleMap=new LinkedHashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10.0);
        dataList.add(appleMap);

        Map<String, Object> orangeMap=new LinkedHashMap<>();

        orangeMap.put("Items", "Orange" );
        orangeMap.put("Price", 21.99 );
        orangeMap.put("Quantity", 10.0);
        dataList.add(orangeMap);

        double sum=0;
        double subTotal=0;
        for(var vari:dataList) {
            Object newPrice=vari.get("Price");
            Double newPrice1=(double) newPrice;

            Object quantity=vari.get("Quantity");
            Double newQuantity=(double) quantity;
            String items=(String) vari.get("Items");

            // creating subTotal
            subTotal=newPrice1*newQuantity;

            System.out.println("Items: " +items + " Price: " +newPrice1+ " Quantity: "+newQuantity + " SubTotal: "+subTotal);
            System.out.println();

            sum+=subTotal;
        }
        System.out.println("Your Purchase total : "+ sum);


    }
}
