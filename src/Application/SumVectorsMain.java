package Application;

import java.util.Scanner;

public class SumVectorsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("how many numbers to enter? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter an number: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        System.out.println();
        System.out.print("Vectors = ");
        for (double j : vect) {
            System.out.print(j + "  ");
        }

        double avg = sum / n;
        System.out.println();
        System.out.printf("Sum = %.2f%n", sum);
        System.out.printf("Average = %.2f%n", avg);

    }


}
