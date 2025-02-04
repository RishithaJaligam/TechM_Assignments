package generic_methods;
import java.util.*;
public class Target_Element {
	 public static <T> int findFirstIndex(List<T> list, T target) {
	        for (int i = 0; i < list.size(); i++) {
	            if (list.get(i)==target) {
	                return i;
	            }
	        }
	        return -1;
	    }

public static void main(String args[])
{
	List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 3);
	int target=5;
    int index = findFirstIndex(a, 3);
    System.out.println("Index of "+" "+target+" in List: " + index);
}
}
