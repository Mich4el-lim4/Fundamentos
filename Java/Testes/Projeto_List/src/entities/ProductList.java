package entities;

import java.util.ArrayList;

public class ProductList {
	
	ArrayList<Product> product = new ArrayList<>();
	
	public void addProduct(String name, int value, int amount) {
		product.add(new Product(name, value, amount));
	}
	
	public int takeList() {
		return product.size();
	}
	
}
