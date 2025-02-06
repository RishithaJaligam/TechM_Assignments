package org.anurag;
import java.util.*;
public class Task1 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	//Task 1
	
//	int a1[] = { 10, 20, 30, 40, 50};
//	int a2[] = { 100,200,300,400,500};
//	for(int i=0;i<a1.length;i=i+2)
//		System.arraycopy(a1, i, a2, i, 1);
//	for(int i=0;i<a2.length;i++) 
//		System.out.println(a2[i]);
//	
	
	//Task 2
	
//	System.out.println("Enter number of Students");
//	int n=sc.nextInt();
//    String sname[]=new String[n];
//    for(int i=0;i<n;i++) {
//     System.out.println("Enter Student"+ (i+1)+"name");
//     sname[i]=sc.next();
//    }
//    int marks[][]=new int[n][3];
//    for(int i=0;i<n;i++)
//    {
//      for(int j=0;j<3;j++)
//      {
//       System.out.println("Enter Student "+ (i+1) +" sub"+ (j+1) + "marks");
//       marks[i][j]=sc.nextInt();
//    }
//    }
//      int total[]= new int[n];
//      int avg[]=new int[n];
//	for(int i=0;i<n;i++)
//	{
//		for(int j=0;j<3;j++)
//		{
//			 total[i]+=marks[i][j];
//		}
//		avg[i]=total[i]/3;
//	}
//	Arrays.sort(avg);
//	for(int i=0;i<n;i++)
//	System.out.println("Average marks of Student "+(i+1) +avg[i]);
  
	//Task 3
	
//  int a[]= {1,2,3,4,5};
//  int b[]= {1,2,3,4,5};
////  System.out.println(Arrays.equals(a, b)); //True
//
//	Object[] a1= {a};
//	Object[] a2= {b};
//	System.out.println(Arrays.equals(a1, a2));  //false
//	System.out.println(Arrays.deepEquals(a1, a2)); //True
    
	//Task 4
	
//    int[] a = {1,2,3,4,5,6,7};
//// copying entire source array to destination
//    int[] b = Arrays.copyOfRange(a, 0, a.length);      
//    System.out.println("destination1 = " + Arrays.toString(b));
//
//// copying from index 2 to 5 (5 is not included) 
//    int[] a1 = Arrays.copyOfRange(a, 2, 5); 
//    System.out.println("destination2 = " + Arrays.toString(a1)); 
 
	
	//Task5
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

