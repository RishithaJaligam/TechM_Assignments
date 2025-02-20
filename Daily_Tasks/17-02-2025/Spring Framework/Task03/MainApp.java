package task03;

//Create a spring bean of inventory to inject the values via constructor injection.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("task03.xml");

        Inventory inventory = (Inventory) context.getBean("inventory");
        inventory.displayInventory();
    }
}

