package task05;

public class Item {
    private String name;
    private double price;
    private int quantity;
    
    // Setter Injection
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayItem() {
        System.out.println("Product Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }
}
