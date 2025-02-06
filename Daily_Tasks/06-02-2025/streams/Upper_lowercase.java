package streams;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class Upper_lowercase {
	 public static void main(String[] args) {
		    List <String> fruits = Arrays.asList("Mango","BaNana","graPes","appLe","Kiwi");
		    System.out.println("List of strings: " +fruits);
		    List <String> uppercase = fruits.stream()
		      .map(String::toUpperCase)
		      .collect(Collectors.toList());

		    System.out.println("\nUppercase Strings: " + uppercase);
		    List < String > lowercase = fruits.stream()
		      .map(String::toLowerCase)
		      .collect(Collectors.toList());
		    System.out.println("Lowercase Strings: " + lowercase);
		  }
		}

