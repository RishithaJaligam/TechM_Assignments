package collection_API;

import java.util.ArrayList;

public class Iterate_ArrayList {
	public static void main(String args[])
	{
		ArrayList <String> a=new ArrayList<String>();
		a.add("pink");
		a.add("red");
		a.add("yellow");
		a.add("green");
		a.add("white");
		for(int i=0;i<a.size();i++)
		System.out.println(a.get(i));
	}
}
