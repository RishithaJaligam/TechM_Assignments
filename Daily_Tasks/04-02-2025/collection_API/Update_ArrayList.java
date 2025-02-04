package collection_API;

import java.util.ArrayList;
import java.util.Scanner;

public class Update_ArrayList {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList <Integer> a=new ArrayList<Integer>();
		a.add(101);
		a.add(200);
		a.add(301);
		a.add(400);
		a.add(501);
		System.out.println("Original list :"+a);
		System.out.println("Enter the element to update");
		int n=sc.nextInt();
		a.set(2, n);
		System.out.println("Updated list :"+a);
		
}
}
