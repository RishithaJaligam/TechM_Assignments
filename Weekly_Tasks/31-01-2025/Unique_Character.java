package TechM;

import java.util.Scanner;

public class Unique_Character {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.next();
		boolean[] visited=new boolean[256];
		StringBuilder res=new StringBuilder();
		for(char c:s.toCharArray())
		{
			if(!visited[c])
			{
				visited[c]=true;
				res.append(c);
			}
		}
		System.out.println(res.toString());
	}
}
