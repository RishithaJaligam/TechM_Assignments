package task01;

//Create a spring dependency application for Student Bean which should include setter/getter, constructor and interface injection.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("task01.xml");

        StudentService studentService = (StudentService) context.getBean("studentService");
        System.out.println("Student Details:");
        studentService.displayStudentInfo();
    }
}
