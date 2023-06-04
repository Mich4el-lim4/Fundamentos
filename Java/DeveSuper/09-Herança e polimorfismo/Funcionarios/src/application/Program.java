package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Para adicionar um funcionario digite 1");
		int option = sc.nextInt();

		switch (option) {
		case 1:
			System.out.println("Terserizado?(s/n): ");
			String terserizado = sc.next();
			System.out.println("Digite o nome: ");
			String name = sc.next();
			break;

		default:
			break;
		}
		
		sc.close();
	}

}
