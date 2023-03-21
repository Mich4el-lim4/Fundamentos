
public class ContaCorrente extends Conta {

	private double taxa = 0.20;
	
	public ContaCorrente(int agencia, int numeroConta) {
		super(agencia, numeroConta);
	}
  	
	@Override
	public boolean saca(double valor) {
		double saqueMaisTaxa = valor + taxa;
		
		System.out.println();
		System.out.println("Saque de R$ " + valor + ", mais taxa de R$ " + taxa + ". totalizando R$ " 
										+ saqueMaisTaxa + ", realizado com sucesso");	
		System.out.println();
		
		return super.saca(saqueMaisTaxa);
	}

	@Override
	public void deposita(double valor) {
			super.saldo += valor;
			System.out.println("Deposito de " + valor + "R$ realizado com sucesso");
			System.out.println();
	}
	
}
