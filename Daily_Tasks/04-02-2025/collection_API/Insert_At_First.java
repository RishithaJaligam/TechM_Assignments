package collection_API;

import java.util.ArrayList;

public class Insert_At_First {
	public static void main(String args[])
	{
		ArrayList <Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(0,6);
		
		System.out.println(a);
}
}