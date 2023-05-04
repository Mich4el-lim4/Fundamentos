package baytebank1MyMethods;

public class Conta {

	double saldo;
	int agencia;
	int numero;
	String titular;
	
	void deposita(double valor) {
		saldo = saldo + valor;
	}
 
	public double saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
		}
		return valor;
	}

	public void transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			destino.deposita(this.saca(valor));
		}
	}
	
}
