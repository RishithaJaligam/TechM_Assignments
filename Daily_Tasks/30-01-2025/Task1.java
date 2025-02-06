package org.anurag;
import java.util.*;
public class Task1 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a1[] = { 10, 20, 30, 40, 50};
	int a2[] = { 100,200,300,400,500};
	for(int i=0;i<a1.length;i=i+2)
		System.arraycopy(a1, i, a2, i, 1);
	for(int i=0;i<a2.length;i++) 
		System.out.println(a2[i]);
 }
}

