package baytebank5composition;

public class Main {

	public static void main(String[] args) {

		Conta contaUm = new Conta();
		
		contaUm.agencia = 132;
		contaUm.numero = 12;
		contaUm.deposita(1000);
		
		System.out.println(contaUm.titular.nome);

	}

}
