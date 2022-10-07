package reviewJavaClass06;

public class Dog {

    String name;//instance variable
    int weight;//instance

    static String breed;//when we want to specify something common because it is only one copy for all objects, we
    //can access it through class name Dog ...

    void printInfo(){
        System.out.println("Dog features: "+name+","+weight+","+breed);
    }
    void love(String thing) {
        System.out.println(name+" loves "+thing);
    }

    //create a method to calculate price. if weight is more than 5-->100
    //                                    if weight is more than 10-->300
    //                                    if weight is more than 20-->1000
    float getPrice(){
        if(weight<5){
            return 100;
        }else if(weight<10){
            return 300;
        }else{
            return 1000;
        }
    }

    //create a method that will return bark type
    //if weight is more less 5-->loud
    //if weight less 20 -> noice is wooh
    //if weight is less 500->noice Gav gav

    String bark(){
        String noise;
        if(weight<5){
            noise="loud";
        }else if(weight<10){
            noise="woof woof";
        }else{
            noise="gav gav";
        }
        return noise;
    }

    /*variables syntax

    dataType name
    String   breed

    method syntax

    returnType name
    void       printInfo

     */
}
