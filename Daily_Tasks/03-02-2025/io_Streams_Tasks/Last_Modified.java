package io_Streams_Tasks;
import java.util.*;
import java.io.*;
public class Last_Modified {
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter a file path");
		   String fp=sc.nextLine();
	       File file = new File(fp);
	       Date date=new Date(file.lastModified());
		   System.out.println("\nThe file was last modified on: "+date+"\n");
}

}
