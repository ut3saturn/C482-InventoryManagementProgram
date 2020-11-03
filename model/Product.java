package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Product {

    private ObservableList<Part> associatedParts = FXCollections.observableArrayList();
    private int productID;
    private String productName;
    private double productPrice;
    private int productStock;
    private int prodMax;
    private int prodMin;

    public Product(int productID, String productName, double productPrice, int productStock, int prodMax, int prodMin) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.prodMax = prodMax;
        this.prodMin = prodMin;
    }

    // Add part to the product's Observable List
    public void addAssociatedPart(Part part) {
        this.associatedParts.add(part);
    }

    public void deleteAssociatedPart(Part part){
        this.associatedParts.remove(part);
    }

    public ObservableList<Part> getAssociatedParts() {
        return this.associatedParts;
    }
    // Setters
    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public void setProdMax(int prodMax) {
        this.prodMax = prodMax;
    }

    public void setProdMin(int prodMin) {
        this.prodMin = prodMin;
    }

    // Getters
    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public int getProdMax() {
        return prodMax;
    }

    public int getProdMin() {
        return prodMin;
    }

}
