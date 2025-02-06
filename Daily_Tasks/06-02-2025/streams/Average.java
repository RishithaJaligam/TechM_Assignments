package streams;
import java.util.*;

public class Average {
	public static void main(String[] args) {
	    List<Integer>a = Arrays.asList(1,2,3,4,5,6,7,8);
	    System.out.println("List of numbers: " +a);
	    double avg = a.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
	    System.out.println("Average : " + avg);
}
}
