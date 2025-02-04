package collection_API;

import java.util.ArrayList;
import java.util.Scanner;
public class Retrieve_Element {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		ArrayList <Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println("Enter the index to retrieve element");
		int i=sc.nextInt();
		System.out.println("Element at index"+" "+i+" "+"is"+" "+a.get(i));
}
}