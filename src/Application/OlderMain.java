package Application;

import Entities.Older;
import Entities.Product;

import java.util.Scanner;

public class OlderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people? ");
        int n = sc.nextInt();
        Older[] vect = new Older[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println(i + 1 + " person data");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            vect[i] = new Older(name, age);
        }

        int maior = 0;
        int count = 0;
        for (Older j : vect){
            if (j.getAge() > maior){
                maior += j.getAge();
                count++;
            }
        }

        for (int i = 0; i < vect.length; i++) {
            if (i == count + 1){
                System.out.println("Older: " + vect[i].getName());
            }
        }

    }
}
