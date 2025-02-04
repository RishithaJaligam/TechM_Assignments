package TechM;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Associates {
	 private int id;
	 private String name, technology;
	 private int expInYears;
     public Associates(int id, String name, String technology, int expInYears) {
         this.id = id;
         this.name = name;
         this.technology = technology;
         this.expInYears = expInYears;
     }
     public int getId() {
         return id;
     }
     public String getName() {
         return name;
     }

     public String getTechnology() {
         return technology;
     }

     public int getExpInYears() {
         return expInYears;
     }
}
 class Solution{
	 public static Associates[] associatesForGivenTechnology(Associates[] associates, String searchTechnology) {
	        List<Associates> result = new ArrayList<>();
	        for (Associates associate : associates) {
	            if (associate.getTechnology().equalsIgnoreCase(searchTechnology)
	                    && associate.getExpInYears() % 5 == 0) {
	                result.add(associate);
	            }
	        }
	        return result.toArray(new Associates[0]);
	    }
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Associates[] associates = new Associates[5];

	        for (int i = 0; i < 5; i++) {
	            associates[i] = new Associates(sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
	        }

	        Associates[] filteredAssociates = Solution.associatesForGivenTechnology(associates, sc.next());

	        for (Associates associate : filteredAssociates) {
	            System.out.println(associate.getId());
	        }
	        sc.close();
	 }

 }

