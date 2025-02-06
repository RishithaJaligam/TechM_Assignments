package streams;
import java.util.Arrays;
import java.util.List;
public class Sum_Even_odd {
	public static void main(String[] args) {
	    List <Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	    int evensum = numbers.stream()
	      .filter(num -> num % 2 == 0)
	      .mapToInt(Integer::intValue)
	      .sum();
	    System.out.println("Sum of even numbers: " + evensum);
	    int oddsum = numbers.stream()
	      .filter(num -> num % 2 != 0)
	      .mapToInt(Integer::intValue)
	      .sum();
	    System.out.println("Sum of odd numbers: " + oddsum);
	  }
	}

	