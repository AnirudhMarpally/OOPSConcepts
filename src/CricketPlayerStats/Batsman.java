package CricketPlayerStats;
public class Batsman extends CricketPlayer {
    private int runScorced;
    private int ballFaced;
    public int getRunScorced() {
        return runScorced;
    }
    public void setRunScorced(int runScorced) {
        this.runScorced = runScorced;
    }
    public int getBallFaced() {
        return ballFaced;
    }
    public void setBallFaced(int ballFaced) {
        this.ballFaced = ballFaced;
    }
    public Batsman(String name, byte age, int matches, String teamName, int runScorced, int ballFaced) {
        super(name, age, matches, teamName);
        this.runScorced = runScorced;
        this.ballFaced = ballFaced;
    }
    public Batsman(String name, byte age, int matches, String teamName) {
        super(name, age, matches, teamName);
    }
    public float calStrikeRate() {
        return ( float) ( this.runScorced*100)/(this.ballFaced);
    }
    @Override
    public String toString() {
        return "Batsman : Runs=" + runScorced + ", ball Faced=" + ballFaced + ", StrikeRate=" + calStrikeRate()
                + ", Name=" + getName() + ", Age=" + getAge() + ", Matches=" + getMatches()
                + ", Team Name=" + getTeamName();
    }
	@Override
	public double calAverage() {
		// TODO Auto-generated method stub
		return 0;
	}
}
