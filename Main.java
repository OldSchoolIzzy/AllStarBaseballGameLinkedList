import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList players = getPlayers();
        Game game = new Game(players);
        game.playInning();

        // while again equals yes
        // inning +1
        // while outs does not equal to 3, keep playing/batting
        //
    }

    private static DoubleLinkedList getPlayers() {
        DoubleLinkedList players = new DoubleLinkedList();
        players.addNode("Ted Williams", 0.344, 0.0687);
        players.addNode("Rodgers Hornsby", 0.359, 0.0375);
        players.addNode("Mark McGwire", 0.265, 0.095);
        players.addNode("Babe Ruth", 0.340, 0.085);
        return  players;
    }
}
