package jdbc;
import java.sql.*;
import java.util.Scanner;
public class Update_row {
	  public static void main(String args[]) throws SQLException, Exception {

		    Scanner scan = new Scanner(System.in);

		    Class.forName("com.mysql.cj.jdbc.Driver");

		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm_java", "root", "tiger");

		    System.out.println("Choose from the following to update respectively:\n 1.Employee Name \n 2.Employee Salary");
		    int choice = scan.nextInt();

		    String colName = "";
		    if (choice == 1) {
		      colName += "employee_name";
		    } else if (choice == 2) {
		      colName += "employee_Sal";
		    }

		    System.out.print("\nEnter the employee id: ");
		    int id = scan.nextInt();

		    System.out.print("Enter the new " + colName + ": ");
		    String updation = scan.next();

		    PreparedStatement ps = con.prepareStatement("UPDATE employee SET " + colName + " = ? WHERE employee_id = ?");
		    ps.setString(1, updation);
		    ps.setInt(2, id);

		    int value = ps.executeUpdate();
		    System.out.println("\n" + value + " Row updated in the Table");

		    scan.close();
		    con.close();
		  }
		}

