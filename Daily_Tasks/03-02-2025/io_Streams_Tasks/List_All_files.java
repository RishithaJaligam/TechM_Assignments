package io_Streams_Tasks;
import java.util.*;
import java.io.*;
public class List_All_files {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	 try {
         System.out.print("Enter the directory path: ");
         String dp = sc.nextLine();

         File d = new File(dp);
         if (!d.isDirectory()) {
             throw new Exception("Error: The provided path is not a directory.");
         }

         String[] filesList = d.list();
         if (filesList == null || filesList.length == 0) {
             throw new Exception("Error: The directory is empty.");
         }

         System.out.println("List of files and directories:");
         for (String fileName : filesList) {
             System.out.println(fileName);
         }
	 }catch (FileNotFoundException e) {
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
