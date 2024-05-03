package CricketPlayerStats;
public abstract class CricketPlayer {
    private String name;
    private byte age;
    private int matches;
    private String teamName;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public int getMatches() {
        return matches;
    }
    public void setMatches(int matches) {
        this.matches = matches;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public CricketPlayer(String name, byte age, int matches, String teamName) {
        super();
        this.name = name;
        this.age = age;
        this.matches = matches;
        this.teamName = teamName;
    }
    public CricketPlayer() {
        super();
    }
    public abstract double calAverage();
}
