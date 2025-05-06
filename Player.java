public class Player {
    public static int totalPlayer=0 ;
    public String PlayerName ;
    public static void main(String[] args) {
        Player obj1 = new Player();
        Player obj2 = new Player();
        obj1.PlayerName="p1";
        totalPlayer++;
        obj2.PlayerName="p2";
        totalPlayer++;
        System.out.println(Player.totalPlayer);

    


    }
}
