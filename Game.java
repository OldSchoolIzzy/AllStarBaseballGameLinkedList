import java.util.Scanner;

public class Game {
    private int inning = 0;

    private int outs = 3;
    private int score = 0;
    private int runs = 0;
    private int hits = 0;
    DoubleLinkedList players;
    public Game(DoubleLinkedList players) {
        this.players = players;
    }

    public void playInning(){
        Scanner scan = new Scanner(System.in);
        String again = "yes";
        while (again.equalsIgnoreCase("yes")){
            inning++;
            int numOfOuts = 0;
            while(numOfOuts != outs){
                printNodes();
                numOfOuts++;
            }
            System.out.println("Would you like to run again?");
            again = scan.next();
        }
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

    public DoubleLinkedList getPlayers() {
        return players;
    }

    public void setPlayers(DoubleLinkedList players) {
        this.players = players;
    }
    public void printNodes(){
        Player current = players.head;
        if (players.head == null){
            System.out.println("Doubly linked list is empty");
            return;
        }
        while (current != null){
            double randomNumber = Math.random();

            if (randomNumber < current.getBattingAVG() && randomNumber > current.getHomeRunPercentage()){
                System.out.println("PLayer name: " + current.getName() + " BA: " + current.getBattingAVG() +
                        " Random number: " + randomNumber + " HIT!");
            }
            else if (randomNumber < current.getHomeRunPercentage()) {
                System.out.println("PLayer name: " + current.getName() + " BA: " + current.getBattingAVG() +
                        " Random number: " + randomNumber + " RUN!");
            } else{
                System.out.println("PLayer name: " + current.getName() + " BA: " + current.getBattingAVG() +
                        " Random number: " + randomNumber + " OUT!");
            }
            current = current.next;
        }
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
