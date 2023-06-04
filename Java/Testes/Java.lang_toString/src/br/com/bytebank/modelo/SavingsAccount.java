package br.com.bytebank.modelo;

public class SavingsAccount extends Conta {
	
	public SavingsAccount(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	
	@Override
	public String toString() {
		return "Conta poupança: " + super.toString();
	}

}
