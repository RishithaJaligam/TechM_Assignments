package TechM;
import java.util.Scanner;
public class AutonomusCar {
	 private int carId;
	    private String brand;
	    private int TestsConducted;
	    private int TestsPassed;
	    private String environment;
	    private String grade;
	    public AutonomusCar(int carId, String brand, int TestsConducted, int TestsPassed, String environment) {
	        this.carId = carId;
	        this.brand = brand;
	        this.TestsConducted = TestsConducted;
	        this.TestsPassed = TestsPassed;
	        this.environment = environment;
	    }

	    public int getCarId() {
	        return carId;
	    }

	    public void setCarId(int carId) {
	        this.carId = carId;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public int getTestsConducted() {
	        return TestsConducted;
	    }
	    public void setTestsConducted(int TestsConducted) {
	        this.TestsConducted = TestsConducted;
	    }

	    public int getTestsPassed() {
	        return TestsPassed;
	    }

	    public void setTestsPassed(int TestsPassed) {
	        this.TestsPassed = TestsPassed;
	    }

	    public String getEnvironment() {
	        return environment;
	    }

	    public void setEnvironment(String environment) {
	        this.environment = environment;
	    }

	    public String getGrade() {
	        return grade;
	    }

	    public void setGrade(String grade) {
	        this.grade = grade;
	    }
	}
class Solution_Autonomous_car {
	 public static int findTestPassedByEnv(AutonomusCar[] cars, String environment) {
	        int totalPassed = 0;
	        for (AutonomusCar car : cars) {
	            if (car.getEnvironment().equalsIgnoreCase(environment)) {
	                totalPassed += car.getTestsPassed();
	            }
	        }
	        return totalPassed;
	    }

	    public static AutonomusCar updateCarGrade(AutonomusCar[] cars, String brand) {
	        for (AutonomusCar car : cars) {
	            if (car.getBrand().equalsIgnoreCase(brand)) {
	                int rating = (car.getTestsPassed() * 100) / car.getTestsConducted();
	                if (rating >= 80) {
	                    car.setGrade("A1");
	                } else {
	                    car.setGrade("B2");
	                }
	                return car;
	            }
	        }
	        return null;
	    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AutonomusCar[] cars = new AutonomusCar[4];

        for (int i = 0; i < 4; i++) {
            int carId = Integer.parseInt(sc.nextLine());
            String brand = sc.nextLine();
            int TestsConducted = Integer.parseInt(sc.nextLine());
            int TestsPassed = Integer.parseInt(sc.nextLine());
            String environment = sc.nextLine();

            cars[i] = new AutonomusCar(carId, brand, TestsConducted, TestsPassed, environment);
        }
        String searchEnvironment = sc.nextLine();
        String searchBrand = sc.nextLine();

        int passedCount = findTestPassedByEnv(cars, searchEnvironment);
        if (passedCount > 0) {
            System.out.println(passedCount);
        } else {
            System.out.println("There are no tests passed in this particular environment");
        }

        AutonomusCar updatedCar = updateCarGrade(cars, searchBrand);
        if (updatedCar != null) {
            System.out.println(updatedCar.getBrand() + "::" + updatedCar.getGrade());
        } else {
            System.out.println("No Car is available with the specified brand");
        }

        sc.close();
    }
}
