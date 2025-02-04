package TechM;
import java.lang.Math;
import java.util.Scanner;
import java.lang.Math;
public class Perfect_Square {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int res= (int)(Math.sqrt(n));
		if(res*res==n)
			System.out.println("True");
		else
			System.out.println("False");
				
}
}
