package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestArrayReferencias {

	public static void main(String[] args) {
		
		ContaCorrente[] contas = new ContaCorrente[5];
		ContaCorrente cc1 = new ContaCorrente(22, 33);
		
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(22, 43);
		contas[1] = cc2;
		
		System.out.println(contas[1].getAgencia());

	}

}
