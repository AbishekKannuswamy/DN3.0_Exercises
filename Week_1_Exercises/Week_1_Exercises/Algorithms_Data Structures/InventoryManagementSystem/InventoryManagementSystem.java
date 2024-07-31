package InventoryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {
    private Map<String, Product> inventory;

    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    public void addNewProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void modifyProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void removeProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void listProducts() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        
        ims.addNewProduct(new Product("P001", "Laptop", 10, 999.99));
        ims.addNewProduct(new Product("P002", "Smartphone", 20, 599.99));
        
        ims.modifyProduct(new Product("P001", "Laptop", 15, 949.99));
        
        ims.removeProduct("P002");
        
        ims.listProducts();
    }
}
