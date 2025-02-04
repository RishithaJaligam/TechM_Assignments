package Tasks;
import java.util.*;
import java.io.*;
public class File_positive_Check {
	public static void main(String args[])
	{
		  Scanner sc = new Scanner(System.in);
	try {
        System.out.print("Enter the file path: ");
        String fp = sc.nextLine();

        FileReader file = new FileReader(fp);
        BufferedReader reader = new BufferedReader(file);

        String line;
        while ((line = reader.readLine()) != null) {
            try {
                int number = Integer.parseInt(line.trim());
                if (number > 0) {
                    throw new Exception("Error: Positive number found - " + number);
                }
                System.out.println("Number: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format in file: " + line);
            }
        }

        reader.close();
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
