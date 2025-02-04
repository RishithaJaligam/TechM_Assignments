package collection_API;

import java.util.LinkedList;
import java.util.Scanner;

public class Insert_Some_elements {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	LinkedList <Integer> a=new LinkedList<Integer>();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);	
	System.out.println("Original list"+a);
	System.out.println("Enter the position ,element to insert");
	int i=sc.nextInt();
	int n=sc.nextInt();
	a.add(i,n);
	System.out.println("Updated list"+a);
}
}
