package TechM;

import java.util.Scanner;

public class Last_char {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder res=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				if(Character.isAlphabetic(s.charAt(i-1)))
				  res.append(s.charAt(i-1));
			if(i==s.length()-1)
				if(Character.isAlphabetic(s.charAt(i)))
					res.append(s.charAt(i));
		}
		System.out.println(res.toString());
}
}
