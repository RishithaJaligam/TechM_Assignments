package streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Remove_duplicates {
	 public static void main(String[] args) {
		    List < Integer > nums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
		    System.out.println("Original List: " + nums);
		    List < Integer > uniq = nums.stream()
		      .distinct()
		      .collect(Collectors.toList());
		    System.out.println("Updated List after removing duplicates" +uniq );
		  }
		}

