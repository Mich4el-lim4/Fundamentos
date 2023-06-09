package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Client cliente;
		
		char novoCliente;
		System.out.print("deseja abrir uma conta? ");
		char resposta = sc.next().charAt(0);
		System.out.println();
		
		if(resposta == 's') {
			
			do {
				
				System.out.print("Digite o numero da conta: ");
				int numeroConta = sc.nextInt();

				System.out.print("Digite o nome do titular: ");
				String titular = sc.next();

				System.out.print("Deseja faser um deposito (y/n): ");
				resposta = sc.next().charAt(0);
				
				if (resposta == 'y') {
					System.out.print("Entre com o valor de deposito inicial: ");
					double valorInicial = sc.nextDouble();
					cliente = new Client(numeroConta, titular, valorInicial);
				} else {
					cliente = new Client(numeroConta, titular);
				}
				
				System.out.println();
				System.out.print("Numero da conta: " + cliente.getNumeroConta());
				System.out.print("\nTitular: " + cliente.getNomeTitular());
				System.out.print("\nExtrato: " + cliente.getValue());

				System.out.println("\n");
				System.out.print("Valor para deposito: ");
				double valorDeposito = sc.nextDouble();
				cliente.deposit(valorDeposito);

				System.out.print("Saldo atual: " + cliente.getValue());

				System.out.println("\n");
				System.out.print("Valor a sacar: ");
				double saque = sc.nextDouble();
				cliente.saca(saque);
				
				System.out.println();
				System.out.println();
				System.out.print("Nova conta? (s/n): ");
				novoCliente = sc.next().charAt(0);
				System.out.println();
				
			} while (novoCliente == 's');
			
		}
		
		System.out.println("Processo encerrado!!!");

		sc.close();
	}

}
