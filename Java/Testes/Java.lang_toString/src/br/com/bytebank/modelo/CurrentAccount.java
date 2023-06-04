package br.com.bytebank.modelo;

public class CurrentAccount extends Conta {

	public CurrentAccount(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) {
		double sacar = valor + 0.02;
		super.saca(sacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente, " + super.toString();
	}
	
}
