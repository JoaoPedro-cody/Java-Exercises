package Entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void deposit(int quantity){
        this.quantity += quantity;
    }

    public void withdraw(int quantity){
        this.quantity -= quantity;
    }

    public double showPrice() {
        return price * quantity;
    }


    public String toString(){
        return "Product: "
                + getName()
                + " Price: $ "
                + String.format("%.2f", showPrice())
                + " Quantity: "
                + getQuantity();
    }

}
