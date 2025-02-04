package TechM;
import java.util.Scanner;

public class Institution {
	 private int instId;
	    private String instName;
	    private int noOfStudPlaced;
	    private int noOfStudCleared;
	    private String location;
	    private String grade;
	    public Institution(int instId, String instName, int noOfStudPlaced, int noOfStudCleared, String location) {
	        this.instId = instId;
	        this.instName = instName;
	        this.noOfStudPlaced = noOfStudPlaced;
	        this.noOfStudCleared = noOfStudCleared;
	        this.location = location;
	    }

	    public int getInstId() {
	        return instId;
	    }

	    public void setInstId(int instId) {
	        this.instId = instId;
	    }

	    public String getInstName() {
	        return instName;
	    }

	    public void setInstName(String instName) {
	        this.instName = instName;
	    }

	    public int getNoOfStudPlaced() {
	        return noOfStudPlaced;
	    }

	    public void setNoOfStudPlaced(int noOfStudPlaced) {
	        this.noOfStudPlaced = noOfStudPlaced;
	    }

	    public int getNoOfStudCleared() {
	        return noOfStudCleared;
	    }

	    public void setNoOfStudCleared(int noOfStudCleared) {
	        this.noOfStudCleared = noOfStudCleared;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }

	    public String getGrade() {
	        return grade;
	    }

	    public void setGrade(String grade) {
	        this.grade = grade;
	    }
	}
class Solution_Institution {
	
	 public static int findNumClearancedByLoc(Institution[] instArray, String location) {
	        int totalCleared = 0;
	        for (Institution inst : instArray) {
	            if (inst.getLocation().equalsIgnoreCase(location)) {
	                totalCleared += inst.getNoOfStudCleared();
	            }
	        }
	        return totalCleared;
	    }

	    public static Institution updateInstitutionGrade(Institution[] instArray, String instName) {
	        for (Institution inst : instArray) {
	            if (inst.getInstName().equalsIgnoreCase(instName)) {
	                int rating = (inst.getNoOfStudPlaced() * 100) / inst.getNoOfStudCleared();
	                if (rating >= 80) {
	                    inst.setGrade("A");
	                } else {
	                    inst.setGrade("B");
	                }
	                return inst;
	            }
	        }
	        return null;
	    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Institution[] institutions = new Institution[4];

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int placed = sc.nextInt();
            int cleared = sc.nextInt();
            String location = sc.next();

            institutions[i] = new Institution(id, name, placed, cleared, location);
        }
        String searchLocation = sc.next();
        String searchInstitutionName = sc.next();

        int clearedCount = findNumClearancedByLoc(institutions, searchLocation);
        if (clearedCount > 0) {
            System.out.println(clearedCount);
        } else {
            System.out.println("There are no cleared students in this particular location");
        }

        Institution updatedInstitution = updateInstitutionGrade(institutions, searchInstitutionName);
        if (updatedInstitution != null) {
            System.out.println(updatedInstitution.getInstName() + "::" + updatedInstitution.getGrade());
        } else {
            System.out.println("No Institute is available with the specified name");
        }

        sc.close();
    }
}
