package collection_API;

import java.util.LinkedList;
import java.util.*;
public class Iterate_specified {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	LinkedList <Integer> a=new LinkedList<Integer>();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);	
	System.out.println(a);
	System.out.println("Enter a specified position to iterate the array");
	int n=sc.nextInt();
	for(int i=n;i<a.size();i++)
		System.out.print(a.get(i)+" ");
}
}