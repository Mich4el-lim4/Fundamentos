public class Conta {
	private double saldo;
	private int agencia;
	private int numeroConta;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numeroConta) {
		Conta.total ++;
		this.setAgencia(agencia);
		this.setNumeroConta(numeroConta);
		System.out.println("***** Conta criada com sucesso *****");
		System.out.println("Numero da agencia: " + this.getAgencia());
		System.out.println("Numero da conta: " + this.getNumeroConta());
		System.out.println();
	}
	
	public void totalContas() {
		Conta.getTotal();
	}
	
	public void deposita(double valor){
		this.saldo += valor;
		System.out.println("Deposito de " + valor + "R$ realizado com sucesso");
		System.out.println();
	}
	
	public void saca(double valor){
		if(this.saldo < valor) {
			throw new SaldoException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino){
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public void status() {
		System.out.println("---------------------STATUS------------------------");
		System.out.println("Numero da agencia: " + this.getAgencia());
		System.out.println("Numero da conta: " + this.getNumeroConta());
		System.out.println("Saldo atual: " +  this.getSaldo());
		System.out.println("Titular da conta: " + this.getTitular().getNome());

	}

	public static int getTotal() {
		return Conta.total;
	}

	public static void setTotal(int total) {
		Conta.total = total;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia < 0) {
			System.out.println("Numero menor que zero (0)");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		if(numeroConta < 0) {
			System.out.println("Numero menor que zero (0)");
			return;
		}
		this.numeroConta = numeroConta;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
}