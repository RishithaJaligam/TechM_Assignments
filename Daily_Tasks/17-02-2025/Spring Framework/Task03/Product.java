package task03;

public class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor Injection
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }
}
