package org.anurag;

import java.util.*;

public class Task3 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		System.out.println(Arrays.equals(a, b)); //True
		Object[] a1= {a};
		Object[] a2= {b};
		System.out.println(Arrays.equals(a1, a2));  //false
		System.out.println(Arrays.deepEquals(a1, a2)); //True
    
}
}