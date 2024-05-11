package Week4;

import java.util.*;
import java.util.LinkedList;

public class ContackBook {
    public static class Contact {
        String name;
        String number;
        String email;

        public Contact(String name, String number, String email) {
            this.name = name;
            this.number = number;
            this.email = email;
        }

        public void setName(String n) {
            this.name = n;
        }

        public void setNumber(String n) {
            this.number = n;
        }

        public void setEmail(String e) {
            this.email = e;
        }

        public String getName() {
            return this.name;
        }

        public String getNumber() {
            return this.number;
        }

        public String getEmail() {
            return this.email;
        }

        @Override
        public String toString() {
            return "Name: " + this.getName() + " Number: " + this.getNumber() + " Email: " + this.getEmail();
        }
    }

    public static void main(String[] args) {
        LinkedList<Contact> cb = new LinkedList<>();
        try (Scanner in = new Scanner(System.in)) {
            String menu;
            boolean done = false;

            do {
                System.out.println();
                System.out.format("****************************************************************************************************************%n");
                System.out.format("(A)dd  \n(D)elete \n(E)mail Search \n(P)rint List \n(Q)uit%n");
                System.out.format("****************************************************************************************************************%n");
                System.out.format("Please Enter a command: ");
                menu = in.nextLine().toUpperCase();

                switch (menu) {
                    case "A":
                        System.out.println("Add an entry");

                        System.out.print("Enter a NAME: ");
                        String name = in.nextLine();

                        System.out.print("Enter an EMAIL ADDRESS: ");
                        String email = in.nextLine();

                        System.out.print("Enter a PHONE NUMBER: ");
                        String phoneNumber = in.nextLine();

                        cb.add(new Contact(name,email,phoneNumber));

                        break;
                    case "D":
                        System.out.print("Enter index number to delete: ");
                        int delete = in.nextInt();
                        cb.remove(delete);
                        break;
                    case "E":

                    case "P":
                        System.out.println(cb);
                        break;
                    case "Q":
                        System.out.println("Exiting!");
                        done = true;
                        break;
                    default:
                        System.out.println("Unknown entry");
                }

            } while (!done);
        }

        System.out.println("Thanks!");

    }
}