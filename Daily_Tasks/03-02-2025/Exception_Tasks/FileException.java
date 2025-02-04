package Tasks;
import java.io.*;
import java.util.Scanner;
public class FileException {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter file path");
		String fp=sc.nextLine();
		FileReader file = new FileReader(fp);
        BufferedReader reader = new BufferedReader(file);
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    } catch (FileNotFoundException e) {
        System.out.println("Error: File not found. Please check the file path.");
    } catch (IOException e) {
        System.out.println("Error: An I/O error occurred.");
    } 
        sc.close();
    }
}
