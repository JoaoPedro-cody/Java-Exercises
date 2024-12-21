package Application;

import Entities.GuestHouse;

import java.util.Scanner;

public class GuestHouseMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        GuestHouse[] vect = new GuestHouse[10];

        System.out.println();
        for (int i = 0; i < n; i++) {

            System.out.println("Rent #" + (i + 1));

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();

            vect[room - 1] = new GuestHouse(name, email, room);
            System.out.println();

        }

        System.out.println("Busy Rooms: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null){
                System.out.println(i + 1 + ": " + vect[i].getName() + ", " + vect[i].getEmail());
            }
        }

    }
}
