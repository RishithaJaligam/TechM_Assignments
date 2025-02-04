package io_Streams_Tasks;
import java.util.*;
import java.io.*;
public class Read_linebyline {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter file path");
	String fp=sc.nextLine();
	 try (BufferedReader reader = new BufferedReader(new FileReader(fp))) {
         String line;
         while ((line = reader.readLine()) != null) {
             System.out.println(line); 
         }
     } catch (IOException e) {
         e.printStackTrace();
}
}
}
