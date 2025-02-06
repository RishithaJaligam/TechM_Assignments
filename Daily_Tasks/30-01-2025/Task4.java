package org.anurag;

import java.util.*;

public class Task4 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	int[] a = {1,2,3,4,5,6,7};
    int[] b = Arrays.copyOfRange(a, 0, a.length);      
    System.out.println("destination1 = " + Arrays.toString(b));
    int[] a1 = Arrays.copyOfRange(a, 2, 5); 
    System.out.println("destination2 = " + Arrays.toString(a1)); 
	}
	
}
