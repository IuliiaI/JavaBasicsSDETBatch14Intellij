package class14Java;

public class HWTask5 {
    /*Create a method createEmail(). Based on values of users name, lastName and email type, your
      method should return complete email Address. Example:  createEmail(John, Snow, gmail) →
      johnsnow@gmail.com or
    */

    String createEmail(String firstName,String lastName,String emailType){
        /* StringBuilder sb=new StringBuilder();
        sb.append(firstName);
        sb.append(lastName);
        sb.append("@");
        sb.append(emailType);
        sb.append(".com");
        String singleString=sb.toString();
                return singleString.toLowerCase();  ... my version... */

                return (firstName+lastName+"@"+emailType+".com").toLowerCase();
    }

    public static void main(String[] args) {


        HWTask5 obj = new HWTask5();
        String email = obj.createEmail("Iuliia", "Iaremko", "gmail");
        System.out.println(email);
    }
}
