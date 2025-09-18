package ca.sheridan.siddzoha.assign1.siddiquizassign1.model;
/*
Zohaib Siddiqui
Student ID: 991578873
 */
public class Product {
    private String code;
    private String brand;
    private int quantity;
    private double unitPrice;

    public Product() {}

    public Product(String code, String brand, int quantity, double unitPrice) {
        this.code = code;
        this.brand = brand;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    // Getters and setters
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }
}