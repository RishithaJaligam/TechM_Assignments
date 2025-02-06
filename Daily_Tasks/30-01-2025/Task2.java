package org.anurag;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of Students");
	int n=sc.nextInt();
	String sname[]=new String[n];
	for(int i=0;i<n;i++) {
	     System.out.println("Enter Student"+ (i+1)+"name");
	     sname[i]=sc.next();    }
	   int marks[][]=new int[n][3];
	    for(int i=0;i<n;i++)
	    {
	      for(int j=0;j<3;j++)
	      {
	       System.out.println("Enter Student "+ (i+1) +" sub"+ (j+1) + "marks");
	       marks[i][j]=sc.nextInt();
	       }
	    }
	      int total[]= new int[n];
	      int avg[]=new int[n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<3;j++)
			{
				 total[i]+=marks[i][j];
			}
			avg[i]=total[i]/3;
		}
		Arrays.sort(avg);
		for(int i=0;i<n;i++)
		System.out.println("Average marks of Student "+(i+1) +avg[i]);
	  
}
}
