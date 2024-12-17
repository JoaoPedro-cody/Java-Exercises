package Application;

import Entities.Product;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name, price, and quantity of the product: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.print("Add to quantity: ");
        quantity = sc.nextInt();
        product.deposit(quantity);

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.print("Withdraw to quantity: ");
        quantity = sc.nextInt();
        product.withdraw(quantity);

        System.out.println();
        System.out.println(product);

        sc.close();
    }
}
