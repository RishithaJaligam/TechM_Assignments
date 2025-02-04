package Tasks;

import java.util.Scanner;

public class Check_even_odd {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n%2!=0)
		{
			throw new Exception("Error: The Number is Odd");
		}
		System.out.println("The number is Even "+n);
	    }
	catch (Exception e) {
            System.out.println(e.getMessage());
        }
            sc.close();
}
}
