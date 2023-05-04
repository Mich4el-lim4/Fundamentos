package baytebank1MyMethods;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDoMichael = new Conta();
		
		contaDoMichael.deposita(23);
		System.out.println("Valor da conta do Michael " + contaDoMichael.saldo);
		
		//boolean withdrawalMade = contaDoMichael.saca(10);
		//System.out.println(contaDoMichael.saldo);
		//System.out.println(withdrawalMade);
		
		Conta contaDaAna = new Conta();
		contaDaAna.deposita(1000);
		System.out.println("Valor da conta do Ana " + contaDaAna.saldo);
		
		contaDaAna.transfere(300, contaDoMichael);
		System.out.println("Valor da conta do Michael " + contaDoMichael.saldo);
		System.out.println("Valor da conta do Ana " + contaDaAna.saldo);

	}

}
