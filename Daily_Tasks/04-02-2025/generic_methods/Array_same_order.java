package generic_methods;
import java.util.Arrays;
public class Array_same_order {
	 public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
	        if (array1 == null && array2 == null) {
	            return true;
	        }
	        if (array1 == null || array2 == null) {
	            return false;
	        }
	        if (array1.length != array2.length) {
	            return false;
	        }
	        for (int i = 0; i < array1.length; i++) {
	            if (!array1[i].equals(array2[i])) {
	                return false;
	            }
	        }
	        return true;
	 }
	 public static void main(String[] args) {
	        Integer[] inta1 = {1, 2, 3, 4, 5};
	        Integer[] inta2 = {1, 2, 3, 4, 5};
	        Integer[] inta3 = {1, 2, 3, 4, 6};

	        System.out.println("Comparing inta1 and inta2: " + areArraysEqual(inta1, inta2));
	        System.out.println("Comparing inta1 and inta3: " + areArraysEqual(inta1, inta3)); 
	        String[] stra1 = {"apple", "banana", "cherry"};
	        String[] stra2 = {"apple", "banana", "cherry"};
	        String[] stra3 = {"apple", "banana", "grape"};
	        System.out.println("Comparing stra1 and stra2: " + areArraysEqual(stra1, stra2)); 
	        System.out.println("Comparing stra1 and stra3: " + areArraysEqual(stra1, stra3));
	    }
}
