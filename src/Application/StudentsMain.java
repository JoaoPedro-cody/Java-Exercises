package Application;

import Entities.Students;

import java.util.Scanner;

public class StudentsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students will be typed? ");
        int n = sc.nextInt();
        Students[] vect = new Students[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Enter name, first and second grade of the " + (i + 1) + "st student");
            sc.nextLine();
            String name = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double average = (nota1 + nota2) / 2;
            vect[i] = new Students(name, nota1, nota2, average);
        }

        System.out.println();
        System.out.println("Aprovados!");
        for (Students j : vect){
            if (j.getAverage() >= 6.0){
                System.out.println(j.getName());
            }
        }

    }
}
