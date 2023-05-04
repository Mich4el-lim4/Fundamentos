package onlineBusiness2;

import java.util.Collection;

import onlineBusiness.Item;

public class Main {

	public static void main(String[] args) {
		
		Purchase compra1 = new Purchase();
		compra1.cliente.addAll((Collection<? extends Cliente>) new Item("Caneta", 5, 1.50));
		

	}

}
