package CricketPlayerStats;
public class Stats {
    public static void main(String[] args) {
        Batsman bat1 = new Batsman("MS Dhoni", (byte)40,200,"India",5000,3000);
        Batsman bat2 = new Batsman("Virat Kohli", (byte)37,160,"India",4000,2500);
        Batsman[] batsmanArray= {bat1,bat2};
        for(Batsman player : batsmanArray) 
            System.out.println(player + "\n" );
        Bowler ball1= new Bowler("Deepak Chahar", (byte)32,100,"India",2400,150,1700);
        Bowler ball2= new Bowler("Ashish Nehra", (byte)30,170,"India",5000,270,3500);  
        Bowler[] bowlerArray= {ball1,ball2};
        for(Bowler player : bowlerArray) 
            System.out.println(player +"\n");
    }
}