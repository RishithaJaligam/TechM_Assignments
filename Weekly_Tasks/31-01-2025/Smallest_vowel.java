package TechM;

import java.util.Scanner;

public class Smallest_vowel {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.next();
		char c='t';
		char small;
		for(int i=0;i<s.length();i++)
		{
			if("aeiou".indexOf(s.charAt(i))!=-1)
			{
			   small=s.charAt(i);
			   if(small<c)
				   c=small;
		}
		}
		System.out.println(c);
	}
}
