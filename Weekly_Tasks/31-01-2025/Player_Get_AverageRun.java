package TechM;
import java.util.*;
public class Player_Get_AverageRun {
	private int id;
    private String name;
    private int iccRank;
    private int matchesPlayed;
    private int runsScored;

    public Player_Get_AverageRun(int id, String name, int iccRank, int matchesPlayed, int runsScored) {
        this.id = id;
        this.name = name;
        this.iccRank = iccRank;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }
    public int getId() { 
    	return id;
    }
    public void setId(int id) { 
    	this.id = id;
    }

    public String getName() {
    	return name; 
    }
    public void setName(String name) { 
    	this.name = name; 
    }

    public int getIccRank() { 
    	return iccRank;
    }
    public void setIccRank(int iccRank) { 
    	this.iccRank = iccRank; 
    }

    public int getMatchesPlayed() { 
    	return matchesPlayed; 
    }
    public void setMatchesPlayed(int matchesPlayed) {
    	this.matchesPlayed = matchesPlayed; 
    }

    public int getRunsScored() { 
    	return runsScored;
    }
    public void setRunsScored(int runsScored) { 
    	this.runsScored = runsScored;
    }
}
class Solution_Player_run {
    public static double[] findAverageOfRuns(Player_Get_AverageRun[] players, int target) {
        List<Double> averages = new ArrayList<>();

        for (Player_Get_AverageRun player : players) {
            if (player.getMatchesPlayed() >= target) {
                double average = (double) player.getRunsScored() / player.getMatchesPlayed();
                averages.add(average);
            }
        }

        double[] result = new double[averages.size()];
        for (int i = 0; i < averages.size(); i++) {
            result[i] = averages.get(i);
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player_Get_AverageRun[] players = new Player_Get_AverageRun[4];

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();  // Consume newline
            String name = sc.nextLine();
            int iccRank = sc.nextInt();
            int matchesPlayed = sc.nextInt();
            int runsScored = sc.nextInt();

            players[i] = new Player_Get_AverageRun(id, name, iccRank, matchesPlayed, runsScored);
        }

        int target = sc.nextInt();
        double[] averages = Solution_Player_run.findAverageOfRuns(players, target);

        for (double avg : averages) {
            if (avg >= 80 && avg <= 100) {
                System.out.println("Grade A");
            } else if (avg >= 50 && avg <= 79) {
                System.out.println("Grade B");
            } else {
                System.out.println("Grade C");
            }
        }
}
}
