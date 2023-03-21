import java.util.Locale;

public class DataOutput {

	public static void main(String[] args) {
		
		double x = 10.35784;
		
		System.out.println();
		System.out.println("Com ponto");
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		Locale.setDefault(Locale.US);
		
		System.out.println();
		System.out.println("Com vírgula");
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println();
		System.out.println("Formatação de saida");
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}
