package model;

public abstract class Part {
    // Make variables protected so that only classes that
    // inherit from Part may act on these variables

    protected int partID;
    protected String partName;
    protected double partCost;
    protected int partStock;
    protected int partMaxStock;
    protected int partMinStock;

    public int getPartID() {
        return partID;
    }

    public void setPartID(int partID) {
        this.partID = partID;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public double getPartCost() {
        return partCost;
    }

    public void setPartPrice(double partCost) {
        this.partCost = partCost;
    }

    public int getPartStock() {
        return partStock;
    }

    public void setPartStock(int partStock) {
        this.partStock = partStock;
    }

    public int getPartMaxStock() {
        return partMaxStock;
    }

    public void setPartMaxStock(int partMaxStock) {
        this.partMaxStock = partMaxStock;
    }

    public int getPartMinStock() {
        return partMinStock;
    }

    public void setPartMinStock(int partMinStock) {
        this.partMinStock = partMinStock;
    }
}
