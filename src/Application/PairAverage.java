package Application;

import java.util.Scanner;

public class PairAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements will the vector have? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter an number: ");
            vect[i] = sc.nextInt();
        }

        int countPairs = 0;
        int sumPairs = 0;
        for (int j : vect){
            if (j % 2 == 0) {
                sumPairs += j;
                countPairs++;
            }
        }

        double avgPairs = (double) sumPairs / countPairs;

        if (countPairs == 0){
            System.out.println("No even numbers!");
        }
        else {
            System.out.printf("Pair Average = %.1f%n", avgPairs);
        }

        sc.close();
    }
}
