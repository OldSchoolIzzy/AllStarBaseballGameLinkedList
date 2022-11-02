import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Player> players = new LinkedList<>();
        players.add(new Player("Ted Williams", 0.344, 0.0687));
        for (Player player : players){
            System.out.println(player);
        }
    }
}
