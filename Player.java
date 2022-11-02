public class Player {
    private String name;
    private double battingAVG;
    private double homeRunPercentage;

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

    public void setName(String name) {
        this.name = name;
    }

    public double getBattingAVG() {
        return battingAVG;
    }

    public void setBattingAVG(double battingAVG) {
        this.battingAVG = battingAVG;
    }

    public double getHomeRunPercentage() {
        return homeRunPercentage;
    }

    public void setHomeRunPercentage(double homeRunPercentage) {
        this.homeRunPercentage = homeRunPercentage;
    }
}
