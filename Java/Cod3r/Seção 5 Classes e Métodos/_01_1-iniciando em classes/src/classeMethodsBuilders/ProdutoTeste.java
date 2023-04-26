package classeMethodsBuilders;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.87;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double finalPrice = p1.preco * (1 - p1.desconto);
		double finalPrice2 = p2.preco * (1 - p2.desconto);
		double cartAverage = (finalPrice + finalPrice2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f", cartAverage);
		
	}

}
