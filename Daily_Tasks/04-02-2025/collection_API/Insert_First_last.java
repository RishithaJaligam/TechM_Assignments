package collection_API;

import java.util.LinkedList;
import java.util.Scanner;

public class Insert_First_last {
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
	a.addFirst(100);
	a.addLast(800);
	System.out.println("Updated list"+a);
}
}