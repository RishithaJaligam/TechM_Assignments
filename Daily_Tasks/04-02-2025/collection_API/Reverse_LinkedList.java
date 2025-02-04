package collection_API;

import java.util.LinkedList;
import java.util.Scanner;

public class Reverse_LinkedList {
	public static void main(String args[])
	{
	LinkedList <Integer> a=new LinkedList<Integer>();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);	
	System.out.println("Original list"+a);
	for(int i=a.size()-1;i>0;i--)
		System.out.println("Reversed list "+" "+a.get(i));
}
}