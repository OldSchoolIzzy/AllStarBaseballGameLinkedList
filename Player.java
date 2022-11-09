public class Player {
    private String name;
    private double battingAVG;
    private double homeRunPercentage;
    Player previous;
    Player next;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", battingAVG=" + battingAVG +
                ", homeRunPercentage=" + homeRunPercentage +
                '}';
    }

    public Player(String name, double battingAVG, double homeRunPercentage) {
        this.name = name;
        this.battingAVG = battingAVG;
        this.homeRunPercentage = homeRunPercentage;
    }

    public String getName() {
        return name;
    }

    public double getBattingAVG() {
        return battingAVG;
    }

    public double getHomeRunPercentage() {
        return homeRunPercentage;
    }

    public void setHomeRunPercentage(double homeRunPercentage) {
        this.homeRunPercentage = homeRunPercentage;
    }
}
