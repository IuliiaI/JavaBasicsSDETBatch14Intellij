package class25Java;

import java.util.ArrayList;

public class WhyWeNeedIterator {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Primer");
        beautyProducts.add("Shampoo");
        beautyProducts.add("Lotion");
        beautyProducts.add("Concealer");
        beautyProducts.add("EyeLinear");

        //we should never use for loop when we are going to change size of arrayList
        /*  for(int i=0;i<beautyProducts.size();i++){
            if(beautyProducts.get(i).endsWith("r")){
                beautyProducts.remove(i);
            }
        }    */

        //Enchanced loop -->> ConcurrentModificationException ERROR
        /*  for(String item:beautyProducts){
            if(item.endsWith("r")){
                beautyProducts.remove(item);
            }
        }   */

        System.out.println(beautyProducts);


    }
}