package InventoryManagementSystem;

public class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    public String fetchProductId() {
        return productId;
    }

    public void assignProductId(String productId) {
        this.productId = productId;
    }

    public String fetchProductName() {
        return productName;
    }

    public void assignProductName(String productName) {
        this.productName = productName;
    }

    public int fetchQuantity() {
        return quantity;
    }

    public void adjustQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double fetchPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
