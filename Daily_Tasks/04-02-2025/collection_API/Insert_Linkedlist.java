package collection_API;

import java.util.LinkedList;
import java.util.Scanner;

public class Insert_Linkedlist {
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
	System.out.println("Enter a specified position to insert into linkedlist");
	int n=sc.nextInt();
	System.out.println("Enter a specified element to insert into specified");
	int b=sc.nextInt();
	a.add(n,b);
	System.out.println("Updated list"+a);
}
}