package Application;

import Entities.Heights;

import java.util.Scanner;

public class HeightsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be entered? ");
        int n = sc.nextInt();
        Heights[] vect = new Heights[n];

        for (int i = 0; i < vect.length; i++) {

            System.out.println(i + 1 + " person data: ");

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Height: ");
            double height = sc.nextDouble();

            vect[i] = new Heights(name, age, height);

        }

        int ageSz = 0;
        for (int i = 0; i < vect.length; i++) {

            if (vect[i].getAge() < 16){

                ageSz++;

            }

        }

        double sum = 0;
        for (int i = 0; i < vect.length; i++) {

            sum += vect[i].getHeight();

        }

        double percentage = ((double)ageSz / n ) * 100.0;
        double avg = sum / n;

        System.out.printf("Average: %.2f%n", avg);
        System.out.printf("People under 16: %.1f%%\n", percentage);
        for (int i = 0; i < vect.length; i++) {

            if (vect[i].getAge() < 16){

                System.out.println(vect[i].getName());

            }

        }
    }
}
