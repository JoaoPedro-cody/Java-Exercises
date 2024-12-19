package Application;

import Entities.PeopleData;

import java.util.Scanner;

public class PeopleDataMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be entered? ");
        int n = sc.nextInt();
        PeopleData[] vect = new PeopleData[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print(i + 1 + "st person height: ");
            double height = sc.nextDouble();
            System.out.print(i + 1 + "st person sex: ");
            char sex = sc.next().charAt(0);
            vect[i] = new PeopleData(height, sex);
        }

        double menor = vect[0].getHeight();
        double maior = 0.0;
        for (PeopleData j : vect){
            if (j.getHeight() > maior){
                maior = j.getHeight();
            }
        }
        for (PeopleData j : vect){
            if (j.getHeight() < menor){
                menor = j.getHeight();
            }
        }

        double sum = 0;
        int count = 0;
        int countm = 0;
        for (PeopleData j : vect){
            if (j.getSex() == 'f'){
            sum = sum + j.getHeight();
            count++;
            }
        }

        for (PeopleData j : vect){
            if (j.getSex() == 'm'){
                countm++;
            }
        }

        double avg = sum / count;

        System.out.printf("Minor: %.2f%n", menor);
        System.out.printf("Higher: %.2f%n", maior);
        System.out.printf("Average height of women: %.2f%n", avg);
        System.out.println("Mans Number: " + countm);


    }
}
