package onlineBusiness;

public class Main {

	public static void main(String[] args) {
		
		Purchase compra1 = new Purchase();
		compra1.cliente = "Diego Henrique";
		compra1.itens.add(new Item("Caneta", 5, 1.50));
		compra1.itens.add(new Item("Borracha", 10, 1.50));
		compra1.itens.add(new Item("Caderno", 3, 15.50));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.getValorTotal());

	}

}
