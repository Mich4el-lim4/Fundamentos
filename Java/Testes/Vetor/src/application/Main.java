package application;

import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String option;
		
		do {
			System.out.print("Quantos produtos deseja cadastrar: ");
			int quantidade = sc.nextInt();
			Product[] produtos = new Product[quantidade];
			
			for(int i = 0; i < quantidade; i++) {
				System.out.printf("Digite o nome do %d° produto: ", i + 1);
				String nome = sc.next();
				
				System.out.printf("Digite o valor do %d° produto: ", i + 1);
				double valor = sc.nextDouble();
				
				produtos[i] = new Product(nome, valor);
			}
			
			double soma = 0.0;
			for(int i = 0; i < produtos.length; i++) {
				soma += produtos[i].getPrice();
			}
			
			double media = soma / produtos.length;
			System.out.printf("Media de preços = %.2f%n", media);
			
			System.out.print("Para cadastrar novos produtos digite s: ");
			option = sc.next();
			
		} while(option.equals("s") || option.equals("S"));
		
		System.out.println("Fim");
		
		sc.close();
	}

}
