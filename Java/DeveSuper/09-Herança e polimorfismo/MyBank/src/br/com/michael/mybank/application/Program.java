package br.com.michael.mybank.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.michael.mybank.entities.Conta;
import br.com.michael.mybank.entities.Titular;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Conta> list = new ArrayList<Conta>();
		
		Integer option;
		do {
			System.out.println("------------------opç---------------------");
			System.out.println("1 - Para criar uma conta, digite 1");
			System.out.println("2 - Quantidade de contas criadas, digite 2");
			System.out.println("3 - Para sair, digite 4");
			System.out.println();
			System.out.print("Opção desejada: ");
			option = sc.nextInt();
			
			switch (option) {
			case 1:
				System.out.print("Digite o nome: ");
				String nome = sc.next();
				System.out.print("Digite o CPF: ");
				String cpf = sc.next();
				System.out.print("Digite o numero da conta: ");
				Integer conta = sc.nextInt();
				System.out.print("Digite o numero da agencia: ");
				Integer agen = sc.nextInt();
				System.out.print("Gostaria de faser um deposito inicial?(s/n): ");
				sc.nextLine();
				char depositoInicial = sc.next().charAt(0);
				
				Titular cliente = new Titular(nome, cpf);
				
				if(depositoInicial == 's') {
					System.out.println("Valor do deposito inicial: ");
					double valorDepositoInicial = sc.nextDouble();
					list.add(new Conta(conta, agen, cliente, valorDepositoInicial));
				} else if(depositoInicial == 'n') {
					list.add(new Conta(conta, agen, cliente));
				}
				break;
				
			case 2:
				System.out.println();
				System.out.println("Quantidade de contas criadas: " + Conta.getTotal());
				System.out.println();
				break;
				
			default:
				break;
			}
			
		}while(option != 4);
		
		System.out.println();
		System.out.println("Operação finalizada");
		
		sc.close();
	}

}
