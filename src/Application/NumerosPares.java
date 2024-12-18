package Application;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers to enter? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter an number: ");
            vect[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("EVEN NUMBERS: ");
        int count = 0;
        for (int j : vect) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("NUMBER OF PAIRS: " + count);

        sc.close();
    }
}
