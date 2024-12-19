package Application;

import Entities.Alunos;

import java.util.Scanner;

public class AlunosMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students will be typed? ");
        int n = sc.nextInt();
        Alunos[] vect = new Alunos[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Enter name, first and second grade of the " + (i + 1) + "st student");
            sc.nextLine();
            String name = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double average = (nota1 + nota2) / 2;
            vect[i] = new Alunos(name, nota1, nota2, average);
        }

        System.out.println();
        System.out.println("Aprovados!");
        for (Alunos j : vect){
            if (j.getAverage() >= 6.0){
                System.out.println(j.getName());
            }
        }

    }
}
