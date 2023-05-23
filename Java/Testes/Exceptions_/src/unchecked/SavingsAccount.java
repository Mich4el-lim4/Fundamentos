package unchecked;

public class SavingsAccount extends Conta {
	
	public SavingsAccount(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

}
