package Application;

import java.util.Scanner;

public class NegativeNumberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("how many numbers to enter? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter an number: ");
            vect[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Negatives Numbers: ");
        for (int j : vect) {

            if (j < 0) {
                System.out.println(j);
            }

        }
    }
}
