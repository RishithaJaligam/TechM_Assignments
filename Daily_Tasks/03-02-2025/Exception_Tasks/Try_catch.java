package Tasks;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class Try_catch {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter 2 Numbers for division");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
	}catch (ArithmeticException e)
	{
		System.out.println("Division by zero cannot possible");
	}
	}
}
