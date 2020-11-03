package model;

public class Outsourced extends Part {

    private String companyName;

    public Outsourced(int partID, String partName, double partCost, int partStock, int partMaxStock, int partMinStock, String companyName) {
        setPartID(partID);
        setPartName(partName);
        setPartPrice(partCost);
        setPartStock(partStock);
        setPartMaxStock(partMaxStock);
        setPartMinStock(partMinStock);
        setCompanyName(companyName);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
