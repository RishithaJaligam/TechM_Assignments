package collection_API;

import java.util.ArrayList;
import java.util.Scanner;

public class Search_Element {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList <Integer> a=new ArrayList<Integer>();
		a.add(101);
		a.add(200);
		a.add(301);
		a.add(400);
		a.add(501);
		System.out.println(a);
		System.out.println("Enter the element to search");
		int n=sc.nextInt();
		boolean flag=false;
		int index=0;
		for(int i=0;i<a.size();i++)
		{
		if(a.get(i)==n)
		{ flag=true;
		   index=i;
		}
		}
		
		if(flag)
		System.out.println("Element"+" "+n+" "+" Present at Index:"+index);
		else
		System.out.println("Element not found");
}
}
