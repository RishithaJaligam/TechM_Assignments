package TechM;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Get_Medicine_price {
	private String medName;
    private String batch;
    private String disease;
    private int price;
    public Get_Medicine_price(String medName, String batch, String disease, int price) {
        this.medName = medName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }
    public String getDisease() {
        return disease;
    }

    public int getPrice() {
        return price;
    }
}
class Solution_Price_Medicine {
    public static Integer[] getPriceByDisease(Get_Medicine_price[] medicines, String disease) {
        List<Integer> prices = new ArrayList<>();
        for (Get_Medicine_price medicine : medicines) {
            if (medicine.getDisease().equalsIgnoreCase(disease)) {
                prices.add(medicine.getPrice());
            }
        }
        Collections.sort(prices);
        return prices.toArray(new Integer[0]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Get_Medicine_price[] medicines = new Get_Medicine_price[4];

        for (int i = 0; i < 4; i++) {
            medicines[i] = new Get_Medicine_price(sc.next(), sc.next(), sc.next(), sc.nextInt());
        }
 String searchDisease = sc.next();
        
        Integer[] result = Solution_Price_Medicine.getPriceByDisease(medicines, searchDisease);
        for (int price : result) {
            System.out.println(price);
        }
        
        sc.close();

    }
}
