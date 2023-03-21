
public class TesteTributavel {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorInposto calculadora = new CalculadorInposto();
		calculadora.registra(cc);
		calculadora.registra(seguro);
		
		System.out.println(calculadora.getTotalImposto());

	}

}
