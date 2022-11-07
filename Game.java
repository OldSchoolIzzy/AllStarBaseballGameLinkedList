import java.text.DecimalFormat;
import java.util.Scanner;

public class Game {
    private int inning = 0;
    private int outs = 3;
    private int runs = 0;
    DoubleLinkedList players;
    public Game(DoubleLinkedList players) {
        this.players = players;
    }

    public void playInning(){
        Scanner scan = new Scanner(System.in);
        String again = "yes";
        while (again.equalsIgnoreCase("yes")){
            inning++;
            System.out.println("Inning: " + inning + " \tScore: " + runs + " runs");
            int numOfOuts = 0;
            int hits = 0;
            int onBase = 0;

            while(numOfOuts != outs) {
                Player current = players.head;
                if (players.head == null){
                    System.out.println("Doubly linked list is empty");
                    return;
                }
                while (current != null){
                    if (numOfOuts == outs){
                        break;
                    }else{
                        double randomNumber = Math.random();
                        DecimalFormat df_obj = new DecimalFormat("#.###");
                        randomNumber = Double.parseDouble(df_obj.format(randomNumber));

                        if (randomNumber < current.getBattingAVG() && randomNumber > current.getHomeRunPercentage()){
                            System.out.println("PLayer name: " + current.getName() + " BA: " + current.getBattingAVG() +
                                    " Random number: " + randomNumber + " HIT!");
                            onBase++;
                            hits++;
                            if (onBase > 3){
                                runs++;
                                onBase--;
                            }
                        }
                        else if (randomNumber < current.getHomeRunPercentage()) {
                            System.out.println("PLayer name: " + current.getName() + " BA: " + current.getBattingAVG() +
                                    " Random number: " + randomNumber + " RUN!");
                            runs += onBase;
                            runs++;
                            onBase = 0;
                        }
                        else{
                            System.out.println("PLayer name: " + current.getName() + " BA: " + current.getBattingAVG() +
                                    " Random number: " + randomNumber + " OUT!");
                            numOfOuts++;
                        }
                        current = current.next;
                    }
                }
            }
            System.out.println("Inning totals--- " + "Runs: " + runs + " Hits: " + hits);
            System.out.println("Game score: " + runs + " runs");

            System.out.println("Would you like to run again?");
            again = scan.next();
        }
        System.out.println("Game over. Game score: " + runs + " runs");
    }
    public int getInning() {
        return inning;
    }

    public void setInning(int inning) {
        this.inning = inning;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public DoubleLinkedList getPlayers() {
        return players;
    }

    public void setPlayers(DoubleLinkedList players) {
        this.players = players;
    }
    @Override
    public String toString() {
        return "Game{" +
                "inning=" + inning +
                ", runs=" + runs +
                ", players=" + players +
                '}';
    }
}
