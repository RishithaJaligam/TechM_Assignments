package jdbc;
import java.sql.*;
import java.util.Scanner;
public class Delete_query {
	 public static void main(String args[]) throws SQLException, Exception {

		    Scanner scan = new Scanner(System.in);

		    Class.forName("com.mysql.cj.jdbc.Driver");

		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm_java", "root", "tiger");

		    System.out.println(
		        "Choose from the following to delete respectively:\n 1.Employee ID \n 2.Employee Name \n 3.Employee Salary");
		    int choice = scan.nextInt();

		    String colName = "";
		    if (choice == 1) {
		      colName += "employee_id";
		    } else if (choice == 2) {
		      colName += "employee_name";
		    } else if (choice == 3) {
		      colName += "employee_sal";
		    }

		    PreparedStatement ps = con.prepareStatement("DELETE FROM employee WHERE " + colName + " = ?");

		    System.out.print("\nEnter " + colName + " : ");
		    if (choice == 1) {
		      ps.setInt(1, scan.nextInt());
		    } else {
		      ps.setString(1, scan.next());
		    }

		    int value = ps.executeUpdate();
		    System.out.println("\n" + value + " Row(s) deleted from the Table");

		    scan.close();
		    con.close();
		  }
		}
