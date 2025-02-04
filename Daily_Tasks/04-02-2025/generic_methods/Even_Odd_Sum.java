package generic_methods;
import java.util.*;
public class Even_Odd_Sum {
	public static  <T extends Number> void calculateSum(T[] num)
	{
		Integer evensum=0;
		Integer oddsum=0;
		 for (T n:num) {
		      if (n.intValue() % 2 == 0) {
		        evensum +=n.intValue();
		      } else {
		        oddsum += n.intValue();
		      }
		    }
		 System.out.println("Even Sum:"+ evensum);
		 System.out.println("Even Sum:"+ oddsum);
		 
	}
	 public static void main(String[] args) {
	        Integer[] a = {1,2,3,4,5,6,7,8};
	        calculateSum(a);
	       
	 }	        
}
