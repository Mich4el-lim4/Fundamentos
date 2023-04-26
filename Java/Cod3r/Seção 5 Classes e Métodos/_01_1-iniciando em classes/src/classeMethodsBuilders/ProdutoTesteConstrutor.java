package classeMethodsBuilders;

public class ProdutoTesteConstrutor {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook");
		p1.preco = 4356.87;
		Produto.desconto = 0.25;
		
		var p2 = new Produto("Caneta Preta");
		p2.preco = 12.56;
		Produto.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double finalPrice = p1.precoComDescont();
		double finalPrice2 = p2.precoComDesconto(0.1);
		double cartAverage = (finalPrice + finalPrice2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f", cartAverage);
		
	}

}
