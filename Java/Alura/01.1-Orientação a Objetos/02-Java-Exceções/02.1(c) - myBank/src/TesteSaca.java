
public class TesteSaca {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 343);
		
		conta.deposita(200);
		conta.saca(210);
		
		System.out.println(conta.getSaldo());

	}

}
