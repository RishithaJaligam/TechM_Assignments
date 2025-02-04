package collection_API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Shuffle_List {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList <Integer> a=new ArrayList<Integer>();
		a.add(101);
		a.add(250);
		a.add(30);
		a.add(20);
		a.add(501);
		System.out.println("The suffled arrayList is "+a);
		Collections.shuffle(a);
		System.out.println("The suffled arrayList is "+a);
}
}
