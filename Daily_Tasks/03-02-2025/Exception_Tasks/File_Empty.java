package Tasks;
import java.util.*;
import java.io.*;
public class File_Empty {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	try {
		System.out.println("Enter file path");
		String fp=sc.nextLine();
		File file = new File(fp);
        if (file.length() == 0) {
            throw new Exception("Error: The file is empty.");
        }
        System.out.println("File contains some info");
    } catch (FileNotFoundException e) {
        System.out.println("Error: File not found. Please check the file path.");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    } 
}
}
