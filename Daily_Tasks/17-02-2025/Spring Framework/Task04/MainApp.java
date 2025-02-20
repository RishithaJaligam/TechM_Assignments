package task04;

//Create a spring bean  Online Shopping  application to inject the values via interface injection?

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("task04.xml");
        ShoppingCart cart = (ShoppingCart) context.getBean("shoppingCart");

        System.out.println("Online Shopping Products:");
        cart.showProducts();
    }
}
