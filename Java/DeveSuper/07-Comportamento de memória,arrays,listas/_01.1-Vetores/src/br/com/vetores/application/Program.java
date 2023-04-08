package br.com.vetores.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tamanhoVetor = sc.nextInt();
        double[] meuVetor = new double[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            meuVetor[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < tamanhoVetor; i++) {
            soma += meuVetor[i];
        }
        double media = soma / tamanhoVetor;

        System.out.printf("Media: %.2f", media);

        sc.close();
    }
}
