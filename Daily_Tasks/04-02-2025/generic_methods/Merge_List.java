package generic_methods;

import java.util.Arrays;
import java.util.*;
public class Merge_List {
	public static void main(String args[])
	{
		List<Integer> a1 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> a2 = Arrays.asList(7,8,9,10,11,12,13,14);
		List<Integer> res= new ArrayList<Integer>();
		
		for(int i=0;i<a1.size();i++)
		{
			res.add(a1.get(i));
			res.add(a2.get(i));
		}
		if(a1.size()>a2.size())
		    for(int i=a2.size();i<a1.size();i++)
		    	 res.add(a1.get(i));
		else
			for(int i=a1.size();i<a2.size();i++)
		    	 res.add(a2.get(i));
		for(int i=0;i<res.size();i++)
		{
			System.out.println(res.get(i));
		}
		
	}	
		
}
