
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String mensagem =  """
                           Olá, mundo!
                           Este é um Text Block.
                           Ele permite escrever textos com múltiplas linhas
                           sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                           """;
        System.out.println(mensagem);

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        nome = "João";
        int aulas = 4;

        mensagem = """
                   Olá, %s!
                   Boas vindas ao curso de Java.
                   Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                   """.formatted(nome, aulas);

        System.out.println(mensagem);
    }
}