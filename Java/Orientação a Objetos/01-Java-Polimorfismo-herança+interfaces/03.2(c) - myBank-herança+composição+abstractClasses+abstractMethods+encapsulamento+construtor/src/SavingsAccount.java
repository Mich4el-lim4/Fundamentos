
public class SavingsAccount extends Conta {

	public SavingsAccount(int agencia, int numeConta) {
		super(agencia, numeConta);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
}
