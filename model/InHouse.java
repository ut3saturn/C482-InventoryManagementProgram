package model;

public class InHouse extends Part {

    private int machineID;

    public InHouse(int partID, String partName, double partCost, int partStock, int partMaxStock, int partMinStock, int machineID) {
        setPartID(partID);
        setPartName(partName);
        setPartPrice(partCost);
        setPartStock(partStock);
        setPartMaxStock(partMaxStock);
        setPartMinStock(partMinStock);
        setMachineID(machineID);
    }

    public int getMachineID() {
        return machineID;
    }

    public void setMachineID(int machineID) {
        this.machineID = machineID;
    }
}
