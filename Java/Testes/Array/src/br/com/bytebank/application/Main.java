package br.com.bytebank.application;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.CurrentAccount;
import br.com.bytebank.modelo.InsufficientBalanceException;
import br.com.bytebank.modelo.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		SavingsAccount savings = new SavingsAccount(22, 1234);
		CurrentAccount current = new CurrentAccount(33, 1324);
		contas[0] = savings;
		contas[1] = current;
		
		savings.deposita(200);
		current.deposita(150);
		
		System.out.println();
		System.out.println("Valor da conta poupança: " + savings.getSaldo());
		System.out.println("Valor da conta corrente: " + current.getSaldo());
		
		//current.transfere(139, savings);
		try {
			current.saca(150);			
		} catch(InsufficientBalanceException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println();
		System.out.printf("Valor da conta poupança: %.2f%n", savings.getSaldo());
		System.out.printf("Valor da conta corrente: %.2f", current.getSaldo());
		System.out.println();
		System.out.println();
		System.out.println(contas[0]);
		System.out.println(contas[1]);

	}

}
