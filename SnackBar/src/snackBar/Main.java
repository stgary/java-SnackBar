package snackBar;

public class Main {

    private static void workWithData() {

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");


        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());
        Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);
                
        System.out.println("***Snack Bar***");
        System.out.println();
        s4.buySnack(3);
        c1.buySnack(s4.totalCost(3));
        System.out.println("Customer " + c1.getId() +  " cash on hand $" + c1.getCash());
        System.out.println("Quantity of snack " + s4.getId() + " is " + s4.getQuantity());
        System.out.println();
        s3.buySnack(1);
        c1.buySnack(s3.totalCost(1));
        System.out.println("Customer " + c1.getId() +  " cash on hand $" + c1.getCash());
        System.out.println("Quantity of snack " + s3.getId() + " is " + s3.getQuantity());
        System.out.println();
        s4.buySnack(2);
        c2.buySnack(s4.totalCost(2));
        System.out.println("Customer " + c2.getId() +  " cash on hand $" + c2.getCash());
        System.out.println("Quantity of snack " + s4.getId() + " is " + s4.getQuantity());
        System.out.println();
        c1.addCash(10.00);
        System.out.println("Customer " + c1.getId() +  " cash on hand $" + c1.getCash());
        System.out.println();
        s2.buySnack(1);
        c1.buySnack(s2.totalCost(1));
        System.out.println("Customer " + c1.getId() +  " cash on hand $" + c1.getCash());
        System.out.println("Quantity of snack " + s2.getId() + " is " + s2.getQuantity());
        System.out.println();
        s3.addQuantity(12);
        System.out.println("Quantity of snack " + s3.getId() + " is " + s3.getQuantity());
        System.out.println();
        s3.buySnack(3);
        c2.buySnack(s3.totalCost(3));
        System.out.println("Customer " + c2.getId() +  " cash on hand $" + c2.getCash());
        System.out.println("Quantity of snack " + s3.getId() + " is " + s3.getQuantity());
        System.out.println();
        System.out.println("Snack: " + s1.getName());
        System.out.println("Vending Machine: " + v1.getName());
        System.out.println("Quantity: " + s1.getQuantity());
        System.out.println("Total Cost $" + s1.totalCost(s1.getQuantity()));
        System.out.println();
        System.out.println("Snack: " + s2.getName());
        System.out.println("Vending Machine: " + v1.getName());
        System.out.println("Quantity: " + s2.getQuantity());
        System.out.println("Total Cost $" + s2.totalCost(s2.getQuantity()));
        System.out.println();
        System.out.println("Snack: " + s3.getName());
        System.out.println("Vending Machine: " + v1.getName());
        System.out.println("Quantity: " + s3.getQuantity());
        System.out.println("Total Cost $" + s3.totalCost(s3.getQuantity()));
        System.out.println();
        System.out.println("Snack: " + s4.getName());
        System.out.println("Vending Machine: " + v2.getName());
        System.out.println("Quantity: " + s4.getQuantity());
        System.out.println("Total Cost $" + s4.totalCost(s4.getQuantity()));
        System.out.println();
        System.out.println("Snack: " + s5.getName());
        System.out.println("Vending Machine: " + v2.getName());
        System.out.println("Quantity: " + s5.getQuantity());
        System.out.println("Total Cost $" + s5.totalCost(s5.getQuantity()));

    }  

    public static void main(String[] args) {

        workWithData();
    }


}