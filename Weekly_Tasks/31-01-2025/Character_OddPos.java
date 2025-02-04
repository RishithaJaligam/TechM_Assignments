package TechM;

import java.util.Scanner;

public class Character_OddPos {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		StringBuilder res=new StringBuilder();
		for(int i=1;i<s.length();i=i+2)
		{
			res.append(s.charAt(i));
		}
		System.out.println(res.toString());
}
}
