package snackBar;

public class Snack {

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId) {

        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int arg) {
        this.quantity = quantity + arg;
    }

    public void buySnack(int arg) {
        this.quantity = quantity - arg;
    }

    public double totalCost(int arg) {
        return this.cost * arg;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getVendingMachineId() {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    @Override
    public String toString() {
        String rtnStr = "id: " + id + "\n" +
            "name: " + name + "\n" +
            "quantity: " + quantity + "\n" +
            "cost: " + cost + "\n" + 
            "vendingMachineId" + vendingMachineId + "\n";
        return rtnStr;
    }
}