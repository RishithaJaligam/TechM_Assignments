package TechM;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Sim_Transfer {
	 private int simId;
	    private String customerName;
	    private double balance;
	    private double ratePerSecond;
	    private String circle;

	    public Sim_Transfer(int simId, String customerName, double balance, double ratePerSecond, String circle) {
	        this.simId = simId;
	        this.customerName = customerName;
	        this.balance = balance;
	        this.ratePerSecond = ratePerSecond;
	        this.circle = circle;
	    }
	    public int getSimId() {
	        return simId;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public double getRatePerSecond() {
	        return ratePerSecond;
	    }

	    public String getCircle() {
	        return circle;
	    }
	    public void setCircle(String circle) {
	        this.circle = circle;
	    }
	}
class Solution_Sim {
    public static Sim_Transfer[] transferCircle(Sim_Transfer[] sims, String circle1, String circle2) {
        List<Sim_Transfer> filteredSims = new ArrayList<>();
        for (Sim_Transfer sim : sims) {
            if (sim.getCircle().equalsIgnoreCase(circle1)) {
                sim.setCircle(circle2);
                filteredSims.add(sim);
            }
        }
        filteredSims.sort((s1, s2) -> Double.compare(s2.getRatePerSecond(), s1.getRatePerSecond()));
        return filteredSims.toArray(new Sim_Transfer[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim_Transfer[] sims = new Sim_Transfer[5];
        for (int i = 0; i < 5; i++) {
            sims[i] = new Sim_Transfer(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next());
        }

        String circle1 = sc.next();
        String circle2 = sc.next();

        Sim_Transfer[] result = Solution_Sim.transferCircle(sims, circle1, circle2);
        for (Sim_Transfer sim : result) {
            System.out.println(sim.getSimId() + " " + sim.getCustomerName() + " " + sim.getCircle() + " "
                    + sim.getRatePerSecond());
        }

        sc.close();
    }

}
