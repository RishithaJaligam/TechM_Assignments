package TechM;
import java.util.*;
public class Vowel_Consonants {
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int Vcount=0,Ccount=0;
	for(int i=0;i<s.length();i++)
	{
		if(Character.isAlphabetic(s.charAt(i)))
		{
		if("aeiou".indexOf(Character.toLowerCase(s.charAt(i)))!=-1)
			Vcount+=1;
		else
			Ccount+=1;
		}
	}
	System.out.println("Vowel Count= " +Vcount +" Consonant Count= " +Ccount);
	
	}
	
 }

