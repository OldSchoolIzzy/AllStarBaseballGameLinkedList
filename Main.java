
public class Main {
    public static void main(String[] args) {
        DoubleLinkedList players = getPlayers();
        Game game = new Game(players);
        game.playInning();

        // while again equals yes
        // inning ++
        // print out game statement
        // playGame
        // get the head player
        // if a player makes a hit, add them to some data structure to represent that they are on base
        // if a player get a run, grab the base players firsts, count how many they are and that to runs then add the
        // player who hit the run
        // if a players gets an out, add that player to the tail
        // keep playing until there are three outs
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
