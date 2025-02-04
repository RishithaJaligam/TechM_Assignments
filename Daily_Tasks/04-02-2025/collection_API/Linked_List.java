package collection_API;

import java.util.LinkedList;
import java.util.Scanner;

public class Linked_List {
	public static void main(String args[])
	{
		
	    Scanner sc=new Scanner(System.in);
		LinkedList <Integer> a=new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println("Original List"+a);
		System.out.println("Enter element at end of the list");
		int n=sc.nextInt();
		a.add(n);
		System.out.println(a);
}
}
