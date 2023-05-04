package application;

import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cadastro de produtos");
		System.out.println("Digite as especificações do produto");
		
		System.out.print("Digite o nome do produto: ");
		String name = sc.next();
		
		System.out.print("Digite o valor do produto: ");
		int value = sc.nextInt();
		
		System.out.print("Digite a quantidade de produtos: ");
		int amount = sc.nextInt();

		Product product = new Product(name, value, amount);
		
		System.out.println(product.takeList());
		
		
		sc.close();
	}

}
