package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Client cliente;

		int option;
		char resposta;

		do {

			System.out.print("deseja abrir uma nova conta? ");
			resposta = sc.next().charAt(0);
			System.out.println();

			if (resposta == 's') {

				System.out.print("Digite o numero da conta: ");
				int numeroConta = sc.nextInt();

				System.out.print("Digite o nome do titular: ");
				String titular = sc.next();

				cliente = new Client(numeroConta, titular);

				do {
					System.out.println("-------- opç --------");
					System.out.println("Digite 1 para deposito");
					System.out.println("Digite 2 para saque");
					System.out.println("Digite 3 para status da conta");
					System.out.println("Digite 4 para sair");
					System.out.print("Option: ");
					option = sc.nextInt();
					System.out.println();

					if (option == 1) {
						System.out.print("Valor para deposito: ");
						double valorDeposito = sc.nextDouble();
						cliente.deposit(valorDeposito);
					} else if (option == 2) {
						System.out.print("Valor a sacar: ");
						double saque = sc.nextDouble();
						cliente.saca(saque);
					} else if (option == 3) {
						System.out.println(cliente.toString());
					}

				} while (option != 4);
			}

		} while (resposta == 's');

		System.out.println("Processo encerrado!!!");

		sc.close();
	}

}
