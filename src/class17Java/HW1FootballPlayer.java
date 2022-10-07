package class17Java;
public class HW1FootballPlayer {
    /*
    Write a java class that will have a constructor:one with parameters and second without any parameters
    Create a separate Test class where you will execute both of constructors one by one.
     */
    String name;
    String surname;
    String teamName;
    private int number;
    private String coachSurname;
    private int numOfGoals;
    private double salary;
    public HW1FootballPlayer() {
    }
    public HW1FootballPlayer(String fPName, String fPSurname, String fTeamName, int fPNumber, String fCoachSurname,
                             int fPNumOfGoals, double fPSalary) {
        name=fPName;
        surname=fPSurname;
        teamName=fTeamName;
        number=fPNumber;
        coachSurname=fCoachSurname;
        numOfGoals=fPNumOfGoals;
        salary=fPSalary;
    }
    void printData(){
        System.out.println("Footballplayer of "+teamName+" "+name+" "+surname+" is one of the best in this season");
    }
}
