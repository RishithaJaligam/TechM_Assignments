package org.anurag;

import java.util.Scanner;

public class Task5 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i=i+2)
		{
			ch[i]=Character.toUpperCase(s.charAt(i));
		}
	    System.out.println(new String(ch));
	 }
	}


