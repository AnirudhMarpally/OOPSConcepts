package CricketPlayerStats;
public class Bowler extends CricketPlayer {
    private int runsGiven;
    private int wicketsTaken;
    private int totalBalls;
    public float calEconomy() {
        return (float) (runsGiven * 6.0f / totalBalls);
    }
    public int getRunsGiven() {
        return runsGiven;
    }
    public void setRunsGiven(int runsGiven) {
        this.runsGiven = runsGiven;
    }
    public int getWicketsTaken() {
        return wicketsTaken;
    }
    public void setWicketsTaken(int wicketsTaken) {
        this.wicketsTaken = wicketsTaken;
    }
    public int getTotalBalls() {
        return totalBalls;
    }
    public void setTotalBalls(int totalBalls) {
        this.totalBalls = totalBalls;
    }
    public Bowler(String name, byte age, int matches, String teamName) {
        super(name, age, matches, teamName);
    }
    public Bowler(String name, byte age, int matches, String teamName, int runsGiven, int wicketsTaken,
            int totalBalls) {
        super(name, age, matches, teamName);
        this.runsGiven = runsGiven;
        this.wicketsTaken = wicketsTaken;
        this.totalBalls = totalBalls;
    }
    @Override
    public String toString() {
        return "Bowler : Runs=" + runsGiven + ", wickets=" + wicketsTaken + ", total Balls=" + totalBalls + ", Economy="
                + calEconomy() + ", Name=" + getName() + ", Age=" + getAge() + ", Matches=" + getMatches()
                + ", Team Name " + getTeamName();
    }
	@Override
	public double calAverage() {
		// TODO Auto-generated method stub
		return 0;
	}
}
