package br.com.vetores.principal;

import br.com.vetores.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vector size: ");
        int size = sc.nextInt();
        System.out.println();
        Person[] vector = new Person[size];

        for (int i = 0; i < vector.length; i++) {
            sc.nextLine();
            System.out.println("person " + (i + 1) + "° data");
            System.out.print("Type type your name: ");
            String name = sc.nextLine();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            vector[i] = new Person(name, height, age);
            System.out.println();
        }

        double totalHeights = 0.0;
        int smaller = 0;
        for (int i = 0; i < vector.length; i++) {
            totalHeights += vector[i].getHeight();
            if (vector[i].getAge() < 16){
                System.out.println("********************");
                System.out.println("Under 16");
                System.out.println("Name: " + vector[i].getName());
                System.out.println("Age: " + vector[i].getAge());
                System.out.println("********************");
                smaller += 1;
            } else {
                System.out.println("++++++++++++++++++++");
                System.out.println("over 16 years old");
                System.out.print("Name: " + vector[i].getName());
                System.out.print("\nHeight: " + vector[i].getHeight());
                System.out.print("\nAge: " + vector[i].getAge());
                System.out.println("\n++++++++++++++++++++");
            }
        }

        double percentageOfMinors = smaller * 100.0 / vector.length;//rule of 3
        double averageHeight = totalHeights / vector.length;

        System.out.println();
        System.out.printf("Percentage of people under 16: %.1f%%%n", percentageOfMinors);
        System.out.printf("Height average: %.2f\n", averageHeight);

        sc.close();
    }
}