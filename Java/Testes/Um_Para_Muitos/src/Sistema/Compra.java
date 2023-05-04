package Sistema;

import java.util.ArrayList;

public class Compra {
	
	ArrayList<Cliente> cliente = new ArrayList<>();
	ArrayList<Item> itens = new ArrayList<>();

	double obterValotTotal() {
		double total = 0;
		for(Item item : itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}
	
}
