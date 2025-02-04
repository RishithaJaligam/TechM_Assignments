package collection_API;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove_Third {
	public static void main(String args[])
	{
		
		ArrayList <Integer> a=new ArrayList<Integer>();
		a.add(101);
		a.add(200);
		a.add(301);
		a.add(400);
		a.add(501);
		System.out.println("Original list :"+a);
		a.remove(2);
		System.out.println("Updated list after removing third element :"+a);
}
}