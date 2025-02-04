package TechM;

import java.util.Scanner;

public class Reverse_String {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.next();
		char ch[]=new char[s.length()];
		for(int j=0,i=s.length()-1;i>=0;i--,j++)
		{
			ch[j]=s.charAt(i);
		}
		System.out.println(new String(ch).toLowerCase());
}
}