package application;

public class Program {

	public static void main(String[] args) {
		
		String[] vetor = new String[] {"Maria", "Ana", "Alex"};
		
		for(int i = 0; i < vetor.length; i ++) {
			System.out.println(vetor[i]);
		}
		
		System.out.println("---------------");
		
		for(String nomes : vetor) {
			System.out.println(nomes);
		}

	}

}
