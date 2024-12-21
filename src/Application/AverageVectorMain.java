package Application;

import java.util.Scanner;

public class AverageVectorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements will the vector have? ");
        byte elements = sc.nextByte();
        double[] vect = new double[elements];

        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter an number: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double average = sum / elements;

        System.out.println();
        System.out.printf("VECTOR AVERAGE: %.3f%n", average);
        System.out.println("ELEMENTS BELOW AVERAGE: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < average){
                System.out.println(vect[i]);
            }
        }


    }
}
