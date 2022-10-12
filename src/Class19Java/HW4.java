package Class19Java;
public class HW4 {
    /*Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.*/
}
class UserClass{
    String name;
    String mobileNumber;
    UserClass(String name,String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
}
class UserInfo extends UserClass{

    String address;
    UserInfo(String address, String name,String mobileNumber){
        super(name,mobileNumber);
        this.address=address;
    }
    void userDetails(){
        System.out.println("The name of student is "+name+"."+"The mobile number is "+mobileNumber+"."+"" +
                " The address is "+address);
    }
}
class TestUser{
    public static void main(String[] args) {
        UserInfo user1=new UserInfo("Slava Boulevard 17", "Vyacheslav","345-667-7876");
        user1.userDetails();
    }
}