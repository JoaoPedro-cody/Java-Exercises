package Entities;

import Application.Retangulo;

import java.util.Scanner;

public class RetanguloProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Height and the Width: ");
        System.out.print("Width: ");
        double width = sc.nextDouble();
        System.out.print("Height: ");
        double height = sc.nextDouble();
        Retangulo rec = new Retangulo(width, height);

        System.out.println();
        System.out.printf("WIDTH = %.2f%n", rec.getWidth());
        System.out.printf("HEIGHT = %.2f%n", rec.getHeight());

        System.out.println();
        System.out.printf("AREA = %.2f%n", rec.Area());
        System.out.printf("PERIMETER = %.2f%n", rec.Perimeter());

        System.out.println();
        System.out.println(rec);

        System.out.println();
        System.out.println("Change width and height: ");
        System.out.print("Width: ");
        width = sc.nextDouble();
        System.out.print("Height: ");
        height = sc.nextDouble();
        rec.setWidth(width);
        rec.setHeight(height);

        System.out.println();
        System.out.printf("WIDTH = %.2f%n", rec.getWidth());
        System.out.printf("HEIGHT = %.2f%n", rec.getHeight());

        System.out.println();
        System.out.printf("AREA = %.2f%n", rec.Area());
        System.out.printf("PERIMETER = %.2f%n", rec.Perimeter());

        System.out.println(rec);

        sc.close();
    }
}
