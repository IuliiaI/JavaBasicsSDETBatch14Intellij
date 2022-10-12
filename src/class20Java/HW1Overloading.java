package class20Java;

public class HW1Overloading {
    /* Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    Rectangle lenght*width
    Square lenghtSide*lenghtSide
    Box lenght*width*height
    Use separate class to test your code */
    void calculateArea(int length,int width){
        System.out.println(length*width);
    }
    void calculateArea(int sideLength){
        System.out.println(sideLength*sideLength);
    }
    void calculateVolume(int length,int width,int height){
        System.out.println(length*width*height);
    }
}
