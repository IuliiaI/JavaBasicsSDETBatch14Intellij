package class17Java;

public class Test1FootballPlayer {
    public static void main(String[] args) {
        HW1FootballPlayer player=new HW1FootballPlayer();
        player.name="Cesar";
        player.surname="Azpilicueta";
        player.teamName="Chelsea";
        player.printData();

        HW1FootballPlayer player1=new HW1FootballPlayer("Cesar", "Azpilicueta", "Chelsea",
                28, "Potter", 20, 10000000.00 );
        player1.printData();
    }
}
