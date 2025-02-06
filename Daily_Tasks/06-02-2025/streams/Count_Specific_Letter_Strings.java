package streams;
import java.util.*;
import java.util.List;
public class Count_Specific_Letter_Strings {
	 public static void main(String[] args) {
	        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "avocado");
	        char target = 'a';
	        System.out.println("List:" +words);
	        long count = words.stream()
	                          .filter(word -> word.startsWith(String.valueOf(target)))
	                          .count();
	        System.out.println("Number of words starting with '" + target + "': " + count);
	    }
}
