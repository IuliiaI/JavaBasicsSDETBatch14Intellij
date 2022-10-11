package Class19Java;
public class HW5 {
    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
     */
}
class Shape{
    int radius;
    Shape(int radius){
        this.radius=radius;
    }
}
class Circle extends Shape{
    Circle(int radius){
        super(radius);
    }
    void calculateArea(){
        double area;
        area=3.14*radius*radius;
        System.out.println(area);
    }
}
class TestShape{
    public static void main(String[] args) {
        Circle circle1=new Circle(13);
        circle1.calculateArea();
    }
}