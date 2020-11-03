package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Inventory {
    // Variables
    private ObservableList<Part> allParts = FXCollections.observableArrayList();

    private ObservableList<Product> allProducts = FXCollections.observableArrayList();

    // Methods
    public void addPart(Part part) {
        this.allParts.add(part);

    }

    public void addProduct(Product product){
        this.allProducts.add(product);
    }

    public void setAllParts(ObservableList<Part> allParts) {
        this.allParts = allParts;
    }

    public void setAllProducts(ObservableList<Product> products) {
        this.allProducts = products;
    }

    public Part lookupPart(int partID) {
        for (Part p : allParts) {
            if (p.getPartID() == partID) {
                return p;
            }
        }
        return null;
    }

    public Product lookupProduct(int productID){
        for (Product p : allProducts) {
            if (p.getProductID() == productID){
                return p;
            }
        }
        return null;
    }

    public ObservableList<Part> lookupPart(String partName) {
        ObservableList<Part> partsShortList = FXCollections.observableArrayList();
        for (Part p : allParts) {
            if (p.getPartName().toLowerCase().contains(partName.toLowerCase().trim())) {
                partsShortList.add(p);
            }
        }
        return partsShortList;
    }

    public ObservableList<Product> lookupProduct(String productName) {
        ObservableList<Product> productShortList = FXCollections.observableArrayList();
        for (Product p : allProducts) {
            if (p.getProductName().toLowerCase().contains(productName.toLowerCase().trim())) {
                productShortList.add(p);
            }
        }
        return productShortList;
    }

    public void updatePart(int index, Part selectedPart){
        if (index == 1) {
            deletePart(lookupPart(selectedPart.getPartID()));
            InHouse newPart = new InHouse(selectedPart.getPartID(),
                    selectedPart.getPartName(),
                    selectedPart.getPartCost(),
                    selectedPart.getPartStock(),
                    selectedPart.getPartMaxStock(),
                    selectedPart.getPartMinStock(),
                    ((InHouse)selectedPart).getMachineID());
            addPart(newPart);
        }
        if (index == 2) {
            deletePart(lookupPart(selectedPart.getPartID()));
            Outsourced newPart = new Outsourced(selectedPart.getPartID(),
                    selectedPart.getPartName(),
                    selectedPart.getPartCost(),
                    selectedPart.getPartStock(),
                    selectedPart.getPartMaxStock(),
                    selectedPart.getPartMinStock(),
                    ((Outsourced)selectedPart).getCompanyName());
            addPart(newPart);
        }
    }

    public void updateProduct(int index, Product selectedProduct) {
        for (Product p : allProducts) {
            if (index == p.getProductID()) {
                deleteProduct(lookupProduct(p.getProductID()));
                this.addProduct(selectedProduct);
                break;
            }
        }
    }

    public boolean deletePart(Part selectedPart) {
        for (Part p : allParts) {
            if (p.getPartID() == selectedPart.getPartID()){
                allParts.remove(p);
                break;
            }
        }
        return true;
    }

    public boolean deleteProduct(Product selectedProduct){
        for (Product p : allProducts) {
            if (p.getProductID() == selectedProduct.getProductID()){
                allProducts.remove(p);
                break;
            }
        }
        return true;
    }

    public ObservableList<Part> getAllParts(){
        return this.allParts;
    }

    public ObservableList<Product> getAllProducts() {
        return this.allProducts;
    }
}
