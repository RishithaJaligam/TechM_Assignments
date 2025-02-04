package io_Streams_Tasks;
import java.util.*;
import java.io.*;
public class Pathname_Exist {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter the file or directory path: ");
	            String fp = sc.nextLine();
	            File f = new File(fp);
	            if (f.exists()) {
	                    System.out.println("The specified path exists.");
	                }  else {
	                throw new FileNotFoundException("Error: The specified path does not exist.");
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println(e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Error: An unexpected error occurred.");
	        } finally {
	            System.out.println("Program execution completed.");
	            sc.close();
	        }
	    }
}
