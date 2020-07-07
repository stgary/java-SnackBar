package snackBar;

public class Customer {
    
    private static int maxId= 0;
    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash) {

        maxId++;
        id = maxId;

        this.name = name;
        this.cash = cash;
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

    public double getCash() {
        return cash;
    }

    public void buySnack(double arg) {
        cash = cash - arg;
    }

    public void addCash(double arg) {
        this.cash = cash + arg;
    }

}