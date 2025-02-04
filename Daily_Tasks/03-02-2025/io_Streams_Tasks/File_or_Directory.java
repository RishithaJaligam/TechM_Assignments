package io_Streams_Tasks;
import java.io.*;
import java.util.Scanner;
public class File_or_Directory {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter file or directory path");
		String fp=sc.nextLine();
		File f=new File(fp);
		if (f.isFile()) {
            System.out.println("The specified path exists and it is a file.");
        } else if (f.isDirectory()) {
            System.out.println("The specified path exists and it is a directory.");
        }
       else {
        throw new FileNotFoundException("Error: The specified path does not exist.");
    }
	}catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    } catch (Exception e) {
        System.out.println("Error: An unexpected error occurred.");
    } finally {
        System.out.println("Program execution completed.");
        sc.close();
    }
}
}
