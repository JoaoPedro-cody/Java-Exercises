package Application;

import java.util.Scanner;

public class Position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will be entered? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter an number: ");
            vect[i] = sc.nextDouble();
        }

        int position = 0;
        double Higher = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > Higher){
                Higher = vect[i];
                position = i;
            }
        }

        System.out.printf("HIGHER = %.1f%n", Higher);
        System.out.println("POSITION OF HIGHEST Value = " + position);

        sc.close();
    }
}
