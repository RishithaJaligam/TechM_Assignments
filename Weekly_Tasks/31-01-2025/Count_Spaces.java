package TechM;

import java.util.Scanner;

public class Count_Spaces {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String with spaces");
		String s=sc.nextLine();
		int Nspace=0,nchar=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				Nspace++;
			}
			else if(Character.isAlphabetic(s.charAt(i)))
				nchar++;
		}
		System.out.println("No. white spaces= "+Nspace+" No.of characters= "+nchar);
		
}
}
