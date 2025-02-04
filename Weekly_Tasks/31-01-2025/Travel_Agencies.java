package TechM;
import java.util.*;
public class Travel_Agencies {
	 private int regNo;
	    private String agencyName;
	    private String packageType;
	    private int price;
	    private boolean flightFacility;

	    public Travel_Agencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
	        this.regNo = regNo;
	        this.agencyName = agencyName;
	        this.packageType = packageType;
	        this.price = price;
	        this.flightFacility = flightFacility;
	    }

	    public int getRegNo() {
	    	return regNo; 
	    }
	    public void setRegNo(int regNo) { 
	    	this.regNo = regNo;
	    }

	    public String getAgencyName() { 
	    	return agencyName; 
	    }
	    public void setAgencyName(String agencyName) {
	    	this.agencyName = agencyName; 
	    }

	    public String getPackageType() {
	    	return packageType; 
	    }
	    public void setPackageType(String packageType) { 
	    	this.packageType = packageType; 
	    }

	    public int getPrice() { 
	    	return price;
	    }
	    public void setPrice(int price) { 
	    	this.price = price; 
	    }

	    public boolean isFlightFacility() { 
	    	return flightFacility;
	    }
	    public void setFlightFacility(boolean flightFacility) { 
	    	this.flightFacility = flightFacility;
	    }
	}
class Solution_Agency {
public static int findAgencyWithHighestPackagePrice(Travel_Agencies[] agencies) {
    int highestPrice = 0;
    for (Travel_Agencies agency : agencies) {
        if (agency.getPrice() > highestPrice) {
            highestPrice = agency.getPrice();
        }
    }
    return highestPrice;
}

public static Travel_Agencies agencyDetailsForGivenIdAndType(Travel_Agencies[] agencies, int regNo, String packageType) {
    for (Travel_Agencies agency : agencies) {
        if (agency.isFlightFacility() && agency.getRegNo() == regNo && agency.getPackageType().equalsIgnoreCase(packageType)) {
            return agency;
        }
    }
    return null;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Travel_Agencies[] agencies = new Travel_Agencies[4];

    for (int i = 0; i < 4; i++) {
        int regNo = sc.nextInt();
        sc.nextLine(); 
        String agencyName = sc.nextLine();
        String packageType = sc.nextLine();
        int price = sc.nextInt();
        boolean flightFacility = sc.nextBoolean();
        sc.nextLine();

        agencies[i] = new Travel_Agencies(regNo, agencyName, packageType, price, flightFacility);
    }

    int regNo = sc.nextInt();
    sc.nextLine();
    String packageType = sc.nextLine();

    int highestPrice = findAgencyWithHighestPackagePrice(agencies);
    System.out.println(highestPrice);

    Travel_Agencies resultAgency = agencyDetailsForGivenIdAndType(agencies, regNo, packageType);
    if (resultAgency != null) {
        System.out.println(resultAgency.getAgencyName() + ":" + resultAgency.getPrice());
    }
}
}
