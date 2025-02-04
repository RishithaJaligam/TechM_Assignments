package collection_API;

import java.util.ArrayList;
import java.util.Scanner;

public class Copy_list {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList <Integer> a=new ArrayList<Integer>();
		ArrayList <Integer> b=new ArrayList<Integer>();
		a.add(101);
		a.add(250);
		a.add(30);
		a.add(20);
		a.add(501);
		b.addAll(a);
		System.out.println("The copied arrayList is "+b);
}
}
