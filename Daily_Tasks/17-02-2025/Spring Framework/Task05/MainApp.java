package task05;

//Create a Spring bean Items application to inject the values via getters and setters application?

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("task05.xml");

        System.out.println("Items:");
        ((Item) context.getBean("apple")).displayItem();
        ((Item) context.getBean("banana")).displayItem();
        ((Item) context.getBean("orange")).displayItem();
        ((Item) context.getBean("grape")).displayItem();
    }
}
