package comida;

public class Jantar {

	public static void main(String[] args) {
		
		Snack lunch = new Snack("Arroz", 0.180);
		Snack haveDinner = new Snack("Feijão", 0.300);
		
		Pessoa pessoa = new Pessoa("João", 99.8);
		
		System.out.println(pessoa.apresentar());
		pessoa.comer(lunch);
		
		System.out.println(pessoa.apresentar());
		pessoa.comer(haveDinner);
		
		System.out.println(pessoa.apresentar());
		
	}

}
