package TechM;
import java.util.*;
public class Sim_Sort {
    private int id;
    private String company;
    private int balance;
    private double ratePerSecond;
    private String circle;

    public Sim_Sort(int id, String company, int balance, double ratePerSecond, String circle) {
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}
class Solution_SimSort {
	
	 public static Sim_Sort[] matchAndSort(Sim_Sort[] sims, String searchCircle, double searchRate) {
	        List<Sim_Sort> matchedSims = new ArrayList<>();

	        for (Sim_Sort sim : sims) {
	            if (sim.getCircle().equalsIgnoreCase(searchCircle) && searchRate > sim.getRatePerSecond()) {
	                matchedSims.add(sim);
	            }
	        }

	        matchedSims.sort((s1, s2) -> Integer.compare(s2.getBalance(), s1.getBalance()));

	        return matchedSims.toArray(new Sim_Sort[0]);
	    }
	 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sim_Sort[] sims = new Sim_Sort[4];
        for (int i = 0; i < 4; i++) {
            int id = Integer.parseInt(sc.nextLine());
            String company = sc.nextLine();
            int balance = Integer.parseInt(sc.nextLine());
            double ratePerSecond = Double.parseDouble(sc.nextLine());
            String circle = sc.nextLine();

            sims[i] = new Sim_Sort(id, company, balance, ratePerSecond, circle);
        }

        String searchCircle = sc.nextLine();
        double searchRate = Double.parseDouble(sc.nextLine());

        Sim_Sort[] result = matchAndSort(sims, searchCircle, searchRate);

        for (Sim_Sort sim : result) {
            System.out.println(sim.getId());
        }

        sc.close();
    }
    
}
