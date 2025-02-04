package io_Streams_Tasks;
import java.io.*;
import java.util.Scanner;
public class File_Size {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter file or directory path");
		String fp=sc.nextLine();
		File f=new File(fp);
		 if (f.exists()) {
	            long Bytes = f.length();
	            double KB =Bytes / 1024.0;
	            double MB = KB / 1024.0;
		 System.out.println("File Size in Bytes: " + Bytes + " bytes");
         System.out.println("File Size in KB: " + KB + " KB");
         System.out.println("File Size in MB: " + MB + " MB");
     } else {
         throw new Exception("Error:The specified file does not exist.");
     }
    }catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    } catch (Exception e) {
        System.out.println("Error: An unexpected error occurred.");
    } finally {
        System.out.println("Program executed successfully.");
        sc.close();
    }
}
}