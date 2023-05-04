package entities;

import java.util.ArrayList;

public class Product {
	
	public String name;
	public int value;
	public int amount;
	
	public Product(String name, int value, int amount) {
		this.name = name;
		this.value = value;
		this.amount = amount;
	}
	
	ArrayList<Product> product = new ArrayList<>();
	
	public void addProduct() {
		product.add(new Product(name, value, amount));
	}
	
	public String takeList() {
		return product.toString();
		
	}
	
}
