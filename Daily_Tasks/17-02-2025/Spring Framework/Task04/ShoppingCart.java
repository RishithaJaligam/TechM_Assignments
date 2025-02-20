package task04;

import java.util.List;

public class ShoppingCart {
    private List<ProductService> products;

    // Interface Injection (Setter)
    public void setProducts(List<ProductService> products) {
        this.products = products;
    }

    public void showProducts() {
        for (ProductService product : products) {
            product.displayProduct();
        }
    }
}
