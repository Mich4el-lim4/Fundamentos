package br.com.vetor.application;

import br.com.vetor.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        Product[] vetor = new Product[numero];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.print("Nome do produto: ");
            String name = sc.nextLine();
            System.out.print("Preço: ");
            double price = sc.nextDouble();
            vetor[i] = new Product(name, price);
        }

        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i].getPrice();
        }
        double total = soma / vetor.length;

        System.out.printf("Average price = %.2f", total);

        sc.close();
    }
}
