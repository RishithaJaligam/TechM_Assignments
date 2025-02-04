package collection_API;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Array_List_Sort {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList <Integer> a=new ArrayList<Integer>();
		a.add(101);
		a.add(250);
		a.add(30);
		a.add(20);
		a.add(501);
		Collections.sort(a);
		System.out.println("The Sorted array is :"+a);
}
}