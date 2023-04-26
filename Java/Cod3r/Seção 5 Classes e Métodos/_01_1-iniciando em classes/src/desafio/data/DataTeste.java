package desafio.data;

public class DataTeste {

	public static void main(String[] args) {
		
		Data birthday = new Data();
		birthday.dia = 22;
		birthday.mes = 3;
		birthday.ano = 1993;
		
		Data marriage = new Data();
		marriage.dia = 11;
		marriage.mes = 3;
		marriage.ano = 2004;
		
		int anoMarriage = marriage.ano;
		int anoBirthday = birthday.ano;
		
		System.out.printf("Dia do casamento, %d\n", marriage.dia);
		System.out.printf("Ano do casamento, %d\n", anoMarriage);
		
		System.out.printf("Dia do aniversario, %d\n", birthday.dia);
		System.out.printf("Ano do aniversario, %d", anoBirthday);
		
		System.out.println();
		System.out.printf("Data do aniversario %s", birthday.data());
		
		String weddingDate = marriage.data();
		System.out.printf("\nAno do casamento, %s", weddingDate);

	}

}
