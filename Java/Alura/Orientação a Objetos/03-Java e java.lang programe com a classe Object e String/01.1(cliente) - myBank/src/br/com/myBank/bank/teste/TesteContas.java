package br.com.myBank.bank.teste;

import br.com.myBank.bank.modelo.Cliente;
import br.com.myBank.bank.modelo.Conta;
import br.com.myBank.bank.modelo.ContaCorrente;
import br.com.myBank.bank.modelo.SavingsAccount;

public class TesteContas {

	public static void main(String[] args) {
		
		Cliente eduardo = new Cliente();
		eduardo.setNome("Eduardo");
		
		Cliente maria = new Cliente();
		maria.setNome("Maria");
		
		ContaCorrente cc = new ContaCorrente(1111, 3333);
		cc.setTitular(eduardo);
		cc.deposita(100);
		
		SavingsAccount sa = new SavingsAccount(3232, 3232);
		sa.setTitular(maria);
		sa.deposita(200);
		
		cc.transfere(10, sa);
		cc.status();
		sa.status();
		
		cc.saca(10);
		cc.status();
		
		Conta.getTotal();

	}

}
