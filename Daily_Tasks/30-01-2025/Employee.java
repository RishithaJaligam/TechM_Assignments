package Day2;

public class Employee {
int empId;
String empName;
Double sal;
int exp;

public void setEmployeeDetails(int empId,String empName,double sal )
{
	this.empId=empId;
	this.empName=empName;
	this.sal=sal;
}
public void getEmployeeDetails() {
  System.out.println("Employee Id : "+empId);
  System.out.println("Employee Name : "+empName);
  System.out.println("Employee Salary : "+sal);
}
public double getLoanEligibility(int exp)
{
	this.exp=exp;
	double grant=0;
	if(exp>5)
	{
		if(sal==600000)
			grant=200000;
		else if(sal>=100000)
			grant=500000;
		else if(sal>=150000)
			grant=700000;
	}
	return grant;
	
}
public static void main(String args[])
{
  Employee e=new Employee();
  e.setEmployeeDetails(100,"Rishitha",600000);
  e.getEmployeeDetails();
  System.out.println("Loan Granted of Rupees= "+e.getLoanEligibility(7));
}
}
