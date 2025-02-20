package task02;

//Create a Loan Bean application that will explain about getter setters. It should compraise of Housing loan, Vehicle loan etc..

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("task02.xml");

        HousingLoan housingLoan = (HousingLoan) context.getBean("housingLoan");
        VehicleLoan vehicleLoan = (VehicleLoan) context.getBean("vehicleLoan");
        
        System.out.println("Loan Details:");
        housingLoan.displayLoanDetails();
        vehicleLoan.displayLoanDetails();
    }
}
