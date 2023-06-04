package br.com.michael.mybank.entities;

public class Conta {

	private Integer conta;
	private Integer agencia;
	private double saldo;
	private Titular cliente;
	private static Integer total = 0;

	public Conta(Integer numero, Integer agencia, Titular cliente) {
		Conta.total ++;
		this.conta = numero;
		this.agencia = agencia;
		this.cliente = cliente;
	}
	
	public Conta(Integer numero, Integer agencia, Titular cliente, Double valor) {
		Conta.total ++;
		this.conta = numero;
		this.agencia = agencia;
		this.cliente = cliente;
		this.saldo = valor;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}

	public void saque(Double valor) {
		this.saldo -= valor;
	}

	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer numero) {
		this.conta = numero;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	private Titular getCliente() {
		return cliente;
	}
	
	public static Integer getTotal() {
		return Conta.total;
	}
	
	
	
	@Override
	public String toString() {
		return "Cliente: " + getCliente() + "\nSaldo: " + getSaldo() + 
				"\nAgencia: " + getAgencia() +
				"\nConta: " + getConta();
	}

	

}
