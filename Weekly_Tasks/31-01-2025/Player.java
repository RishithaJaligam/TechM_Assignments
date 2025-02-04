package TechM;
import java.util.*;
public class Player {
	 private int playerId;
	    private String skill;
	    private String level;
	    private int points;

	    public Player(int playerId, String skill, String level, int points) {
	        this.playerId = playerId;
	        this.skill = skill;
	        this.level = level;
	        this.points = points;
	    }

	    public int getPlayerId() { 
	    	return playerId; 
	    }
	    public void setPlayerId(int playerId) { 
	    	this.playerId = playerId; 
	    }

	    public String getSkill() { 
	    	return skill; 
	    }
	    public void setSkill(String skill) { 
	    	this.skill = skill; 
	    }

	    public String getLevel() {
	    	return level;
	    }
	    public void setLevel(String level) { 
	    	this.level = level; 
	    }

	    public int getPoints() {
	    	return points; 
	    }
	    public void setPoints(int points) { 
	    	this.points = points;
	    }
	}
class Solution_Player {
    public static int findPoints(Player[] players, String skill) {
        int totalPoints = 0;
        for (Player player : players) {
            if (player.getSkill().equalsIgnoreCase(skill)) {
                totalPoints += player.getPoints();
            }
        }
        return totalPoints;
    }

    public static Player getPlayer(Player[] players, String level, String skill) {
        for (Player player : players) {
            if (player.getLevel().equalsIgnoreCase(level) &&
                player.getSkill().equalsIgnoreCase(skill) &&
                player.getPoints() >= 20) {
                return player;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[4];

        for (int i = 0; i < 4; i++) {
            int playerId = sc.nextInt();
            sc.nextLine(); 
            String skill = sc.nextLine();
            String level = sc.nextLine();
            int points = sc.nextInt();
            sc.nextLine(); 

            players[i] = new Player(playerId, skill, level, points);
        }

        String skillParam = sc.nextLine();
        String levelParam = sc.nextLine();

        int totalPoints = findPoints(players, skillParam);
        if (totalPoints > 0) {
            System.out.println(totalPoints);
        } else {
            System.out.println("The given Skill is not available");
        }

        Player player = getPlayer(players, levelParam, skillParam);
        if (player != null) {
            System.out.println(player.getPlayerId());
        } else {
            System.out.println("No player is available with specified level, skill and eligibility points");
        }
        sc.close();
    }
}
