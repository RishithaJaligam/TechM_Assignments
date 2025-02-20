package task03;

import java.util.List;

public class Inventory {
    private List<Product> products;

    // Constructor Injection
    public Inventory(List<Product> products) {
        this.products = products;
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (Product product : products) {
            product.displayProductDetails();
        }
    }
}
