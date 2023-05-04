package onlineBusiness;

import java.util.ArrayList;

public class Purchase {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	
	double getValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantity * item.price;
		}
		return total;
	}
}
