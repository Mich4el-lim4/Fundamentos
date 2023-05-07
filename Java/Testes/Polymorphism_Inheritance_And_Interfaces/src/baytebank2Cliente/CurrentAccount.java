package baytebank2Cliente;

public class CurrentAccount extends Conta {

	public CurrentAccount(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double sacar = valor + 0.02;
		return super.saca(sacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
}
