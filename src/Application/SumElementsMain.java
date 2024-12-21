package Application;

import java.util.Scanner;

public class SumElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will each vector have? ");
        int n = sc.nextInt();
        int[] vecta = new int[n];
        int[] vectb = new int[n];
        int[] vectc = new int[n];

        System.out.println("Enter the A vector values: ");
        for (int i = 0; i < vecta.length; i++) {
            vecta[i] = sc.nextInt();
        }

        System.out.println("Enter the B vector values: ");
        for (int i = 0; i < vectb.length; i++) {
            vectb[i] = sc.nextInt();
        }


        System.out.println("Resultant Vector = ");
        for (int i = 0; i < n; i++) {
            vectc[i] = vecta[i] + vectb[i];
            System.out.println(vectc[i]);
        }

        sc.close();
    }
}
