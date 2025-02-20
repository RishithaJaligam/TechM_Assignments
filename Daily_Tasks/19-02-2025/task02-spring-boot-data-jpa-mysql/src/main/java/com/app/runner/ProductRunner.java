package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.app.model.Product;
import com.app.repo.ProductRepository;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Component
public class ProductRunner implements CommandLineRunner {
    @Autowired
    private ProductRepository repo;

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Product Management Menu =====");
            System.out.println("1. Insert Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Show All Products");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    insertProduct(scanner);
                    break;
                case 2:
                    updateProduct(scanner);
                    break;
                case 3:
                    deleteProduct(scanner);
                    break;
                case 4:
                    showAllProducts();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private void insertProduct(Scanner scanner) {
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Product Name: ");
        String name = scanner.next();
        System.out.print("Enter Product Cost: ");
        double cost = scanner.nextDouble();

        Product product = new Product(id, name, cost);
        repo.save(product);
        System.out.println("Product inserted successfully!");
    }

    private void updateProduct(Scanner scanner) {
        System.out.print("Enter Product ID to update: ");
        int id = scanner.nextInt();
        Optional<Product> existingProduct = repo.findById(id);

        if (existingProduct.isPresent()) {
            Product product = existingProduct.get();
            System.out.print("Enter new Product Name: ");
            product.setProdName(scanner.next());
            System.out.print("Enter new Product Cost: ");
            product.setProdCost(scanner.nextDouble());

            repo.save(product);
            System.out.println("Product updated successfully!");
        } else {
            System.out.println("Product not found with ID: " + id);
        }
    }

    private void deleteProduct(Scanner scanner) {
        System.out.print("Enter Product ID to delete: ");
        int id = scanner.nextInt();
        if (repo.existsById(id)) {
            repo.deleteById(id);
            System.out.println("Product deleted successfully!");
        } else {
            System.out.println("Product not found with ID: " + id);
        }
    }

    private void showAllProducts() {
        List<Product> products = repo.findAll();
        if (products.isEmpty()) {
            System.out.println("No products found in the database.");
        } else {
            System.out.println("\nID\tProduct Name\tCost");
            products.forEach(System.out::println);
        }
    }
}
