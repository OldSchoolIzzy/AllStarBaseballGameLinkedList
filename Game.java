import java.util.LinkedList;

public class Game {
    private int inning = 3;

    private int outs = 3;
    private int score = 0;
    private int runs = 0;
    private int hits = 0;
    LinkedList<Player> players;
    public Game(LinkedList<Player> players) {
        this.players = players;
    }

    public int getInning() {
        return inning;
    }

    public void setInning(int inning) {
        this.inning = inning;
    }

    public int getOuts() {
        return outs;
    }

    public void setOuts(int outs) {
        this.outs = outs;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public LinkedList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(LinkedList<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Game{" +
                "inning=" + inning +
                ", score=" + score +
                ", runs=" + runs +
                ", hits=" + hits +
                ", players=" + players +
                '}';
    }
}
