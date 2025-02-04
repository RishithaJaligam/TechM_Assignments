package collection_API;

import java.util.LinkedList;

public class Iterate_LinkedList {
	public static void main(String args[])
	{
		LinkedList <Integer> a=new LinkedList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);	
		System.out.println("Linked List elements");
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
}
}
