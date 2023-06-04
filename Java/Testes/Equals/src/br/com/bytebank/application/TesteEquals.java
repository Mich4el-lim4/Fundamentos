package br.com.bytebank.application;

import java.util.ArrayList;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.CurrentAccount;

public class TesteEquals {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new CurrentAccount(22, 34);
		Conta cc2 = new CurrentAccount(22, 33);
		Conta cc3 = new CurrentAccount(22, 32);
		
		lista.add(cc);
		lista.add(cc2);
		lista.add(cc3);
		
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe? " + existe);

	}

}
