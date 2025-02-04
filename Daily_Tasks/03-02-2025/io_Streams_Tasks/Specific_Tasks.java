package io_Streams_Tasks;
import java.util.*;
import java.io.*;
public class Specific_Tasks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		try {
            System.out.print("Enter the directory path: ");
            String dp = sc.nextLine();

            System.out.print("Enter the file extension (e.g., .txt, .java): ");
            String ex = sc.nextLine();

            File d = new File(dp);
            if (!d.isDirectory()) {
                throw new Exception("Error: The provided path is not a directory.");
            }

            File[] filesList = d.listFiles((dir, name) -> name.toLowerCase().endsWith(ex.toLowerCase()));
            if (filesList == null || filesList.length == 0) {
                throw new Exception("Error: No files found with the specified extension.");
            }

            System.out.println("List of files with extension " + ex + ":");
            for (File file : filesList) {
                System.out.println(file.getName());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the file path.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program executed successfully.");
            sc.close();
        }
    }
	}


