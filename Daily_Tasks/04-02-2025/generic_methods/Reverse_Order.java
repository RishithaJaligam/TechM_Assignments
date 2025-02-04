package generic_methods;

import java.util.Arrays;
import java.util.List;

public class Reverse_Order {
	public static <T> void displayReverseOrder(List<T> list) {
        for (int i =  list.size()-1; i>=0; i--) {
        	{
                System.out.print(list.get(i)+" ");
            }
        }  
}
	public static void main(String args[])
	{
		List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 3);
	    displayReverseOrder(a);
}
}
