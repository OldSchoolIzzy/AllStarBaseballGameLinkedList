import java.util.LinkedList;

public class Game {
    private int inning = 3;
    private int score;
    private int runs;
    private int hits;

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

    LinkedList<Player> players;

    public Game(int score, int runs, int hits, LinkedList<Player> players) {
        this.score = score;
        this.runs = runs;
        this.hits = hits;
        this.players = players;
    }

    public int getInning() {
        return inning;
    }

    public void setInning(int inning) {
        this.inning = inning;
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
}
