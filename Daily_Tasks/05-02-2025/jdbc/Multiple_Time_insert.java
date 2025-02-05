package jdbc;

import java.sql.*;
import java.util.Scanner;
public class Multiple_Time_insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

	Scanner scan = new Scanner(System.in);

	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm_java", "root", "tiger");

	PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");

	while (true) {
		System.out.print("Do you want to insert a row? (yes/no): ");
		if (scan.next().contains("no"))
			break;

		System.out.print("\nEnter the Employee Id: ");
		pstmt.setInt(1, scan.nextInt());
		
		System.out.print("Enter the Employee Name: ");
		pstmt.setString(2, scan.next());
		
		System.out.print("Enter the Employee Salary: ");
		pstmt.setInt(3, scan.nextInt());

		int value = pstmt.executeUpdate();
		System.out.println("\n" + value + " Row inserted into the table\n");
	}
	
	pstmt.close();
	con.close();
	scan.close();
}
}
