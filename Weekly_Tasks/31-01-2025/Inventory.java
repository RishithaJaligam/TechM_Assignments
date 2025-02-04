package TechM;
import java.util.*;
public class Inventory {
	private String inventId;
    private int maxQuantity;
    private int curQuantity;
    private int threshold;

    public Inventory(String inventId, int maxQuantity, int curQuantity, int threshold) {
        this.inventId = inventId;
        this.maxQuantity = maxQuantity;
        this.curQuantity = curQuantity;
        this.threshold = threshold;
    }

    public String getInventId() {
        return inventId;
    }

    public void setInventId(String inventId) {
        this.inventId = inventId;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public int getCurQuantity() {
        return curQuantity;
    }

    public void setCurQuantity(int curQuantity) {
        this.curQuantity = curQuantity;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
}
 class Solution_Inventory {
	public static Inventory[] replenish(Inventory[] inventories, int limit) {
        List<Inventory> result = new ArrayList<>();
        for (Inventory inventory : inventories) {
            if (limit <= inventory.getThreshold()) {
                result.add(inventory);
            }
        }
        return result.toArray(new Inventory[0]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Inventory[] inventories = new Inventory[4];
        for (int i = 0; i < 4; i++) {
            String inventId = sc.next();
            int maxQuantity = sc.nextInt();
            int curQuantity = sc.nextInt();
            int threshold = sc.nextInt();
            inventories[i] = new Inventory(inventId, maxQuantity, curQuantity, threshold);
        }

        int limit = sc.nextInt();

        Inventory[] replenishedInventories = replenish(inventories, limit);

        for (Inventory inventory : replenishedInventories) {
            System.out.print(inventory.getInventId() + " ");
            if (inventory.getThreshold() > 75) {
                System.out.println("Critical Filling");
            } else if (inventory.getThreshold() >= 50 && inventory.getThreshold() <= 75) {
                System.out.println("Moderate Filling");
            } else {
                System.out.println("Non-Critical Filling");
            }
        }

        sc.close();
    }
}
