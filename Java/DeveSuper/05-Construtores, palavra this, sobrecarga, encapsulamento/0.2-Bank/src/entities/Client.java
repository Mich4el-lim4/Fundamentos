package entities;

public class Client {
	
	private int numeroConta;
	private String nomeTitular;
	private double value;
	private double taxa = 5.00;
	
	public Client(int numeroConta, String nomeTitular, double initialDeposit) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposit(initialDeposit);
	}
	
	public Client(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getValue() {
		return value;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getTaxa() {
		return taxa;
	}

	public void deposit(double deposit) { 
		this.value += deposit;
	}
	
	public void saca(double valorSaca) {
		if(value >= valorSaca + taxa) {
			this.value = getValue() - valorSaca - taxa;
			System.out.printf("Valor do saque %.2f, mais taxa %.2f, total de %.2f ", valorSaca, taxa, valorSaca + taxa);
			System.out.println();
		} else {
			System.out.println();
			System.out.println("Valor insuficiente");
			System.out.print("Total em conta: " + getValue());
		}
	}
	
	public String toString() {
		return "Numero da conta: "
				+ getNumeroConta()
				+ ", Titular: "
				+ getNomeTitular()
				+ ", Valor atual R$ "
				+ String.format("%.2f", getValue())
				+ "\n";
	}
	
}
